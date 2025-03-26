/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fernando.pedridomarino
 * Implementa as pistas de padel individual e de parellas, ademáis dos horarios
 * dispoñibles.
 */
public class PadelCourt {

    public static final int SINGLE = 1;
    public static final int DOUBLE = 2;
    protected int number;
    protected int type;
    /**
     * Array de string para reservar as pistas
     */
    protected String[] bookingHours = {"9:00", "11:30", "13:00"};

    public PadelCourt(int number, int type) {
        this.number = number;
        this.type = type;
    }

    public static int getSINGLE() {
        return SINGLE;
    }

    public static int getDOUBLE() {
        return DOUBLE;
    }

    public int getNumber() {
        return number;
    }

    public int getType() {
        return type;
    }

    public String[] getBookingHours() {
        return bookingHours;
    }
}