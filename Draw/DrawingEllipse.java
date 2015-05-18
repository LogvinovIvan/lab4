/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Draw;

import java.awt.Graphics;
import Shape1.Ellipse;
import Shape1.Shape;

/**
 *
 * @author Иван
 */
public class DrawingEllipse implements IDrawShape{
    

    @Override
    public void paint(Graphics g, Shape shape) {
        Ellipse ellipse = (Ellipse) shape;
        g.drawOval(ellipse.x1, ellipse.y1, ellipse.x2, ellipse.y2);
    }
    
     
}
