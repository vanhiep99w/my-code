/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class Ex03 extends JFrame{
    private final String title = "Ex03";
    private List<Color> colors = Arrays.asList(Color.RED,Color.CYAN,Color.ORANGE,Color.gray,Color.yellow);
    private JButton button =null;
    private JPanel pnMain = null;
    
    public Ex03() {
        initComponent();
        addEvent();
    }
    
    public static void main(String[] args) {
        Ex03 test = new Ex03();
        test.initMainUI();
    }
    
    private void initComponent() {
        Container con = getContentPane();
        pnMain = new JPanel();
        pnMain.setLayout(null);
        
        button = new JButton("Stop");
        button.setBounds(200, 100,(int) button.getPreferredSize().getWidth(), (int)button.getPreferredSize().getHeight());
       
        pnMain.add(button);
        
        con.add(pnMain);
    }

    public void initMainUI() {
        setTitle(title);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addEvent() {
        
        Random rd = new Random();
        
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnMain.setBackground(colors.get(rd.nextInt(colors.size())));
            }
        });
        timer.start();
        
        
        
         pnMain.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseEntered(MouseEvent e) {
//                 try {
//                     pnMain.setBackground(colors.get(rd.nextInt(colors.size())));
//                     Thread.sleep(100);
//                 } catch (InterruptedException ex) {
//                     Logger.getLogger(Ex03.class.getName()).log(Level.SEVERE, null, ex);
//                 }
                 
             }    

            
            
         } );
    }
    
}
