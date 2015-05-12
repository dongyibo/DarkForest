package technique.science;

import technique.Technique;
import technique.industry.IndustryA2;

public class ScienceA3 extends Technique {

	public static final ScienceA3 scienceA3=new ScienceA3();
	
	private static final String name="冶炼金属";
	
	//建造点数
	private static final long neededPoint=500;
	private static final String property="science";
	private static final long priority=100;
	//完成后的加成
	private static final long decreaseResourse=1000;
	private static final long addResourseDecrease=5;
	private static final long addScience=0;
	private static final long addCulture=50;
	private static final long addIndustry=20;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=1;
	
	private static final Technique[] unlockTechnique={ScienceB1.scienceB1,IndustryA2.industryA2}; 
	
	//不能实例化
	private ScienceA3(){}
	
	public Technique getInstance(){
		return scienceA3;
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

	public String getProperty(){
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
