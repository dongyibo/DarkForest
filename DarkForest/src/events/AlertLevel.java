package events;

import civilization.GalaxyThread;

public class AlertLevel {
	private GalaxyThread theGalaxy=null;
	private int level=0;
	
	public AlertLevel(GalaxyThread theGalaxy,GalaxyThread myGalaxy){
		this.theGalaxy=theGalaxy;
		int[] location1=theGalaxy.myParameter.getCoordinate();
		int[] location2=myGalaxy.myParameter.getCoordinate();
		
		double distance=Math.sqrt((location1[0]-location2[0])*(location1[0]-location2[0])+
									(location1[1]-location2[1])*(location1[1]-location2[1]));
		
		if(distance<100){
			level=10;
		}else if(distance>=100&&distance<250){
			level=6;
		}else if(distance>=250&&distance<500){
			level=3;
		}else{
			level=1;
		}
	}
	
	public void setAlertLevel(int n){
		level=n;
	}
	
	public void changeAlertLevel(int n){
		level=level+n;
	}
	
	public int getAlertLevel(){
		return level;
	}
	
	public GalaxyThread getGalaxyThread(){
		return theGalaxy;
	}
}
