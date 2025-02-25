/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;


public class MenuGenerator {

    public HangMan hangMan;


    private String showInitMenu() {

        WordGenerator wordGenerator = new WordGenerator();

        return wordGenerator.generateWord();

    }


    private void showGameMenu() {

        Scanner scanner = new Scanner(System.in);

        while (!hangMan.isGameOver()) {

            System.out.println("Palabra: " + hangMan.showHiddenWord());

            System.out.println("Fallos: " + hangMan.getStringFails());

            System.out.print("Introduce una letra: ");

            char guess = scanner.nextLine().charAt(0);

            hangMan.tryChar(guess);

        }


        if (hangMan.maxFailsExceeded()) {

            System.out.println("Perdiste! La palabra era: " + hangMan.showFullWord());

        } else {

            System.out.println("¡Ganaste! La palabra era: " + hangMan.showFullWord());

        }

    }


    private boolean showExitMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Quieres jugar otra partida? (s/n): ");

        char response = scanner.nextLine().charAt(0);

        return response == 'n' || response == 'N';

    }


    public static void main(String[] args) {

        MenuGenerator menuGenerator = new MenuGenerator();

        

        do {

            menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());

            menuGenerator.showGameMenu();   

        } while (!menuGenerator.showExitMenu());

    }

}