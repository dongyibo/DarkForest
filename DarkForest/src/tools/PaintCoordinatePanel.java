package tools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

import civilization.GalaxyThread;

public class PaintCoordinatePanel extends JPanel implements Runnable{
	public ArrayList<GalaxyThread> theGalaxy=new ArrayList<GalaxyThread>();
	private Image iBuffer;
	private Graphics gBuffer;
	private Graphics pBuffer;
	
	public PaintCoordinatePanel(ArrayList<GalaxyThread> g){
		this.theGalaxy=g;
		
		this.setBackground(Color.BLACK);
		
		repaint();
	}
	
	public void run(){

	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		if(iBuffer==null){
			iBuffer=createImage(this.getSize().width,this.getSize().height);
			gBuffer=iBuffer.getGraphics();
		}
		
		gBuffer.setColor(getBackground());
		gBuffer.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
		gBuffer.setColor(Color.WHITE);
		for(GalaxyThread ga:theGalaxy){
			int[] coordinate=ga.myParameter.getCoordinate();
			gBuffer.fillOval(coordinate[0],coordinate[1], 10, 10);
		}
		
		g.drawImage(iBuffer, 0, 0, this);
	}
}
