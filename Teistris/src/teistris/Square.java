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
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Square {


    private int x, y;

    private JLabel lblSquare;

    private Color fillColor;


    public Square(int x, int y, Color fillColor, Game game) {

        this.x = x;

        this.y = y;

        this.fillColor = fillColor;


        lblSquare = new JLabel();

        lblSquare.setBackground(fillColor);

        lblSquare.setBounds(x, y, Game.SQUARE_SIDE, Game.SQUARE_SIDE);

        lblSquare.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        lblSquare.setVisible(true);

        lblSquare.setOpaque(true);


        game.getMainWindow().drawSquare(this.lblSquare);

    }


    public int getX() {

        return x;

    }


    public int getY() {

        return y;

    }


    public void moveBy(int dx, int dy) {

        this.x += dx;

        this.y += dy;

        lblSquare.setBounds(this.x, this.y, Game.SQUARE_SIDE, Game.SQUARE_SIDE);

        lblSquare.repaint();

    }

}

