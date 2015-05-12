package technique;

import civilization.GalaxyThread;

public abstract class Technique {
	protected GalaxyThread theGalaxy=null;
//	private String name=null;
//	private long neededPoint=0;
//	private Technique[] unlockTechnique=null;
//	abstract public void action(MyParameter mp);
//	public long getDecreaseResourse(){		return 0;}
//	public long getAddResourseDecrease(){	return 0;}
//	public long getNeededPoint(){			return 0;}
//	public long getAddSciencePoint(){		return 0;}
//	public long getAddCulturePoint(){		return 0;}
//	public long getAddIndustryPoint(){		return 0;}
//	public long getAddScienceIncrease(){	return 0;}
//	public long getAddCultureIncrease(){	return 0;}
//	public long getAddIndustryIncrease(){	return 0;}
//	public Technique[] getUnlockTechnique(){return unlockTechnique;}
	
	public void setGalaxy(GalaxyThread theGalaxy){
		this.theGalaxy=theGalaxy;
	}
	
	abstract public String getName();
	abstract public void action();
	abstract public long getDecreaseResourse();
	abstract public long getAddResourseDecrease();
	abstract public long getNeededPoint();
	abstract public String getProperty();
	abstract public long getAddSciencePoint();
	abstract public long getAddCulturePoint();
	abstract public long getAddIndustryPoint();
	abstract public long getPriority();
//	abstract public long getAddScienceIncrease();
//	abstract public long getAddCultureIncrease();
//	abstract public long getAddIndustryIncrease();
	abstract public Technique[] getUnlockTechnique();
}