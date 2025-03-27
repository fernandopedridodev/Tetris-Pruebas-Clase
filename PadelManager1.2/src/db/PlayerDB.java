/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import model.Player;

/**
 *
 * @author fernando.pedridomarino
 */
public class PlayerDB {
    public static Player findByIdAndPasswords(String id, String password) {
        Player player = new PadelManagerDB().getPlayers().get(id);
        return (player != null && player.getPassword().equals(password)) ? player : null;
}
}
