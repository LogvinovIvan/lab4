/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Draw;

import java.awt.Graphics;
import Shape1.Arc;
import Shape1.Shape;

/**
 *
 * @author Иван
 */
public class DrawingArc implements IDrawShape{
    
    @Override
    public void paint(Graphics g, Shape shape) {
        Arc arc = (Arc) shape;
        g.drawArc(arc.x1, arc.y1, arc.x2, arc.y2,arc.x3,arc.y3);
    }
    
}
