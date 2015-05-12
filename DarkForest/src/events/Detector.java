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
	
	//�Եз����ã���÷���������
	public int[] getOriginalCoordinate(){
		return originalGalaxy.myParameter.getCoordinate();
	}
	//��������
	public void setDestinationGalaxy(GalaxyThread g){
		destinationGalaxy=g;
	}
	public boolean getWhetherArrive(){
		return isArrived;
	}
	public void lockScience(){
		
	}
	
	
	//��ͼ��Ҫ
	public void setCurrentCoordinate(int X,int Y){
		currentCoordinate[0]=X;
		currentCoordinate[1]=Y;
	}
	public int[] getCurrentCoordinate(){
		return currentCoordinate;
	}
}
