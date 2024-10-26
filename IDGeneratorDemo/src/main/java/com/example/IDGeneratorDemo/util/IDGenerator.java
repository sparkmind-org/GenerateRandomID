package com.example.IDGeneratorDemo.util;



import java.security.SecureRandom;

public class IDGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int LETTER_COUNT = 4;
    private static final int DIGIT_COUNT = 5;
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomID() {
        StringBuilder id = new StringBuilder();

        for (int i = 0; i < LETTER_COUNT; i++) {
            id.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }

        for (int i = 0; i < DIGIT_COUNT; i++) {
            id.append(random.nextInt(10));
        }

        return id.toString();
    }
}
