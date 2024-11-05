/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practice.mavenproject1;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author n0tArias
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        JFrame MyJFrame = new JFrame("MyJFrame");
        
        JLabel MyJLabel = new JLabel("Hola mundo");
        MyJFrame.add(MyJLabel);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setSize(200, 100);
        MyJFrame.setVisible(true);
    }
}
