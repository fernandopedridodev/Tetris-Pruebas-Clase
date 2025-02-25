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

/**
 * Clase que implementa a peza cadrada do xogo do Tetris
 *
 * @author Profe de Programación
 */
public class Piece {


    private Game game;

    private Square[] squares;


    public Piece(Game game, int x, int y) {

        this.game = game;

        squares = new Square[4];

        // Configuración de la pieza en forma de línea

        for (int i = 0; i < 4; i++) {

            squares[i] = new Square(x + i, y, Color.BLUE, game); // Cuadrados en línea horizontal

        }

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

        if (canMoveTo(getX(), getY() + 1)) {

            moveBy(0, 1);

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


    public void addPieceToGround() {

        for (Square square : squares) {

        }

    }

}