
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

public class Ardoise extends JPanel {
	
	static final long serialVersionUID = 1;
	
	private boolean possedeDisque = true;

	public Ardoise() {
		setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(200, 150));
	} 

	public void setPossedeDisque(boolean possedeDisque) {
		this.possedeDisque = possedeDisque;
 	}

	public void dessiner(Graphics g) {
		g.setColor(Color.RED);	
		g.fillOval(60, 35, 80, 80);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (possedeDisque) dessiner(g);
 	}
}