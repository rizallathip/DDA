/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dda;

import javax.swing.JFrame;
import java.util.Scanner;

/**
 *
 * @author Baka
 */
public class DDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Alogaritma Garis DDA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Garis grs = new Garis();
        Scanner in = new Scanner(System.in);
        
        /*Input
        grs.SetX1(10);
        grs.SetY1(20);
        grs.SetX2(100);
        grs.SetY2(60);*/
        
        System.out.println("Masukan x1 : ");grs.SetX1(in.nextInt());
        System.out.println("Masukan y1 : ");grs.SetY1(in.nextInt());
        System.out.println("Masukan x2 : ");grs.SetX2(in.nextInt());
        System.out.println("Masukan y2 : ");grs.SetY2(in.nextInt());
        
        ///Output
        frame.add(grs);
        frame.setSize(600, 480);
        frame.setVisible(true);
    }
    
}
