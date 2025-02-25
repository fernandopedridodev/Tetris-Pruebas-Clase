/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.ArrayList;


public class HangMan {

    private static final int MAX_FAILS = 6;

    private HiddenWord hiddenWord;

    private ArrayList<Character> fails;


    public HangMan(String word) {

        this.hiddenWord = new HiddenWord(word);

        this.fails = new ArrayList<>();

    }


    public ArrayList<Character> getFails() {

        return fails;

    }


    public String getStringFails() {

        StringBuilder failString = new StringBuilder();

        for (char fail : fails) {

            failString.append(fail).append(" ");

        }

        return failString.toString().trim();

    }


    public String showHiddenWord() {

        return hiddenWord.show();

    }


    public String showFullWord() {

        return hiddenWord.showFullWord();

    }


    public void tryChar(char c) {

        if (!hiddenWord.checkChar(c)) {

            fails.add(c);

        }

    }


    public boolean isGameOver() {

        return maxFailsExceeded() || hiddenWord.isVisible();

    }


    public boolean maxFailsExceeded() {

        return fails.size() >= MAX_FAILS;

    }

}