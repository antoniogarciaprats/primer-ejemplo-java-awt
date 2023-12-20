package com.mycompany.javaawtexample;

import java.awt.*;

 public class JavaAWTExample extends Frame {
    
    JavaAWTExample () {
        Button btn = new Button("click me");
        btn.setBounds(30, 100, 80, 30);
        this.add(btn);
        
        this.setSize ( 300, 250);
        this.setTitle("Primer Ejemplo");
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main (String args[]) {
        JavaAWTExample f = new JavaAWTExample();
    }

    
    
}