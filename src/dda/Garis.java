/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dda;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Baka
 */
public class Garis extends JPanel{
    private int x1,y1,x2,y2;
    
    public int GetX1(){
        return x1;
    }
    
    public int GetY1(){
        return y1;
    }
    
    public int GetX2(){
        return x2;
    }
    
    public int GetY2(){
        return y2;
    }
    
    public void SetX1(int xa){
        x1 = xa;
    }
    
    public void SetY1(int ya){
        y1 = ya;
    }
    
    public void SetX2(int xb){
        x2 = xb;
    }
    
    public void SetY2(int yb){
        y2 = yb;
    }
    
    public void paint(Graphics g){
        int dx = x2-x1;
        int dy = y2-y1;
        int steps,k;
        
        float x = x1;
        float y = y1;
        float x_inc, y_inc;
        
        super.paint(g);
        this.setBackground(Color.black);
        g.setColor(Color.red);
        
        if(Math.abs(dx)>Math.abs(dy))
        {
            steps = Math.abs(dx);
        }
        else
        {
            steps = Math.abs(dy);
        }
        
        x_inc = dx/(float)steps;
        y_inc = dy/(float)steps;
        
        g.drawRect(Math.round(x), Math.round(y), 1, 1);
        
        for(k=0;k<steps;k++) 
        {
            x+=x_inc;
            y+=y_inc;
            g.drawRect(Math.round(x), Math.round(y), 1, 1);
            System.out.println("Titik yang digambar ("+x+","+y+")");
        }
        
        //Gambar string titik awal dan akhir
        g.setColor(Color.green);
        g.drawString("A ("+x1+","+y1+")", x1, y1);
        g.drawString("B ("+x2+","+y2+")", x2, y2);
        
        //Gambar garis koordinat layar
        for(int X=0;X<300;X++)
        {
            g.drawRect(X, 0, 2, 2);
            g.drawString("X+", 300, 15);
            for(int Y=0;Y<300;Y++)
            {
                g.drawRect(0, Y, 2, 2);
                g.drawString("Y+", 5, 300);
                g.setColor(Color.yellow);
            }
            g.setColor(Color.blue);
        }
    }
}