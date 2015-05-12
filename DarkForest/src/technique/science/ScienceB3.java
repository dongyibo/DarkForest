package technique.science;

import technique.Technique;

public class ScienceB3 extends Technique{
	
	public static final ScienceB3 scienceB3=new ScienceB3();
	
	private static final String name="������ѧII";
	
	//�������
	private static final long neededPoint=1500;
	private static final String property="science";
	private static final long priority=83;
	//��ɺ�ļӳ�
	private static final long decreaseResourse=0;
	private static final long addResourseDecrease=0;
	private static final long addScience=60;
	private static final long addCulture=2;
	private static final long addIndustry=0;
//	private static final long addScienceIncrease=10;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=0;
	
	private static final Technique[] unlockTechnique={ScienceC1.scienceC1,ScienceC2.scienceC2,}; 
	
	//����ʵ����
	private ScienceB3(){}
	
	public Technique getInstance(){
		return scienceB3;
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
