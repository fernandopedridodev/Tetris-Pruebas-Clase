/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Random;

/**
 *
 * @author pedri
 */
public class ArrayWordGenerator implements WordGenerator{
       private static final String[] WORDLIST = {"java", "python", "javascript", "hangman", "programming"};


    public String generateWord() {

        Random random = new Random();

        int index = random.nextInt(WORDLIST.length);

        return WORDLIST[index];

    }

}
