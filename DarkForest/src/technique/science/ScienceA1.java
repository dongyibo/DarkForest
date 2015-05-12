package technique.science;

import technique.Technique;

public class ScienceA1 extends Technique{
	
	public static final ScienceA1 scienceA1=new ScienceA1();
	
	private static final String name="直立行走";
	
	//建造点数
	private static final long neededPoint=100;
	private static final String property="science";
	private static final long priority=100;
	//完成后的加成
	private static final long decreaseResourse=0;
	private static final long addResourseDecrease=0;
	private static final long addScience=5;
	private static final long addCulture=5;
	private static final long addIndustry=5;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=2;
//	private static final long addIndustryIncrease=0;

	private static final Technique[] unlockTechnique={ScienceA2.scienceA2}; 
	
	//不能实例化
	private ScienceA1(){}
	
	public Technique getInstance(){
		return scienceA1;
	}


	public String getName(){
		return name;
	}
	
	@Override
	public void action() {
		 //TODO Auto-generated method stub
		System.out.println("Ok");
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
