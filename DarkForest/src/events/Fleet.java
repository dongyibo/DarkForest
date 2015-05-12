package events;

public class Fleet {
	private int size=0;
	private int[] location={-1,-1};
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int n){
		size=n;
	}
	
	public int[] getLocation(){
		return location;
	}
	
	public void setLocation(int[] l){
		location=l;
	}
	
	
}
