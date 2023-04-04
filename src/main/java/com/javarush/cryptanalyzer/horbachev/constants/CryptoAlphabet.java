package com.javarush.cryptanalyzer.horbachev.constants;

public class CryptoAlphabet {

    private static final String lettersUpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String getLettersLowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String numbers = "0123456789";
    private static final String symbols = ".,\"\":-!? ";
    public static String ALPHABET = lettersUpperCase + getLettersLowerCase + numbers + symbols;
}
