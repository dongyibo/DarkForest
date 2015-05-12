package tools;

import java.util.ArrayList;

import civilization.GalaxyThread;

public class Era implements Runnable{
	private long time=0;
	private ArrayList<GalaxyThread> theGalaxy=null;
	
	public Era(ArrayList<GalaxyThread> g){
		theGalaxy=g;
	}
	
	public long getTime(){
		return time;
	}
	
	public void run(){
		while(true){
			time=time+10;
			
			for(GalaxyThread g:theGalaxy){
				g.run();
			}
			
			System.out.println("Time is passing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
