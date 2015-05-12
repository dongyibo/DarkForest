package technique.industry;

import technique.Technique;

public class IndustryE3 extends Technique{
	public static final IndustryE3 industryE3=new IndustryE3();
	
	private static final String name="���ӹ���";
	
	//�������
	private static final long neededPoint=1000;
	private static final String property="industry";
	private static final long priority=89;
	//��ɺ�ļӳ�
	private static final long decreaseResourse=200;
	private static final long addResourseDecrease=0;
	private static final long addScience=10;
	private static final long addCulture=3;
	private static final long addIndustry=2;
//	private static final long addScienceIncrease=0;
//	private static final long addCultureIncrease=0;
//	private static final long addIndustryIncrease=1;
	
	private static final Technique[] unlockTechnique={}; 
	
	//����ʵ����
	private IndustryE3(){}
	
	public Technique getInstance(){
		return industryE3;
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
