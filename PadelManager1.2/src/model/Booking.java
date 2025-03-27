/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author fernando.pedridomarino
 */
public abstract class Booking {
    protected Date date;
    protected String hour;
    protected PadelCourt court;

    /**
     * Construtor da clase Booking.
     * 
     * @param date  Data da reserva.
     * @param hour  Hora da reserva en formato "hh:mm".
     * @param court Pista reservada.
     */
    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    // Métodos de acceso (getters)
    public Date getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public PadelCourt getCourt() {
        return court;
  
}
   public abstract double getPrice();
    public abstract boolean isCompleted();
    public abstract boolean containsPlayer(String playerId);

}

/**
     * Obtén unha descrición da reserva.
     * 
     * @return String cos datos da reserva
     * 
    // Métodos abstractos
    */
     
   
    
    