package tools;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

import civilization.GalaxyThread;

public class Space extends JFrame {
	
	//保存创造的恒星系线程
	ArrayList<GalaxyThread> theGalaxy=new ArrayList<GalaxyThread>();
	//需要创造的恒星系线程个数
	private int size=0;
	//创建时间控制线程
	private Era theEra=new Era(theGalaxy);
	private Thread eraThread=new Thread(theEra);
	public PaintCoordinatePanel pc=null;
	
//	private TestFrame myTestFrame=new TestFrame(theGalaxy);
//	private Thread testThread=new Thread(myTestFrame);
	//接受输入的参数
	public Space(int size){
		this.size=size;
		
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setBounds(0, 0, screensize.width, screensize.height);
		this.setFocusable(false);
		this.setLayout(null);
		this.setUndecorated(true);
		this.setVisible(false);

		Thread.currentThread().setName("Space");
		
	}
	
	//按照输入的个数创建恒星系的线程
	public void createGalaxy(){
		
		int createNumber=(int)(size*1);
		for(int i=0;i<size;i++){
			if(createNumber<=0){
				theGalaxy.add(new GalaxyThread(this,false,theEra,(String)("Galaxy-"+i)));
			}else{
				createNumber--;
				theGalaxy.add(new GalaxyThread(this,true,theEra,(String)("Galaxy-"+i)));
			}
		}
		
		pc=new PaintCoordinatePanel(theGalaxy);
		this.getContentPane().add(pc);
		pc.setBounds(0, 0, 1366, 768);
		
	}
	
	public void run(){
		eraThread.start();
		
//		for(GalaxyThread g:theGalaxy){
//			g.start();
//		}
//		
//		testThread.start();
	}
	//返回给出坐标的恒星系
	public GalaxyThread getGalaxy(int[] coordinate){
		GalaxyThread theChosenGalaxy=null;
		//查询列表
		for(GalaxyThread g:theGalaxy){
			if(coordinate.equals(g.myParameter.getCoordinate())){
				theChosenGalaxy=g;
				break;
			};
		}
		return theChosenGalaxy;
	}
	
}
