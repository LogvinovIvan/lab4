/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw;

import java.awt.Graphics;
import Shape1.Rectangle;
import Shape1.Shape;

/**
 *
 * @author Иван
 */
public class DrawingRectangle implements IDrawShape {

    @Override
    public void paint(Graphics g, Shape shape) {
        Rectangle rect = (Rectangle) shape;
        g.drawRect(rect.x1, rect.y1, rect.x2, rect.y2);
    }
}
