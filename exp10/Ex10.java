/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author affrin
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JButton redButton = new JButton ("Red");
    final JButton greenButton = new JButton ("Green");
    final JButton blueButton = new JButton ("Blue");

    class Listener extends JPanel implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            Color color;
            if (event.getSource() == redButton){
                color = Color.red;
                redButton.setBackground(color);
                panel.setBackground(color);//To set panel background instead of frames background
            } else if (event.getSource() == greenButton){
                color = Color.green;
                greenButton.setBackground(color);
                panel.setBackground(color);
            } else {
                color = Color.blue;

                blueButton.setBackground(color);
                panel.setBackground(color);  
            }
            setBackground(color);
            System.out.println(color);
            repaint();
        }          
    }

    redButton.addActionListener(new Listener());
    greenButton.addActionListener(new Listener());
    blueButton.addActionListener(new Listener());

    panel.add(redButton);
    panel.add(greenButton);
    panel.add(blueButton);
    frame.add(panel);      
frame.setVisible(true);


}

}

  
