/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;


import java.util.ArrayList;
import java.util.HashMap;
import model.Booking;
import model.PadelCourt;
import model.Player;

/**
 *
 * @author fernando.pedridomarino
 */
public class PadelManagerDB {
  private static final HashMap<String, Player> players = new HashMap<>();
  private static final ArrayList<PadelCourt> courts = new ArrayList<>();
  private static final ArrayList<Booking> bookings = new ArrayList<>();
  
  
  public static HashMap<String, Player> getPlayers(){
      return players;
  }
  public static ArrayList<PadelCourt> getCourts(){
      return courts;
  }
  public static ArrayList<Booking> getBookings(){
      return bookings;
  }

}
