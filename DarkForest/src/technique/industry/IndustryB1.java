package technique.industry;

import technique.Technique;

public class IndustryB1 extends Technique{
	public static final IndustryB1 industryB1=new IndustryB1();
	
	private static final String name="石工术";
	
	//建造点数
	private static final long neededPoint=100;
	private static final String property="industry";
	private static final long priority=50;
	//完成后的加成
	private static final long decreaseResourse=200;
	private static final long addResourseDecrease=2;
	private static final long addScience=2;
	private static final long addCulture=10;
	private static final long addIndustry=10;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=0;
	
	private static final Technique[] unlockTechnique={}; 
	
	//不能实例化
	private IndustryB1(){}
	
	public Technique getInstance(){
		return industryB1;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getDecreaseResourse() {
		// TODO Auto-generated method stub
		return decreaseResourse;
	}

	@Override
	public long getAddResourseDecrease() {
		// TODO Auto-generated method stub
		return addResourseDecrease;
	}

	@Override
	public long getNeededPoint() {
		// TODO Auto-generated method stub
		return neededPoint;
	}

	@Override
	public String getProperty() {
		// TODO Auto-generated method stub
		return property;
	}
	
	@Override
	public long getAddSciencePoint() {
		// TODO Auto-generated method stub
		return addScience;
	}

	@Override
	public long getAddCulturePoint() {
		// TODO Auto-generated method stub
		return addCulture;
	}

	@Override
	public long getAddIndustryPoint() {
		// TODO Auto-generated method stub
		return addIndustry;
	}

//	@Override
//	public long getAddScienceIncrease() {
//		// TODO Auto-generated method stub
//		return addScienceIncrease;
//	}
//
//	@Override
//	public long getAddCultureIncrease() {
//		// TODO Auto-generated method stub
//		return addCultureIncrease;
//	}
//
//	@Override
//	public long getAddIndustryIncrease() {
//		// TODO Auto-generated method stub
//		return addIndustryIncrease;
//	}

	@Override
	public Technique[] getUnlockTechnique() {
		// TODO Auto-generated method stub
		return unlockTechnique;
	}
	
	@Override
	public long getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}

}
