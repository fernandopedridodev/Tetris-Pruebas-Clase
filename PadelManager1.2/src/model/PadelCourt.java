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
    protected String[] bookingHours;

    /**
     * Construtor da clase PadelCourt.
     * 
     * @param number       Número identificador da pista.
     * @param type         Tipo de pista (SINGLE ou DOUBLE).
     * @param bookingHours Array coas horas dispoñibles para reservas.
     */
    public PadelCourt(int number, int type, String[] bookingHours) {
        this.number = number;
        this.type = type;
        this.bookingHours = bookingHours;
    }

    // Métodos de acceso (getters e setters)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[] getBookingHours() {
        return bookingHours;
    }

    public void setBookingHours(String[] bookingHours) {
        this.bookingHours = bookingHours;
    }
}