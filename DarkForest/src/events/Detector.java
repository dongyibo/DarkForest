package events;

import civilization.GalaxyThread;

public class Detector {
	private GalaxyThread originalGalaxy=null;
	protected GalaxyThread destinationGalaxy=null;
	private int[] currentCoordinate=null;
	protected boolean isArrived=false;
	
	public Detector(GalaxyThread g){
		originalGalaxy=g;
	}
	
	//对敌方有用，获得发射者坐标
	public int[] getOriginalCoordinate(){
		return originalGalaxy.myParameter.getCoordinate();
	}
	//己方调用
	public void setDestinationGalaxy(GalaxyThread g){
		destinationGalaxy=g;
	}
	public boolean getWhetherArrive(){
		return isArrived;
	}
	public void lockScience(){
		
	}
	
	
	//绘图需要
	public void setCurrentCoordinate(int X,int Y){
		currentCoordinate[0]=X;
		currentCoordinate[1]=Y;
	}
	public int[] getCurrentCoordinate(){
		return currentCoordinate;
	}
}
