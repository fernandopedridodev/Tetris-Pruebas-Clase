/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.HangMan;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
import java.util.Scanner;

public class MenuGenerator {
    public HangMan hangMan;

    private String showInitMenu() {
        Scanner scanner = new Scanner(System.in);
        WordGenerator wordGenerator = null; // Inicializa la variable WordGenerator

        // Muestra el menú para elegir el modo de juego
        System.out.println("Escolle o modo de xogo:");
        System.out.println("1. ArrayWordGenerator");
        System.out.println("2. KeyboardWordGenerator");
        int choice = scanner.nextInt(); // Lê a opción do usuario

        // Instancia a clase correspondente segundo a opción escollida
        switch (choice) {
            case 1:
                wordGenerator = new ArrayWordGenerator();
                break;
            case 2:
                wordGenerator = new KeyboardWordGenerator();
                break;
            default:
                System.out.println("Opción non válida.");
                return ""; // Retorna unha cadena vacía se a opción non é válida
        }

        // Intenta xerar a palabra e captura a excepción se ocorre
        try {
            return wordGenerator.generateWord(); // Invoca o método generateWord
        } catch (GenerateWordException e) {
            // Captura a excepción e mostra a mensaxe se visible é true
            if (e.isVisible()) {
                System.out.println("Erro: " + e.getMessage());
            }
            return ""; // Retorna unha cadena vacía en caso de erro
        }
    }

    private void showGameMenu() {
        Scanner scanner = new Scanner(System.in);

        while (!hangMan.isGameOver()) {
            System.out.println("Palabra: " + hangMan.showHiddenWord());
            System.out.println("Fallos: " + hangMan.getStringFails());
            System.out.print("Introduce unha letra: ");

            char guess = scanner.nextLine().charAt(0);
            hangMan.tryChar(guess);
        }

        if (hangMan.maxFailsExceeded()) {
            System.out.println("Perdiches! A palabra era: " + hangMan.showFullWord());
        } else {
            System.out.println("¡Ganaches! A palabra era: " + hangMan.showFullWord());
        }
    }

    private boolean showExitMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Queres xogar outra partida? (s/n): ");
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