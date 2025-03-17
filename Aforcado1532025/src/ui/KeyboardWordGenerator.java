/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.io.Console;

/**
 *
 * @author pedri
 */
class KeyboardWordGenerator implements WordGenerator{
 @Override
    public String generateWord() throws GenerateWordException {
        Console console = System.console(); // Obtén a consola
        String word;

        if (console != null) {
            // Se a consola está dispoñible, usa readPassword para ocultar a entrada
            char[] passwordArray = console.readPassword("Introduce a palabra a adiviñar: ");
            word = new String(passwordArray); // Convértese a String
        } else {
            // Se non hai consola, pide a entrada normalmente
            System.out.print("Introduce a palabra a adiviñar: ");
            word = new java.util.Scanner(System.in).nextLine(); // Lê a entrada do teclado
        }

        return word; // Retorna a palabra introducida
    }
}
