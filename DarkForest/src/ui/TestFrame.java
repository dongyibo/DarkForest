package ui;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import civilization.GalaxyThread;

public class TestFrame extends JFrame implements Runnable{

	private JPanel contentPane;
	ArrayList<GalaxyThread> theGalaxy=null;
	JTextArea textArea=null;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TestFrame frame = new TestFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public TestFrame(ArrayList<GalaxyThread> g) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 414, 342);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(67, 10, 258, 322);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		setVisible(true);
		
		theGalaxy=g;
	}
	
	public void run(){
		while(true){			
			textArea.setText("");
			
			for(GalaxyThread g:theGalaxy){
				if(g.myParameter.getWhetherHaveCivilization()){
					textArea.append(g.getMyName()+"\n"+
									"资源："+g.myParameter.getResourse()+"\n"+
									"人口："+g.myParameter.getPopularity()+"\n"+
									"科技："+g.myParameter.getCulturePoint()+"\n"+
									"文化："+g.myParameter.getCulturePoint()+"\n"+
									"工业："+g.myParameter.getCulturePoint()+"\n");
					
					textArea.paintImmediately(getBounds());
				}
			}
		}	
	}
}
