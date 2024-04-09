package com.babel.ahorcado.services;

import org.springframework.stereotype.Service;

@Service
public interface IMergeLetters {
    public String mergeLetters(String old, String add);
}
