package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        System.out.print("Insira a palavra: ");
        palavra = scanner.next();
        System.out.println(contarPares(palavra));
    }

    private static final int totalLetras = 26;
    private static boolean anagram(String str1, String str2) {
        int[] countA = new int[totalLetras];
        int[] countB = new int[totalLetras];

        for (char letter : str1.toCharArray()) {
            countA[letter - 'a']++;
        }
        for (char letter : str2.toCharArray()) {
            countB[letter - 'a']++;
        }

        for (int i = 0; i < totalLetras; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }
        return true;
    }
    private static int contarPares(String text) {
        int count = 0;

        List<String> subsets = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 1; j <= text.length() - i; j++) {
                subsets.add(text.substring(i, i + j));
            }
        }

        for (int i = 0; i < subsets.size(); i++) {
            for (int j = i + 1; j < subsets.size(); j++) {
                String s1 = subsets.get(i);
                String s2 = subsets.get(j);
                if (i != j &&
                        s1.length() == s2.length() &&
                        anagram(s1, s2)) {
                    count++;
                }
            }
        }
        return count;
    }

}