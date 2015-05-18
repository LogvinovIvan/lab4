/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Draw;

import java.awt.Graphics;
import Shape1.Line;
import Shape1.Shape;

/**
 *
 * @author Иван
 */
public class DrawingLine implements IDrawShape{
   

    @Override
    public void paint(Graphics g, Shape shape) {
       Line line = (Line) shape;
        g.drawLine(line.x1, line.y1, line.x2, line.y2);
        int a= 1;
    }
}
