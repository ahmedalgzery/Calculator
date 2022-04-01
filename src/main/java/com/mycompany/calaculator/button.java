
package com.mycompany.calaculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

/**
 *
 * @author الجزبرى
 */
public class button extends JButton {
   public button(String name) {
      this.setBackground(Color.darkGray);
      this.setForeground(Color.WHITE);
      this.setText(name);
      this.setSize(82, 50);

      Font myFont = new Font("Courier", Font.BOLD, 20);
      this.setFont(myFont);
   }
}
