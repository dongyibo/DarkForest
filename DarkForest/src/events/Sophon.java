package events;

import civilization.GalaxyThread;

public class Sophon extends Detector{
	
	public Sophon(GalaxyThread g){
		super(g);
	}
	
	public void lockScience(){
		if(isArrived){
			destinationGalaxy.myParameter.changeCanIncreaseSciencePoint(false);
		}
	}
}
