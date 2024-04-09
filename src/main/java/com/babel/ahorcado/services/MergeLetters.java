package com.babel.ahorcado.services;

import org.springframework.stereotype.Service;

@Service
public class MergeLetters implements IMergeLetters {
    @Override
    public String mergeLetters(String old, String add) {
        String newWord = "";
        for (int i = 0; i < add.length(); i++){
            char c1 = old.charAt(i);
            char c2 = add.charAt(i);
            if (c1 != '_' ){
                newWord += c1;
            } else if (c2 != '_') {
                newWord += c2;
            } else {
                newWord += c1;
            }
        }
        return newWord;
    }
}
