package com.babel.ahorcado.services;

import org.springframework.stereotype.Service;

@Service
public class CompareWord implements ICompareWord {

    @Override
    public boolean compareWord(String word, String userInput) {
        if(word.equalsIgnoreCase(userInput)){
            return true;
        }
        return false;
    }

    @Override
    public boolean compareLetter(String word, String userInput) {
        char letterUserInput = userInput.charAt(0);
        for (char c : word.toCharArray()){
            if (c == letterUserInput){
                return true;
            }
        }
        return false;
    }
}
