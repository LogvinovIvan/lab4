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
         g.drawLine(triangle.getX1(), triangle.getY1(), triangle.getX2(), triangle.getY2());
         g.drawLine(triangle.getX1(), triangle.getY1(), triangle.getX3(), triangle.getY3());
         g.drawLine(triangle.getX2(), triangle.getY2(), triangle.getY3(), triangle.getX3());
        
    }
    
}
