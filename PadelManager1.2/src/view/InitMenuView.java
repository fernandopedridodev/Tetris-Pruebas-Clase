/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.InitMenuController;
import java.util.Scanner;

/**
 *
 * @author fernando.pedridomarino
 */
public class InitMenuView {
     private InitMenuController controller;

    /**
     * Construtor da clase InitMenuView.
     * 
     * @param controller O controlador co que se comunica esta vista.
     */
    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
    }

    /**
     * Mostra unha mensaxe de erro indicando que as credenciais introducidas non son correctas.
     */
    public void showInvalidUser() {
        System.out.println("Erro: O ID ou contrasinal son incorrectos.");
    }

    /**
     * Mostra o menú de inicio de sesión. Pide ao usuario o seu ID e contrasinal.
     * 
     * @return true se o usuario decide saír, false se continúa coa sesión.
     */
    public boolean showLoginMenu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce o teu ID (deixa baleiro para saír): ");
        String id = scanner.nextLine();
        
        if (id.isEmpty()) {
            System.out.println("Saíndo da aplicación...");
            return true; // Indica que o usuario quere saír
        }

        System.out.print("Introduce o teu contrasinal: ");
        String password = System.console() != null ? new String(System.console().readPassword()) : scanner.nextLine();

        controller.login(id, password);
        return false; // Continúa a aplicación
    }
}
