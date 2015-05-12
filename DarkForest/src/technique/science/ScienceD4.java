package technique.science;

import technique.Technique;
import technique.industry.IndustryD3;

public class ScienceD4 extends Technique{

	public static final ScienceD4 scienceD4=new ScienceD4();
	
	private static final String name="DNA深入研究";
	
	//建造点数
	private static final long neededPoint=3000;
	private static final String property="science";
	private static final long priority=51;
	//完成后的加成
	private static final long decreaseResourse=100;
	private static final long addResourseDecrease=-20;
	private static final long addScience=20;
	private static final long addCulture=20;
	private static final long addIndustry=0;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=0;
	
	private static final Technique[] unlockTechnique={IndustryD3.industryD3}; 
	
	//不能实例化
	private ScienceD4(){}
	
	public Technique getInstance(){
		return scienceD4;
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
