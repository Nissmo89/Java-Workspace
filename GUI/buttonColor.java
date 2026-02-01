import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;
import javax.swing.JFrame; // JFrame and JButton are part of Swing, but commonly used with AWT layouts
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class test {
       public static Color randColor() {
           Random rand = new Random();
           return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
       }

       
        public static void main(String arg[]) {
        JFrame frame = new JFrame("Button Visibility Test");
        JButton btn = new JButton("Click to change color");
        final int THICK = (int)btn.getBorder().getBorderInsets(btn).top*2;
        frame.setLayout(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints();
        btn.setBackground(randColor());
        frame.add(btn,gbc); 
        frame.setSize(800, 670);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.getBorder();

        try{
        btn.addActionListener(e ->{
          Color color;
          color = randColor();
          btn.setBackground(color);
          btn.setBorder(BorderFactory.createLineBorder(color, THICK)); // Blue border, 2 pixels thick
          
        });
      }catch(Exception e){
        System.err.println("may crashed while changing btn color");
      }

      frame.setVisible(true); 


    }
}
