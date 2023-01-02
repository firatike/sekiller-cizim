/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekilller;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Fırat
 */
public class MakingPolylines extends JFrame implements MouseListener{
    int x,y;
    ArrayList<Integer> alX=new ArrayList<>();
    ArrayList<Integer> alY=new ArrayList<>();
    
    public static void main(String[] args) {
        new MakingPolylines();
    }
    
    public MakingPolylines(){
        setSize(700,500);
        setTitle("ÇİZİM");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        
        alX.add(x);
        alY.add(y);
        
        Graphics g=getGraphics();
        g.fillRect(x-3, y-3, 6, 6);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        int[] xArray=new int[alX.size()];
        int[] yArray=new int[alY.size()];
        
        for (int i = 0; i < alX.size(); i++) {
            xArray[i]=alX.get(i);
            yArray[i]=alY.get(i);
        }
        
        Graphics g2=getGraphics();
        g2.drawPolygon(xArray,yArray,alX.size());
    }
}
