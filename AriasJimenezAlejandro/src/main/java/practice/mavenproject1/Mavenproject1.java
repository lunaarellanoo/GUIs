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
        JFrame marco = new JFrame("MyJFrame");
        Container contenedor = marco.getContentPane();
        contenedor.setLayout(new FlowLayout());
        JLabel field = new JLabel("Hola mundo");
        contenedor.add(field);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(200, 100);
        marco.setVisible(true);
    }
}
