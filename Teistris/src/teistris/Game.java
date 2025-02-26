/*
 * Copyright (C) 2019 Antonio de Andrés Lema
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package teistris;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

public class Game {

    public final static int SQUARE_SIDE = 20;

    public final static int MAX_X = 180; // Ancho del panel

    public final static int MAX_Y = 180; // Alto del panel

    private Piece currentPiece;

    private MainWindow mainWindow;

    private Timer timer;

    private ArrayList<Square> groundSquares; // Para almacenar los cuadrados que forman el suelo
    private boolean paused;
    private int numberOfLines; // Para contar las líneas completadas

    public Game(MainWindow mainWindow) {

        this.mainWindow = mainWindow;

        this.groundSquares = new ArrayList<>(); // Inicializa la lista del suelo

        this.createNewPiece();

        startGameLoop();

    }

    private void startGameLoop() {

        timer = new Timer(500, new ActionListener() { // Intervalo de 500 ms

            @Override

            public void actionPerformed(ActionEvent e) {

                movePieceDown();

            }

        });

        timer.start();

    }

    public void movePieceRight() {

        if (currentPiece.canMoveTo(currentPiece.getX() + 20, currentPiece.getY())) {

            currentPiece.moveBy(20, 0);

        }

    }

    public void movePieceLeft() {

        if (currentPiece.canMoveTo(currentPiece.getX() - 20, currentPiece.getY())) {

            currentPiece.moveBy(-20, 0);

        }

    }

    public void movePieceDown() {

        if (!currentPiece.moveDown()) {

            addPieceToGround();

            createNewPiece();

        }

    }

    private void createNewPiece() {

        this.currentPiece = new Piece(this, 80, 0); // Posición inicial

    }

    private void addPieceToGround() {

        for (Square square : currentPiece.getSquares()) {

            groundSquares.add(square); // Agrega cada cuadrado al suelo

        }

    }

    public boolean isValidPosition(int x, int y) {

        // Verifica si la posición está dentro de los límites y no está ocupada
        for (Square square : groundSquares) {

            if (square.getX() == x && square.getY() == y) {

                return false; // La posición está ocupada

            }

        }

        return x >= 0 && x < MAX_X && y >= 0 && y < MAX_Y;

    }

    private void checkAndClearLines() {

        for (int y = MAX_Y - SQUARE_SIDE; y >= 0; y -= SQUARE_SIDE) {

            boolean fullLine = true;

            for (int x = 0; x < MAX_X; x += SQUARE_SIDE) {

                if (!isSquareOccupied(x, y)) {

                    fullLine = false;

                    break;

                }

            }

            if (fullLine) {

                clearLine(y);

                numberOfLines++;

                mainWindow.showNumberOfLines(numberOfLines); // Actualiza el número de líneas en la interfaz

            }

        }

    }

    private boolean isSquareOccupied(int x, int y) {

        for (Square square : groundSquares) {

            if (square.getX() == x && square.getY() == y) {

                return true; // Hay un cuadrado en esta posición

            }

        }

        return false;
    } // No

    public MainWindow getMainWindow() {

        return mainWindow;

    }

    public void setPaused(boolean selected) {

        this.paused = selected; // Cambia el estado de pausa

        if (selected) {

            timer.stop(); // Detiene el temporizador

        } else {

            timer.start(); // Reinicia el temporizador

        }

    }

    void rotatePiece() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void clearLine(int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
