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

import java.awt.*;
import java.util.HashSet;
import java.util.Set;


public class Piece {


    private Game game;

    private Square[] squares;
     private Set<Point> occupiedPositions; // Para almacenar posiciones ocupadas

    public Piece(Game game, int x, int y) {

        this.game = game;

        squares = new Square[4];
        this.occupiedPositions = new HashSet<>(); // Inicializa el conjunto de posiciones ocupadas

         // Configuración de la pieza en forma de cuadrado 2x2

    for (int i = 0; i < 2; i++) { // Dos filas

            for (int j = 0; j < 2; j++) { // Dos columnas

                int newX = x + j * Game.SQUARE_SIDE;

                int newY = y + i * Game.SQUARE_SIDE;

                Point position = new Point(newX, newY); // Crea un objeto Point para la posición


                // Verifica si la posición ya está ocupada

                if (!occupiedPositions.contains(position)) {

                    squares[i * 2 + j] = new Square(newX, newY, Color.BLUE, game);

                    occupiedPositions.add(position); // Marca la posición como ocupada

                }
        }

    }

    }
    public Square[] getSquares() {

        return squares; // Devuelve los cuadrados de la pieza

    }


    public int getX() {

        return squares[0].getX(); // Suponiendo que todas las partes de la pieza tienen la misma coordenada x

    }


    public int getY() {

        return squares[0].getY(); // Suponiendo que todas las partes de la pieza tienen la misma coordenada y

    }


    public void moveBy(int dx, int dy) {

        for (Square square : squares) {

            square.moveBy(dx, dy);

        }

    }


    public boolean moveDown() {

        if (canMoveTo(getX(), getY() + Game.SQUARE_SIDE)) {

            moveBy(0, Game.SQUARE_SIDE);

            return true;

        }

        return false;

    }


    public boolean canMoveTo(int newX, int newY) {

        for (Square square : squares) {

            if (!game.isValidPosition(newX, newY)) {

                return false;

            }

        }

        return true;

    }

}