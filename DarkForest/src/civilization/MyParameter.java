package civilization;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import technique.Technique;
import events.AlertLevel;
import events.Detector;

public class MyParameter {
	private GalaxyThread theGalaxyThread=null;
	//�̶�ֵ
	private static final long ORIGINAL_RESOURSE=10000000;
	private static final long ORIGINAL_DECREASERE_RESOURSE=10;
	private static final long ORIGINAL_POPULARITY=100;
	private static final long ORIGINAL_SCIENCE_POINT=10;
	private static final long ORIGINAL_CULTURE_POINT=5;
	private static final long ORIGINAL_INDUSTRY_POINT=5;
	
	//�Ƿ�������(��ʼģ��ʱ�Լ�ģ��������)
	private boolean haveCivilization=false;
	private int turn=0;//回合数
	
	//���
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();	
	private int[] coordinate={(int)(Math.random()*screensize.width),(int)(Math.random()*screensize.height)};
	//ά��
	private int galaxyDimensionality=3;
	private int civilizationDimensionality=galaxyDimensionality;
	
	//��Ҫ��������
	private long resourse=ORIGINAL_RESOURSE;
	private long decreaseResourse=ORIGINAL_DECREASERE_RESOURSE;
	private long popularity=ORIGINAL_POPULARITY;
	private long sciencePoint=ORIGINAL_SCIENCE_POINT;
	private long culturePoint=ORIGINAL_CULTURE_POINT;
	private long industryPoint=ORIGINAL_INDUSTRY_POINT;
	//��������
	private long POPULARITY_INCREASE=10;
	private long SCIENCE_INCREASE=10;
	private long CULTURE_INCREASE=10;
	private long INDUSTRY_INCREASE=10;
	//����ϵ��
	private long popularityCoefficient=1;
	private boolean canIncreasePopularity=true;//�����޸�
	private long scienceCoefficient=1;
	private boolean canIncreaseSciencePoint=true;//�����޸�
	private long cultureCoefficient=2;
//	private boolean candIncreaseCulturePoint=true;
//	private long industryCoefficient=1;
//	private boolean candIncreaseIndustryPoint=true;//�Ƽ��޸�
	
	//�ѽ���Ƽ��Ϳ��Խ���ĿƼ�
	public ArrayList<Technique> unlockedTechnique=new ArrayList<Technique>();
	public ArrayList<Technique> availableTechnique=new ArrayList<Technique>();
	public ArrayList<Technique> availableIndustry=new ArrayList<Technique>();
	
	//�Ѿ����ֵĺ���ϵ
	public ArrayList<AlertLevel> detectedGalaxy=new ArrayList<AlertLevel>();
	
	//̽����������
	public ArrayList<Detector> myDetector=new ArrayList<Detector>();
	public ArrayList<Detector> othersDetector=new ArrayList<Detector>();
	
	//̫�ս���
	
	//���캯��
	public MyParameter(GalaxyThread g){
		this.theGalaxyThread=g;
		
//		coordinate[0]=(int) (theGalaxyThread.getSpace().getWidth()*Math.random());
//		coordinate[1]=(int) (theGalaxyThread.getSpace().getHeight()*Math.random());
	}
	
