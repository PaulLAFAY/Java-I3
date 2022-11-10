/**
 * @(#)Test.java
 *
 * Test application
 *
 * @author 
 * @version 1.00 2022/3/1
 */
 
import javax.swing.JFrame;

public class Test {
    
    public static void main(String[] args) {
    	
    	/*
    	JFrame cadre = new JFrame("Premiere fenetre");
    	JPanel panneau = new JPanel();
    	
    	panneau.setPreferredSize(new Dimension(250, 150));
    	panneau.setBackground(Color.RED);
    	cadre.setContentPane(panneau);
    	cadre.setLocation(400, 300);
    	cadre.pack();
    	cadre.setVisible(true);
    	cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	*/
    	
    	JFrame cadre = new javax.swing.JFrame("Un disque");
		cadre.setContentPane(new Ardoise());
		cadre.setLocation(400, 300);
		cadre.pack();
		cadre.setVisible(true);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
}
