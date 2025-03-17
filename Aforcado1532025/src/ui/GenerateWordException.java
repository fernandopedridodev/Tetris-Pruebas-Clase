/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author pedri
 */
class GenerateWordException extends Exception {
    private boolean visible; // Atributo para saber se a mensaxe debe ser visible

    // Construtor que recibe a mensaxe e a visibilidade
    public GenerateWordException(String message, boolean visible) {
        super(message); // Chama ao construtor da superclase Exception
        this.visible = visible; // Almacena a visibilidade
    }

    // Método de acceso para o atributo visible
    public boolean isVisible() {
        return visible;
}
}