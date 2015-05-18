/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import Draw.DrawingFillRecatngle;
import Draw.IDrawShape;


/**
 *
 * @author Иван
 */
public class FillRecatangleFactory implements IFactory{
  @Override
    public IDrawShape createShape() {
        return new DrawingFillRecatngle(); //To change body of generated methods, choose Tools | Templates.
    }   
}
