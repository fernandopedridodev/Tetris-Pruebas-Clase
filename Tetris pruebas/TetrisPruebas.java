package tetris.pruebas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.awt.*;
import java.util.Random;

public class Tetromino {
    Point[] shape;  // Representa la forma del tetromino con puntos relativos
    int x, y;       // Posición actual en el campo de juego
    private int rotation = 0;

    private final Point[][] shapes = {
            {new Point(0, 0), new Point(1, 0), new Point(0, 1), new Point(1, 1)}, // Cuadrado
            {new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2)}, // Línea
            {new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(0, 1)}, // T
            {new Point(-1, 1), new Point(0, 1), new Point(0, 0), new Point(1, 0)}  // Z
    };

    public Tetromino() {
        Random random = new Random();
        shape = shapes[random.nextInt(shapes.length)];
        x = 4; y = 0;  // Posición inicial
    }

    public void rotate() {
        for (Point p : shape) {
            int temp = p.x;
            p.x = p.y;
            p.y = -temp;
        }
    }

    public void rotateBack() {
        for (Point p : shape) {
            int temp = p.x;
            p.x = -p.y;
            p.y = temp;
        }
    }
}
