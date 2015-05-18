/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Shape1;

import java.awt.Graphics;
import java.util.List;


/**
 *
 * @author Иван
 */
public class Ellipse implements Shape{
    public int x1, y1, x2, y2;
    public static int countDot = 2;
    public static String key = "Элипс";    
    @Override
    public void init(List<Integer> list) {
        this.x1=list.get(0);
        this.y1=list.get(1);
        this.x2=list.get(2)-list.get(0);
        this.y2=list.get(3)-list.get(1);
    }
    
}
