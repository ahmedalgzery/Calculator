
package com.mycompany.calaculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author الجزبرى
 */
public class MAIN {
    public static void main(String[] args) {
        Main_Frame f = new Main_Frame();
        JTextField t1;
        t1 = new JTextField("0.0");
        t1.setLayout(new GridLayout());

        t1.setSize(331, 74);
        t1.setBackground(Color.darkGray);
        t1.setForeground(Color.white);
        Font myFont = new Font("Courier", Font.BOLD, 30);
        t1.setFont(myFont);

        button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23,
                b24;
        b1 = new button("%");
        b1.setLocation(0, 75);
        b2 = new button("CE");
        b2.setLocation(83, 75);
        b3 = new button("C");
        b3.setLocation(166, 75);
        b4 = new button("DEL");
        b4.setLocation(249, 75);

        b5 = new button("10^x");
        b5.setLocation(0, 125);
        b6 = new button("^");
        b6.setLocation(83, 125);
        b7 = new button("sqr");
        b7.setLocation(166, 125);
        b8 = new button("/");
        b8.setLocation(249, 125);
        b9 = new button("7");
        b9.setLocation(0, 175);
        b10 = new button("8");
        b10.setLocation(83, 175);
        b11 = new button("9");
        b11.setLocation(166, 175);
        b12 = new button("*");
        b12.setLocation(249, 175);
        b13 = new button("4");
        b13.setLocation(0, 225);
        b14 = new button("5");
        b14.setLocation(83, 225);
        b15 = new button("6");
        b15.setLocation(166, 225);
        b16 = new button("-");
        b16.setLocation(249, 225);
        b17 = new button("1");
        b17.setLocation(0, 275);
        b18 = new button("2");
        b18.setLocation(83, 275);
        b19 = new button("3");
        b19.setLocation(166, 275);
        b20 = new button("+");
        b20.setLocation(249, 275);

        b21 = new button("-/+");
        b21.setLocation(0, 325);
        b22 = new button("0");
        b22.setLocation(83, 325);
        b23 = new button(".");
        b23.setLocation(166, 325);
        b24 = new button("=");
        b24.setLocation(249, 325);
        b24.setBackground(Color.BLACK);

        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);
        f.add(b21);
        f.add(b22);
        f.add(b23);
        f.add(b24);

    }
}
