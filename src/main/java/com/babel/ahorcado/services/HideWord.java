package com.babel.ahorcado.services;

import org.springframework.stereotype.Service;

@Service
public class HideWord implements IHideWord {
    @Override
    public String hideAll(String word) {
        String hideWord = "";
        for (char c : word.toCharArray()){
            hideWord += "_";
        }
        return hideWord;
    }

    @Override
    public String hidePart(String word, String userInput) {
        String hideWord = "";
        char charUserInput = userInput.charAt(0);
        for (char c : word.toCharArray()){
            if (c == charUserInput){
                hideWord += c;
            } else{
                hideWord += "_";
            }
        }
        return hideWord;
    }
}
