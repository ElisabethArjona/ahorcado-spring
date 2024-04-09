package com.babel.ahorcado.services;

import com.babel.ahorcado.models.ListWords;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserManagerService implements IUserManagerService {

    private final IKeyboardInputService keyboardInputService;

    private final IHideWord iHideWord;

    private final ICompareWord iCompareWord;
    private final IMergeLetters iMergeLetters;

    private String selectedWord;

    public UserManagerService(IKeyboardInputService keyboardInputService, IHideWord hideWord, ICompareWord compareWord, IMergeLetters mergeLetters){
        this.keyboardInputService = keyboardInputService;
        this.iHideWord = hideWord;
        this.iCompareWord = compareWord;
        this.iMergeLetters = mergeLetters;
    }

    public int menu() {
        int option;
        do {
            System.out.println(" -- MENU --");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            option = keyboardInputService.requestInt("Introduzca la opcion deseada: ");
        } while ((option < 0) || (option > 2));
        return option;
    }

    public void play(){
        selectWord();
        boolean end = false;
        int numErrors = 8;
        String hideWord = iHideWord.hideAll(selectedWord);

        do{
            System.out.println(hideWord);
            String userInput = keyboardInputService.requestString("Introduce una letra o la palabra").toUpperCase();
            if (!userInput.isEmpty()){
                if (userInput.length() > 1){
                    end = iCompareWord.compareWord(selectedWord,userInput);
                    if(!end){
                        numErrors--;
                        System.out.println("ERROR -1 intento \n Te quedan: " + numErrors);
                    } else {
                        System.out.println("FELICIDADES HAS GANADO");
                    }
                } else{
                    if (iCompareWord.compareLetter(selectedWord,userInput)){
                        String newHideWord = iHideWord.hidePart(selectedWord,userInput);
                        hideWord = iMergeLetters.mergeLetters(hideWord,newHideWord);
                        end = iCompareWord.compareWord(selectedWord,hideWord);
                        if(end){
                            System.out.println("FELICIDADES HAS GANADO");
                        }
                    } else {
                        numErrors--;
                        System.out.println("ERROR -1 intento \n Te quedan: " + numErrors);
                    }
                }
            }
        } while (!end && numErrors != 0);
    }

    private void selectWord() {
        ListWords listWords = new ListWords();
        ArrayList<String> arrayList = listWords.getWords();
        int aleatory = (int)(Math.random()*arrayList.size());
        this.selectedWord = arrayList.get(aleatory);
    }
}
