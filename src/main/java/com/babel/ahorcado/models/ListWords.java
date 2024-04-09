package com.babel.ahorcado.models;

import java.util.ArrayList;

public class ListWords {
    private ArrayList<String> words;

    public ListWords(){
        ArrayList<String> auxiliarWords = new ArrayList<>();
        auxiliarWords.add("Hola".toUpperCase());
        auxiliarWords.add("Bombilla".toUpperCase());
        auxiliarWords.add("Bate".toUpperCase());
        auxiliarWords.add("Huella".toUpperCase());
        auxiliarWords.add("Morir".toUpperCase());
        auxiliarWords.add("Hoy".toUpperCase());
        auxiliarWords.add("Quino".toUpperCase());
        auxiliarWords.add("Manija".toUpperCase());
        auxiliarWords.add("Jirafa".toUpperCase());
        auxiliarWords.add("Primo".toUpperCase());
        this.words = auxiliarWords;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }
}
