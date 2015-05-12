package technique.science;

import technique.Technique;
import technique.industry.IndustryC1;

public class ScienceC1 extends Technique{
	
	public static final ScienceC1 scienceC1=new ScienceC1();
	
	private static final String name="基础物理学I";
	
	//建造点数
	private static final long neededPoint=1400;
	private static final String property="science";
	private static final long priority=91;
	//完成后的加成
	private static final long decreaseResourse=0;
	private static final long addResourseDecrease=0;
	private static final long addScience=70;
	private static final long addCulture=1;
	private static final long addIndustry=0;
//	private static final long addScienceIncrease=10;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=0;
	
	private static final Technique[] unlockTechnique={ScienceC4.scienceC4,ScienceC5.scienceC5,IndustryC1.industryC1}; 
	
	//不能实例化
	private ScienceC1(){}
	
	public Technique getInstance(){
		return scienceC1;
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
