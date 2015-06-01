/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serialization;

import Shape1.Line;
import Shape1.Shape;
import Shape1.baseShape;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Иван
 */
public class XmlDesirialization {
Map<String,Shape> shapeClasses;
XStream xstream;
    public XmlDesirialization() {
      shapeClasses = new HashMap<String, Shape>();
      xstream = new XStream(new DomDriver());
      
    }
    
    public List<baseShape> converteToShape(String xml)
    {
        List<baseShape> bShape = (List<baseShape>)xstream.fromXML(xml);
        
        return bShape;
    }

    public Map<String,Shape> getInformMap()
    {
        return shapeClasses;
    }

}
