/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.InitMenuView;
import db.PadelManagerDB;
import model.PadelCourt;
import model.Player;

/**
 *
 * @author fernando.pedridomarino
 */
public class InitMenuController {
     private InitMenuView view;

    /**
     * Construtor da clase InitMenuController.
     * Crea unha nova vista para o menú inicial.
     */
    public InitMenuController() {
        this.view = new InitMenuView(this);
    }

    /**
     * Inicia a aplicación mostrando o menú de inicio de sesión.
     * O bucle continúa ata que o usuario decida saír.
     */
    public void initApp() {
        while (!view.showLoginMenu());
    }

    /**
     * Verifica as credenciais dun xogador e inicia a súa sesión se son correctas.
     * 
     * @param id       O identificador do xogador.
     * @param password O contrasinal do xogador.
     */
    public void login(String id, String password) {
        Player player = PadelManagerDB.getPlayers().get(id);
        if (player != null && player.getPassword().equals(password)) {
            // Aquí cargariamos a sesión do xogador
            System.out.println("Inicio de sesión exitoso para " + player.getName() + ". Benvido!");
        } else {
            view.showInvalidUser();
        }
    }

    /**
     * Método principal que inicia a execución da aplicación.
     */
    public static void main(String[] args) {
        // Creamos os datos de partida
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5, 25.90);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83, 70);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[] {"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[] {"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[] {"9:00", "11:00"});

        // Engadimos os datos á base de datos
        PadelManagerDB.getPlayers().put(player1.getId(), player1);
        PadelManagerDB.getPlayers().put(player2.getId(), player2);
        PadelManagerDB.getCourts().add(court1);
        PadelManagerDB.getCourts().add(court2);
        PadelManagerDB.getCourts().add(court3);

        // Creamos un obxecto InitMenuController para iniciar a aplicación
        InitMenuController imc = new InitMenuController();
        imc.initApp();
    }
}
