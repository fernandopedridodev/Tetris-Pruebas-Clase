/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teistris;

/**
 *
 * @author fernando.pedridomarino
 */

public class Point {

    private int x;

    private int y;


    public Point(int x, int y) {

        this.x = x;

        this.y = y;

    }


    @Override

    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Point)) return false;

        Point other = (Point) obj;

        return this.x == other.x && this.y == other.y;

    }


    @Override

    public int hashCode() {

        return 31 * x + y; // Genera un hash basado en las coordenadas

    }

}