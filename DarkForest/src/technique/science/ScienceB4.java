package technique.science;

import technique.Technique;
import technique.industry.IndustryB1;

public class ScienceB4 extends Technique{
	
	public static final ScienceB4 scienceB4=new ScienceB4();
	
	private static final String name="建筑学";
	
	//建造点数
	private static final long neededPoint=600;
	private static final String property="science";
	private static final long priority=72;
	//完成后的加成
	private static final long decreaseResourse=0;
	private static final long addResourseDecrease=50;
	private static final long addScience=5;
	private static final long addCulture=10;
	private static final long addIndustry=200;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=5;
//	private static final long addIndustryIncrease=3;
	
	private static final Technique[] unlockTechnique={IndustryB1.industryB1}; 
	
	//不能实例化
	private ScienceB4(){}
	
	public Technique getInstance(){
		return scienceB4;
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
