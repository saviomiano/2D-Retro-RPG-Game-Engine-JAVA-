//
//Rpg game
//Author: Savio Miano
//26/06/26
//

//images
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Visual Panel
class GamePanel extends JPanel {
	//loads once
	//Images from flaticon.com
	private final Image skull = new ImageIcon("src/image/skull.png").getImage();
    private final Image level = new ImageIcon("src/image/level-up.png").getImage();
    private final Image boss = new ImageIcon("src/image/boss.png").getImage();
    private final Image x = new ImageIcon("src/image/x.png").getImage();
    private final Image village = new ImageIcon("src/image/house.png").getImage();
    private final Image xpath = new ImageIcon("src/image/line.png").getImage();
    private final Image ypath = new ImageIcon("src/image/VLine.png").getImage();
//override default and focus on this panel
@Override protected void paintComponent(Graphics g) {
	  //soft reset
      super.paintComponent(g);
      // Visual Box
      g.setColor(Color.BLACK);
      g.drawRect(87, 75, 500, 400);
      //Pin
      g.setColor(Color.RED);
      g.fillOval(123, 95, 15, 15);
      g.setColor(Color.GRAY);
      g.fillOval(126, 115, 10, 10);
      g.setColor(Color.BLACK);
      g.drawLine(131, 110, 131, 120);
      //Obstacles
      g.drawLine(87, 150, 450, 150);
      g.drawLine(587, 225, 224, 225);
      g.drawLine(87, 300, 450, 300);
      g.drawLine(587, 375, 224, 375);
      	//Paths
        //1X
		for (int pathX = 137; pathX < 330; pathX += 15) {
			g.drawImage(xpath, pathX, 115, 10, 10, this);
		}
		for (int pathX = 347; pathX < 520; pathX += 15) {
			g.drawImage(xpath, pathX, 115, 10, 10, this);
		}
		//1Y
		for (int pathY = 132; pathY < 190; pathY += 15) {
			g.drawImage(ypath, 530, pathY, 10, 10, this);
		}
		//2X
		for (int pathX = 142; pathX < 315; pathX += 15) {
			g.drawImage(xpath, pathX, 195, 10, 10, this);
		}
		for (int pathX = 355; pathX < 522; pathX += 15) {
			g.drawImage(xpath, pathX, 195, 10, 10, this);
		}
		//2Y
		for (int pathY = 210; pathY < 255; pathY += 15) {
			g.drawImage(ypath, 130, pathY, 10, 10, this);
		}
		//3X
		for (int pathX = 150; pathX < 325; pathX += 15) {
			g.drawImage(xpath, pathX, 268, 10, 10, this);
		}
		for (int pathX = 347; pathX < 520; pathX += 15) {
			g.drawImage(xpath, pathX, 268, 10, 10, this);
		}
		//3Y
		for (int pathY = 285; pathY < 340; pathY += 15) {
			g.drawImage(ypath, 530, pathY, 10, 10, this);
		}
		//4X
		for (int pathX = 142; pathX < 315; pathX += 15) {
			g.drawImage(xpath, pathX, 345, 10, 10, this);
		}
		for (int pathX = 355; pathX < 522; pathX += 15) {
			g.drawImage(xpath, pathX, 345, 10, 10, this);
		}
		//4Y
		for (int pathY = 360; pathY < 410; pathY += 15) {
			g.drawImage(ypath, 130, pathY, 10, 10, this);
		}
		//5X
		for (int pathX = 150; pathX < 325; pathX += 15) {
			g.drawImage(xpath, pathX, 428, 10, 10, this);
		}
		for (int pathX = 347; pathX < 515; pathX += 15) {
			g.drawImage(xpath, pathX, 428, 10, 10, this);
		}
      //Images
      g.drawImage(x, 332, 115, 10, 10, this);
      g.drawImage(skull, 525, 107, 20, 20, this);
      g.drawImage(x, 530, 195, 10, 10, this);
      g.drawImage(level, 327, 188, 20, 20, this);
      g.drawImage(x, 130, 195, 10, 10, this);
      g.drawImage(skull, 125, 260, 20, 20, this);
      g.drawImage(x, 332, 268, 10, 10, this);
      g.drawImage(village, 523, 260, 25, 25, this);
      g.drawImage(x, 530, 345, 10, 10, this);
      g.drawImage(level, 327, 338, 20, 20, this);
      g.drawImage(x, 130, 345, 10, 10, this);
      g.drawImage(skull, 125, 418, 20, 20, this);
	  g.drawImage(x, 332, 428, 10, 10, this);
	  g.drawImage(boss, 515, 415, 40, 40, this);
    }
}


//main class
//extending makes the frame and panel work properly
public class Dungeon extends JFrame {
	public static void main(String[] args){
		//layout window and gamepanel
		Dungeon frame = new Dungeon();
		GamePanel gamePanel = new GamePanel();
		frame.add(gamePanel);
		frame.setSize(700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}