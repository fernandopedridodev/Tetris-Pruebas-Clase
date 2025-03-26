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
abstract class Booking {

    protected Date date;
    protected String hour;
    protected PadelCourt court;

    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    public Date getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public PadelCourt getCourt() {
        return court;
    }

    /**
     * Definimos os metodos abstractos getPrice, isCompleted, containsPlayer,
     * getDescription e addPlayer
     */
    public abstract double getPrice();

    public abstract boolean isCompleted();

    public abstract boolean containsPlayer(String id);
           
    abstract void getDescription();

    abstract void addPlayer();

}


