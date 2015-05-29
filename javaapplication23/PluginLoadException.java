/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

/**
 *
 * @author Иван
 */
public  class PluginLoadException extends Exception {

    public PluginLoadException(String s) {
    System.out.print(s);
    }
    
    public PluginLoadException (Exception e)
    {
        System.err.println(e.getLocalizedMessage());
    }


    
}
