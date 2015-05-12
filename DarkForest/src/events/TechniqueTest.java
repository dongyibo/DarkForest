package events;

import java.util.ArrayList;

import civilization.GalaxyThread;
import civilization.MyParameter;

public class TechniqueTest {
	
	private MyParameter myParameter=null;
	
	//0��ţ�1�Ƽ�Ҫ��2�Ƽ����ƣ�3���������4���ӿƼ�ֵ��5�����Ļ�ֵ��6���ӹ�ҵֵ��7�۳���Դ��8������Դ����
	public static final String[] science1={"#1;#0;ֱ������;100;100;100;100;100;100",
							   			   "#2;#1;ʹ�ù���;100;100;100;100;100;100"};
	public static final String[] science2={"#3;#2;��������;100;100;100;100;100;100",
										   "#4;#2;ҹ������;100;100;100;100;100;100",
										   "#5;#2;��ѧ����;100;100;100;100;100;100",
										   "#6;#5;��������ѧ;100;100;100;100;100;100",
										   "#7;#5;������ѧ;100;100;100;100;100;100"};
	
	public static final String[] science3={"#8;#5;������ѧ;100;100;100;100;100;100",
										   "#9;#7;����������ѧ;100;100;100;100;100;100",
										   ""};
	
	//�Ļ�
	public static final String[] culture1={"��Դ��Լ","������չ","רע�Ƽ���չ","רע��ҵ��չ","ǿ�з�չ"};
	public static final String[] culture2={"�ƻ�����","�˿�������չ","��������"};
	
	//0�Ƽ�Ҫ��1��ҵ���ƣ�2���������3���ӿƼ�ֵ��4�����Ļ�ֵ��5���ӹ�ҵֵ��6�۳���Դ��7������Դ����
	public static final String[] industry={"#0;name;100;100;100;100;100;100"};
	
	private ArrayList<String> unlockedScience=new ArrayList<String>();
	
	private boolean isResearching=false;
	private boolean isMaking=false;
	private boolean isBuilding=false;

	private long researchingPoint=0;
	private long policyPoint=0;
	private long buildingPoint=0;
	
	private String currentResearching=null;
	private String currentPolicy=null;
	private String currentBuilding=null;
	
	public TechniqueTest(MyParameter m){
		myParameter=m;
	}
	
	public void research(String science){
		if(isResearching){
			if(researchingPoint>0){
				researchingPoint=researchingPoint-myParameter.getSciencePoint();
			}else{
				String[] split=currentResearching.split(";");
				unlockedScience.add(split[0]);
				
				myParameter.changeSciencePoint(Integer.valueOf(split[4]));
				myParameter.changeCulturePoint(Integer.valueOf(split[5]));
				myParameter.changeIndustryPoint(Integer.valueOf(split[6]));
				myParameter.changeResourse(Integer.valueOf(split[7]));
				myParameter.changeResourseDecrease(Integer.valueOf(split[8]));
				
				isResearching=false;
				System.out.println(split[2]+"is ready");
			}
		}else{
			String[] split=science.split(";");
			
			researchingPoint=Integer.valueOf(split[3]);
			currentResearching=science;
			isResearching=true;
		}
	}
	
	public void institute(String culture){
	
		if(culture=="��Դ��Լ"){
			myParameter.changeSciencePoint((long)(-myParameter.getCulturePoint()*2));
			myParameter.changeIndustryPoint((long)(-myParameter.getCulturePoint()/2));
			myParameter.changeResourse(-myParameter.getCulturePoint()*5);
		}else if(culture=="������չ"){
			
		}else if(culture=="רע�Ƽ���չ"){
//			myParameter.changeSciencePoint((long)(0.01*myParameter.getSciencePoint()));
//			myParameter.changeIndustryPoint((long)(-0.01*myParameter.getIndustryPoint()));
//			myParameter.changeCulturePoint((long)(-0.01*myParameter.getCulturePoint()));
			
			myParameter.changeSciencePoint(myParameter.getCulturePoint()*5);
			myParameter.changeResourse(myParameter.getCulturePoint());
		}else if(culture=="רע��ҵ��չ"){
//			myParameter.changeSciencePoint((long)(-0.01*myParameter.getSciencePoint()));
//			myParameter.changeIndustryPoint((long)(0.01*myParameter.getIndustryPoint()));
//			myParameter.changeCulturePoint((long)(-0.01*myParameter.getCulturePoint()));
			
			myParameter.changeIndustryPoint(myParameter.getCulturePoint());
			myParameter.changeResourse(myParameter.getCulturePoint()*2);
		}else if(culture=="ǿ�з�չ"){
			myParameter.changeSciencePoint(myParameter.getCulturePoint()*5);
			myParameter.changeIndustryPoint(myParameter.getCulturePoint());
			myParameter.changeResourse(myParameter.getCulturePoint()*5);
		}
		
	}
	
	
	public void build(String construction){
		if(isBuilding){
			if(buildingPoint>0){
				buildingPoint=buildingPoint-myParameter.getIndustryPoint();
			}else{
				
				isBuilding=false;
				String[] split=currentBuilding.split(";");
				
				myParameter.changeSciencePoint();
				
				System.out.println(currentBuilding+"is ready");
			}
		}else{
			String[] split=construction.split(";");
			
			buildingPoint=Integer.valueOf(split[2]);
			currentBuilding=construction;
			isResearching=true;
		}
	}
	
	
}
