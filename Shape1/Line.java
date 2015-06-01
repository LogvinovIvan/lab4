/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Shape1;



import java.util.List;


/**
 *
 * @author Иван
 */
public class Line extends baseShape implements Shape{
private int x1, y1, x2, y2;
   private static String key = "Линия";
   public static int countDot = 2;

    @Override
    public void init(List<Integer> list) {
        this.x1=list.get(0);
        this.y1=list.get(1);
        this.x2=list.get(2);
        this.y2=list.get(3);
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public int getCountDot() {
        return countDot;
    }
    
    public int getX1()
{
    return this.x1;
}
    
    public int getX2()
{
    return this.x2;
}
    
    public int getY1()
{
    return this.y1;
}
    
    public int getY2()
{
    return this.y2;
}
}
