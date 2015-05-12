package technique.science;

import technique.Technique;
import technique.industry.IndustryF4;

public class ScienceF3 extends Technique{
	public static final ScienceF3 scienceF3=new ScienceF3();
	
	private static final String name="��������";
	
	//�������
	private static final long neededPoint=30000;
	private static final String property="science";
	private static final long priority=85;
	//��ɺ�ļӳ�
	private static final long decreaseResourse=2000;
	private static final long addResourseDecrease=0;
	private static final long addScience=100;
	private static final long addCulture=10;
	private static final long addIndustry=10;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=0;
	
	private static final Technique[] unlockTechnique={IndustryF4.industryF4}; 
	
	//����ʵ����
	private ScienceF3(){}
	
	public Technique getInstance(){
		return scienceF3;
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
