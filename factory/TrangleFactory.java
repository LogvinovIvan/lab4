/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import Draw.DrawingTriangle;
import Draw.IDrawShape;


/**
 *
 * @author Иван
 */
public class TrangleFactory implements  IFactory{
     @Override
    public IDrawShape createShape() {
        return new DrawingTriangle(); //To change body of generated methods, choose Tools | Templates.
    }
}
