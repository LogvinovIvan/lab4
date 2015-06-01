/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serialization;

import Shape1.Ellipse;
import Shape1.FillRectangle;
import Shape1.Line;
import Shape1.Rectangle;
import Shape1.Shape;
import Shape1.Triangle;
import Shape1.baseShape;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.List;

/**
 *
 * @author Иван
 */
public class XmLSerialization {
    XStream xStream;
    public XmLSerialization() {
        xStream = new XStream(new DomDriver());
        xStream.setMode(XStream.NO_REFERENCES);
        //xStream.alias("Line", Line.class);
        //xStream.alias("Rectangle", Rectangle.class);
        //xStream.alias("Ellipse", Ellipse.class);
        //xStream.alias("Triangle", Triangle.class);
        //xStream.alias("FillReactangle", FillRectangle.class);
        
    }
    
    public String converte(List<baseShape> shapes)
    {
        String xml = xStream.toXML(shapes);
        return xml;
    }
}
