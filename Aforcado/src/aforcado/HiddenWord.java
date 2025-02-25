/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 *
 * @author fernando.pedridomarino
 */
public class HiddenWord {

    private char[] characters;

    private boolean[] hits;


    public HiddenWord(String word) {

        this.characters = word.toCharArray();

        this.hits = new boolean[characters.length];

    }


    public boolean checkChar(char c) {

        boolean found = false;

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] == c) {

                hits[i] = true;

                found = true;

            }

        }

        return found;

    }


    public String show() {

        StringBuilder displayedWord = new StringBuilder();

        for (int i = 0; i < characters.length; i++) {

            if (hits[i]) {

                displayedWord.append(characters[i]);

            } else {

                displayedWord.append('-');

            }

        }

        return displayedWord.toString();

    }


    public String showFullWord() {

        return new String(characters);

    }


    public boolean isVisible() {

        for (boolean hit : hits) {

            if (!hit) {

                return false;

            }

        }

        return true;

    }

}