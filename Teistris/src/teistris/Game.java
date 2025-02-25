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
/**
 * Clase que implementa o comportamento do xogo do Tetris
 * @author Profe de Programación
 */
public class Game {


    public final static int SQUARE_SIDE = 20;

    public final static int MAX_X = 160;

    public final static int MAX_Y = 220;

    private Piece currentPiece;

    private MainWindow mainWindow;

    private Timer timer;


    public Game(MainWindow mainWindow) {

        this.mainWindow = mainWindow;

        this.createNewPiece();

        startGameLoop();

    }


    private void startGameLoop() {

        timer = new Timer(300, new ActionListener() { // Cambia 500 a 300 para mayor velocidad

        @Override

        public void actionPerformed(ActionEvent e) {

            movePieceDown();

        }

    });

    timer.start();

}


    public void movePieceRight() {

        if (currentPiece.canMoveTo(currentPiece.getX() + 1, currentPiece.getY())) {

            currentPiece.moveBy(1, 0);

        }

    }


    public void movePieceLeft() {

        if (currentPiece.canMoveTo(currentPiece.getX() - 1, currentPiece.getY())) {

            currentPiece.moveBy(-1, 0);

        }

    }
private int linesCleared = 0;


void movePieceDown() {

    if (!currentPiece.moveDown()) {

        addPieceToGround();

        createNewPiece();

        linesCleared++;

        adjustSpeed();

    }

}


private void adjustSpeed() {

    if (linesCleared % 5 == 0) { // Cada 5 líneas, aumenta la velocidad

        int newDelay = Math.max(100, timer.getDelay() - 50); // Reduce el delay, pero no menos de 100 ms

        timer.setDelay(newDelay);

    }

}


    private void createNewPiece() {

        this.currentPiece = new Piece(this, 80, 0); // Posición inicial

    }


    private void addPieceToGround() {

        currentPiece.addPieceToGround();

    }


    public boolean isValidPosition(int x, int y) {

        return x >= 0 && x < MAX_X && y >= 0 && y < MAX_Y;

    }


    public MainWindow getMainWindow() {

        return mainWindow;

    }

    void setPaused(boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void rotatePiece() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}