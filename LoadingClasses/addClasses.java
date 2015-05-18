/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoadingClasses;

import Draw.IDrawShape;
import Shape1.Shape;
import factory.IFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Иван
 */

public class addClasses {
private ModuleLoader loader;
    public addClasses() {
    loader = new ModuleLoader(ClassLoader.getSystemClassLoader());
    }
   
    
    
    public List<IFactory> addFactoryModules(String path) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        path += File.separator+"Factorys";
        loader.initPath(path);
        File dir = new File(path);
        String[] modules = dir.list();
        List<IFactory> list = new ArrayList<>();
        for (String module : modules) {
            String moduleName = module.split(".class")[0];
            Class clazz = loader.loadClass(moduleName);
            list.add((IFactory)clazz.newInstance());
        }
    return list;
    }
    public List<Shape> addShapeModules(String path) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        path+=File.separator+"Shapes";
        loader.initPath(path);
        File dir = new File(path);
        String[] modules = dir.list();
        List<Shape> list = new ArrayList<>();
        for (String module : modules) {
            String moduleName = module.split(".class")[0];
            Class clazz = loader.loadClass(moduleName);
            list.add((Shape)clazz.newInstance());
        }
    return list;
    }
    
    
    public List<IDrawShape> addDrawingModules(String path) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        path+=File.separator+"DrawingShapes";
        loader.initPath(path);
        File dir = new File(path);
        String[] modules = dir.list();
        List<IDrawShape> list = new ArrayList<>();
        for (String module : modules) {
            String moduleName = module.split(".class")[0];
            Class clazz = loader.loadClass(moduleName);
            list.add((IDrawShape)clazz.newInstance());
        }
      return list;
    }
}
