/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import Draw.IDrawShape;

/**
 *
 * @author Иван
 */
public interface IFactory {
  public  IDrawShape createShape ();   
}
