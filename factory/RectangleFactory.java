/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import Draw.DrawingRectangle;
import Draw.IDrawShape;
import java.util.List;
import Shape1.Shape;


/**
 *
 * @author Иван
 */
public class RectangleFactory implements IFactory{
     @Override
    public IDrawShape createShape() {
        return new DrawingRectangle(); //To change body of generated methods, choose Tools | Templates.
    }

  
}
