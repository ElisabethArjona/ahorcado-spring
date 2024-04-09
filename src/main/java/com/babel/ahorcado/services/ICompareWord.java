package com.babel.ahorcado.services;

import org.springframework.stereotype.Service;

@Service
public interface ICompareWord {

    public boolean compareWord(String word, String userInput);

    public boolean compareLetter(String word, String userInput);
}
