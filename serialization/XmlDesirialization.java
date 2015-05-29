/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serialization;

import Shape1.Line;
import Shape1.Shape;
import com.thoughtworks.xstream.XStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Иван
 */
public class XmlDesirialization {
Map<String,Class> shapeClasses;
XStream xstream;
    public XmlDesirialization() {
      shapeClasses = new HashMap<String, Class>();
      xstream = new XStream();
    }
    
   
    
    public void addClasses(String key, Class value)
    {
        shapeClasses.put(key, value);
    }


    public Shape converteToShape(String xml)
    {
        String nameClass = xml.substring(xml.indexOf("<"), xml.indexOf("/>"));
        Class clazz = shapeClasses.get(nameClass);
        Shape shape;
        shape = (Shape)xstream.fromXML(xml);
        shape = (clazz)shape;
     return shape;
    }



}