	//�����Ƿ��������
	public boolean getWhetherHaveCivilization(){
		return haveCivilization;
	}
	//�ı������Ƿ����
	public void changeCivilizationExistence(boolean c){
		if(c){
			if(turn==0){
				System.out.println(Thread.currentThread().getName()+"�г�����������");
			}else{
				System.out.println(Thread.currentThread().getName()+"�����³�����������");
			}
			turn++;
		}
		this.haveCivilization=c;
	}
	//��������
	public void createCivilization(boolean have){
		if(!have){
			//���й���д��죬���ʽϵ�
			if(((int)(Math.random()*1000))==1){
				this.changeCivilizationExistence(true);
				
				//��ݳ�ʼ��
				civilizationDimensionality=galaxyDimensionality;
				resourse=ORIGINAL_RESOURSE;
				decreaseResourse=ORIGINAL_DECREASERE_RESOURSE;
				popularity=ORIGINAL_POPULARITY;
				sciencePoint=ORIGINAL_SCIENCE_POINT;
				culturePoint=ORIGINAL_CULTURE_POINT;
				industryPoint=ORIGINAL_INDUSTRY_POINT;
				POPULARITY_INCREASE=10;
				SCIENCE_INCREASE=5;
				CULTURE_INCREASE=10;
				INDUSTRY_INCREASE=10;
				popularityCoefficient=1;
				canIncreasePopularity=true;//�����޸�
				scienceCoefficient=1;
				canIncreaseSciencePoint=true;//�����޸�
				cultureCoefficient=1;
				//�ѽ���Ƽ��Ϳ��Խ���ĿƼ�
				unlockedTechnique=new ArrayList<Technique>();
				availableTechnique=new ArrayList<Technique>();
				//�Ѿ����ֵĺ���ϵ
				detectedGalaxy=new ArrayList<AlertLevel>();
				//̽����������
				myDetector=new ArrayList<Detector>();
				othersDetector=new ArrayList<Detector>();
			}
		}
	}
	
	//�������
	public int[] getCoordinate(){
		return coordinate;
	}
	
	//���ػ�ֵ
	public long getResourse(){
		return resourse;
	}
	public long getPopularity(){
		return popularity;
	}
	public long getSciencePoint(){
		return sciencePoint;
	}
	public long getCulturePoint(){
		return culturePoint;
	}
	public long getIndustryPoint(){
		return industryPoint;
	}
	//�趨��ֵ
	public void setResourse(long n){
		resourse=n;
	}
	public void setPopularity(long n){
		popularity=n;
	}
	public void setSciencePoint(long n){
		sciencePoint=n;
	}
	public void setCulturePoint(long n){
		culturePoint=n;
	}
	public void setIndustryPoint(long n){
		industryPoint=n;
	}
	
	//������Դ����������
	public void changeResourse(){
		resourse=resourse-decreaseResourse*popularity/1000;
	}
	public void changeResourse(long n){
		resourse=resourse-n;
	}
	public void changeResourseDecrease(long n){
		decreaseResourse=decreaseResourse+n;
	}
	//�˿�����
	public void changePopularity(){
		if(canIncreasePopularity){
			popularity=popularity+(long)(POPULARITY_INCREASE*popularityCoefficient)+(long)(Math.random()*100);
		}
	}
	public void changePopularityPolicy(boolean b){
		canIncreasePopularity=b;
	}
	public void changePopularityIncrease(long n){
		POPULARITY_INCREASE=POPULARITY_INCREASE+n;
	}

	//�Ƽ�����
//	public void changeSciencePoint(){
//		if(canIncreaseSciencePoint){
//			sciencePoint=sciencePoint+(long)(SCIENCE_INCREASE*scienceCoefficient);
//		}
//	}
	public void changeSciencePoint(long n){
		if(canIncreaseSciencePoint){
			sciencePoint=sciencePoint+n;			
		}
	}
	public void changeCanIncreaseSciencePoint(boolean b){
		canIncreaseSciencePoint=b;
	}
//	public void changeSciencePointIncrease(long n){
//		SCIENCE_INCREASE=SCIENCE_INCREASE+n;
//	}
	//�Ļ�����
//	public void changeCulturePoint(){
//		culturePoint=culturePoint+(long)(popularity*cultureCoefficient/1000);
//	}
	public void changeCulturePoint(long n){
		culturePoint=culturePoint+n;
	}
//	public void changeCultureCoefficient(long n){
//		cultureCoefficient=cultureCoefficient+n;
//	}
	//��ҵ����
//	public void changeIndustryPoint(){
//		industryPoint=industryPoint+(long)(popularity/1000);
//	}
	public void changeIndustryPoint(long n){
		industryPoint=industryPoint+n;
	}
	
	public void checkDimensionality(){
		if(civilizationDimensionality<galaxyDimensionality){
			changeCivilizationExistence(false);
			System.out.println(theGalaxyThread.getMyName()+"�е�����������ά�ȴ��");
		}
	}
}
