package javaapplication1;



import Draw.IDrawShape;
import LoadingClasses.ModuleLoader;
import LoadingClasses.addClasses;
import Shape1.Arc;
import Shape1.Ellipse;
import Shape1.FillRectangle;
import Shape1.Line;
import Shape1.Rectangle;
import Shape1.Shape;
import Shape1.Triangle;
import factory.ArcFactory;
import factory.EllipseFactory;
import factory.FillRecatangleFactory;
import factory.IFactory;
import factory.LineFactory;
import factory.RectangleFactory;
import factory.TrangleFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Иван
 */
public class NewJFrame extends javax.swing.JFrame {

    
    
    
    /**
     * Creates new form NewJFrame
     */
    Map<String, IFactory> hm;
    Map<String, Integer> countDot;
    Map<String, Shape> tableShape;
    List<Integer> ListDot;
    
    private int i = 1;

    public NewJFrame() {
        initComponents();
        
        
        
        
        tableShape = new HashMap<>();
        tableShape.put("линия", new Line());
        tableShape.put("элипс", new Ellipse());
        tableShape.put("прямоугольник",new Rectangle());
        tableShape.put("дуга",new Arc());
        tableShape.put("треугольник", new Triangle());
        tableShape.put("прямоугольник 2", new FillRectangle());
        
        
        
        
        hm = new HashMap<>();
        hm.put("линия", new LineFactory());
        hm.put("элипс", new EllipseFactory());
        hm.put("прямоугольник",  new RectangleFactory());
        hm.put("треугольник", new TrangleFactory());
        hm.put("дуга", new ArcFactory());
        hm.put("прямоугольник 2", new FillRecatangleFactory());

        countDot = new HashMap<>();
        countDot.put("линия", Line.countDot);
        countDot.put("элипс", Ellipse.countDot);
        countDot.put("прямоугольник", Rectangle.countDot);
        countDot.put("треугольник", Triangle.countDot);
        countDot.put("дуга", Arc.countDot);
        countDot.put("прямоугольник 2", FillRectangle.countDot);

        ListDot = new ArrayList<>();

        choice1.add("линия");
        choice1.add("элипс");
        choice1.add("прямоугольник");
        choice1.add("треугольник");
        choice1.add("дуга");
        choice1.add("прямоугольник 2");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        choice1 = new java.awt.Choice();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(702, 400));

        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice1MouseClicked(evt);
            }
        });
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        canvas1.setBackground(new java.awt.Color(255, 255, 255));

        canvas2.setBackground(new java.awt.Color(255, 255, 255));
        canvas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas2MousePressed(evt);
            }
        });

        button1.setLabel("Очистка");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jButton1.setText("Добавить объекты");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_choice1MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        canvas2.update(canvas2.getGraphics());
        ListDot.clear();
        i = 1;
    }//GEN-LAST:event_button1ActionPerformed

    private void canvas2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas2MousePressed
        // TODO add your handling code here:
        if (i < countDot.get(choice1.getSelectedItem())) {
            ListDot.add(evt.getX());
            ListDot.add(evt.getY());
            i++;
        } else {
            ListDot.add(evt.getX());
            ListDot.add(evt.getY());
            IFactory s = hm.get(choice1.getSelectedItem());
            Shape shape = tableShape.get(choice1.getSelectedItem());
            shape.init(ListDot);
            IDrawShape drawShape = s.createShape();
            drawShape.paint(canvas2.getGraphics(), shape);
            ListDot.clear();
            i = 1;
        }
    }//GEN-LAST:event_canvas2MousePressed

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        // TODO add your handling code here:
        ListDot.clear();
        i = 1;
    }//GEN-LAST:event_choice1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            addClasses classes = new addClasses();
            List<IFactory> list1 = classes.addFactoryModules("B:\\Plugins");
            List<IDrawShape> list2 = classes.addDrawingModules("B:\\Plugins");
            IDrawShape iDrawShape = list1.get(0).createShape();
            List<Shape> list3 = classes.addShapeModules("B:\\Plugins");
            for(int i = 0; i<list1.size(); i++)
            {
                String Key = list3.get(i).getKey();
                choice1.add(Key);
                tableShape.put(Key, list3.get(i));
                countDot.put(Key, list3.get(i).getCountDot());
                hm.put(Key, list1.get(i));
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
      }
       
    
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
