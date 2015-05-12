package technique.science;

import technique.Technique;
import technique.industry.IndustryA1;

public class ScienceA2 extends Technique{
	
	public static final ScienceA2 scienceA2=new ScienceA2();
	
	private static final String name="使用工具";
	
	//建造点数
	private static final long neededPoint=200;
	private static final String property="science";
	private static final long priority=100;
	//完成后的加成
	private static final long decreaseResourse=0;
	private static final long addResourseDecrease=5;
	private static final long addScience=10;
	private static final long addCulture=2;
	private static final long addIndustry=10;
//	private static final long addScienceIncrease=1;
//	private static final long addCultureIncrease=1;
//	private static final long addIndustryIncrease=2;
	
	private static final Technique[] unlockTechnique={ScienceA3.scienceA3,IndustryA1.industryA1}; 
	
	//不能实例化
	private ScienceA2(){}
	
	public Technique getInstance(){
		return scienceA2;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println(theGalaxy.getMyName());
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
