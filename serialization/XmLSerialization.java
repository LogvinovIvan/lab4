/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serialization;

import Shape1.Shape;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Иван
 */
public class XmLSerialization {
    XStream xStream;
    public XmLSerialization() {
        xStream = new XStream(new DomDriver());
    }
    
    public String converte(Shape shape)
    {
        String xml = xStream.toXML(shape);
        return xml;
    }
}
