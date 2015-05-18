/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Draw;

import java.awt.Graphics;
import Shape1.Shape;
import Shape1.Triangle;

/**
 *
 * @author Иван
 */
public class DrawingTriangle implements IDrawShape{
    
   

    @Override
    public void paint(Graphics g, Shape shape) {
        Triangle triangle = (Triangle) shape;
         g.drawLine(triangle.x1, triangle.y1, triangle.x2, triangle.y2);
         g.drawLine(triangle.x1, triangle.y1, triangle.x3, triangle.y3);
         g.drawLine(triangle.x2, triangle.y2, triangle.x3, triangle.y3);
        
    }
    
}
