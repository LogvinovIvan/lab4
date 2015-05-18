/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Draw;

import java.awt.Graphics;
import Shape1.FillRectangle;
import Shape1.Shape;

/**
 *
 * @author Иван
 */
public class DrawingFillRecatngle implements IDrawShape{
    

    @Override
    public void paint(Graphics g, Shape shape) {
        FillRectangle fillRectangle = (FillRectangle) shape;
        g.fillRoundRect(fillRectangle.getX1(), fillRectangle.getY1(), fillRectangle.getX2(), fillRectangle.getY2(), fillRectangle.getX3(), fillRectangle.getY3());
    }
    
}
