package civilization;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import technique.Technique;
import technique.industry.IndustryE3;
import tools.Era;
import tools.Space;
import AI.AIActions;

public class GalaxyThread extends Thread{
	
	//����һ��������������ݺͷ���
	public MyParameter myParameter=new MyParameter(this);
	//����һ�������������ж�
	public AIActions myAI=new AIActions(this);
	//�����ϲ���ݵ����
	private Space theSpace=null;
	//
//	private Technique technique;
	//时间控制
	private long time=0;
	private Era myEra=null;
	private String name=null;
	//���ڱ���
	private JFrame myFrame=new JFrame();
	private JPanel myPanel=new JPanel();
	private JLabel myLabel0=new JLabel();
	private JLabel myLabel1=new JLabel();
	private JLabel myLabel2=new JLabel();
	
	public GalaxyThread(Space s,boolean haveCivilization,Era era,String name){
		super(name);
		this.name=name;
//		String[] cut=Thread.currentThread().getName().split("-");
//		Thread.currentThread().setName("��ϵ-"+cut[1]);
		theSpace=s;
		myParameter.changeCivilizationExistence(haveCivilization);
		time=era.getTime();
		myEra=era;
		
		int[] location=myParameter.getCoordinate();
		
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		
		if(location[0]+5+130>screensize.width){
			location[0]=location[0]-130-5;
		}
		if(location[1]+5+47>screensize.height){
			location[1]=location[1]-47-5;
		}
		
		myFrame.setBounds(location[0]+5,location[1]+5,130,47);
		myFrame.setUndecorated(true);
		myFrame.setLayout(null);
		myFrame.getContentPane().add(myPanel);
		myPanel.setBounds(0,-4,130,51);
		myPanel.setLayout(null);
		myPanel.add(myLabel0);
		myPanel.add(myLabel1);
		myPanel.add(myLabel2);
		myLabel0.setBounds(0,2,130,20);
		myLabel1.setBounds(0,17,130,20);
		myLabel2.setBounds(0,32,130,20);
		Font font=new Font("Default",1,10);
		myLabel0.setFont(font);
		myLabel0.setForeground(Color.BLACK);
		myLabel1.setFont(font);
		myLabel1.setForeground(Color.BLACK);
		myLabel2.setFont(font);
		myLabel2.setForeground(Color.BLACK);
		myLabel1.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				myFrame.setSize(400,400);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				myPanel.setBackground(Color.BLACK);
				myLabel0.setForeground(Color.WHITE);
				myLabel1.setForeground(Color.WHITE);
				myLabel2.setForeground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				myPanel.setBackground(Color.WHITE);
				myLabel0.setForeground(Color.BLACK);
				myLabel1.setForeground(Color.BLACK);
				myLabel2.setForeground(Color.BLACK);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
	
	public void run(){
		
		time=myEra.getTime();
		myParameter.createCivilization(myParameter.getWhetherHaveCivilization());//�����������û���������ܻᴴ��
		
		if(myParameter.getWhetherHaveCivilization()){
			myFrame.setVisible(true);
			
			myParameter.changePopularity();
//			myParameter.changeSciencePoint();
//			myParameter.changeCulturePoint();
//			myParameter.changeIndustryPoint();
			myParameter.changeResourse();
			
//			technique.setGalaxy(this);
			
			myAI.developCivilization();
			
			myLabel0.setText(name+"  "+"��Դ��"+myParameter.getResourse());
			myLabel1.setText("�˿ڣ�"+myParameter.getPopularity()+";   �Ƽ���"+myParameter.getSciencePoint());
			myLabel2.setText("�Ļ���"+myParameter.getCulturePoint()+";   ��ҵ��"+myParameter.getIndustryPoint());
			
		}
//		System.out.println(Thread.currentThread().getName()+"is running");
		
	}
	
	public String getMyName(){
		return name;
	}
	
	public Space getSpace(){
		return theSpace;
	}
}
