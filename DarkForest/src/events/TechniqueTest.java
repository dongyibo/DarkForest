package events;

import java.util.ArrayList;

import civilization.GalaxyThread;
import civilization.MyParameter;

public class TechniqueTest {
	
	private MyParameter myParameter=null;
	
	//0编号；1科技要求；2科技名称；3所需点数；4增加科技值；5增加文化值；6增加工业值；7扣除资源；8增加资源消耗
	public static final String[] science1={"#1;#0;直立行走;100;100;100;100;100;100",
							   			   "#2;#1;使用工具;100;100;100;100;100;100"};
	public static final String[] science2={"#3;#2;刀耕火种;100;100;100;100;100;100",
										   "#4;#2;夜观星象;100;100;100;100;100;100",
										   "#5;#2;数学入门;100;100;100;100;100;100",
										   "#6;#5;基础物理学;100;100;100;100;100;100",
										   "#7;#5;基础化学;100;100;100;100;100;100"};
	
	public static final String[] science3={"#8;#5;经典力学;100;100;100;100;100;100",
										   "#9;#7;基础生命科学;100;100;100;100;100;100",
										   ""};
	
	//文化
	public static final String[] culture1={"资源节约","正常发展","专注科技发展","专注工业发展","强行发展"};
	public static final String[] culture2={"计划生育","人口正常发展","鼓励生育"};
	
	//0科技要求；1工业名称；2所需点数；3增加科技值；4增加文化值；5增加工业值；6扣除资源；7增加资源消耗
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
	
		if(culture=="资源节约"){
			myParameter.changeSciencePoint((long)(-myParameter.getCulturePoint()*2));
			myParameter.changeIndustryPoint((long)(-myParameter.getCulturePoint()/2));
			myParameter.changeResourse(-myParameter.getCulturePoint()*5);
		}else if(culture=="正常发展"){
			
		}else if(culture=="专注科技发展"){
//			myParameter.changeSciencePoint((long)(0.01*myParameter.getSciencePoint()));
//			myParameter.changeIndustryPoint((long)(-0.01*myParameter.getIndustryPoint()));
//			myParameter.changeCulturePoint((long)(-0.01*myParameter.getCulturePoint()));
			
			myParameter.changeSciencePoint(myParameter.getCulturePoint()*5);
			myParameter.changeResourse(myParameter.getCulturePoint());
		}else if(culture=="专注工业发展"){
//			myParameter.changeSciencePoint((long)(-0.01*myParameter.getSciencePoint()));
//			myParameter.changeIndustryPoint((long)(0.01*myParameter.getIndustryPoint()));
//			myParameter.changeCulturePoint((long)(-0.01*myParameter.getCulturePoint()));
			
			myParameter.changeIndustryPoint(myParameter.getCulturePoint());
			myParameter.changeResourse(myParameter.getCulturePoint()*2);
		}else if(culture=="强行发展"){
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
