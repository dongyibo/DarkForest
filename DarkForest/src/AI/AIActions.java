package AI;

import technique.Development;
import technique.Technique;
import technique.science.ScienceA1;
import civilization.GalaxyThread;

public class AIActions {
	private GalaxyThread theGalaxy=null;
	private Development myBuilder=new Development(this);
	private Development myResearcher=new Development(this);
	
	public AIActions(GalaxyThread g){
		this.theGalaxy=g;
		g.myParameter.availableTechnique.add(ScienceA1.scienceA1);
//		System.out.println("OK");
	}
	
	public GalaxyThread getGalaxy(){
		return theGalaxy;
	}
	
	public void developCivilization(){
		
		if(myResearcher.checkOK()){
			myResearcher.getTechnique(checkScience());
		}else{
			myResearcher.researching();
		}
		
		if(myBuilder.checkOK()){
			myBuilder.getTechnique(checkIndustry());
		}else{
			myBuilder.building();
		}
		
	}
	
	public Technique checkScience(){
		if(!theGalaxy.myParameter.availableTechnique.isEmpty()){	
			return theGalaxy.myParameter.availableTechnique.get(0);
		}else{
			return null;
		}
	}
	
	public Technique checkIndustry(){
		if(!theGalaxy.myParameter.availableIndustry.isEmpty()){	
			return theGalaxy.myParameter.availableIndustry.get(0);				
		}else{
			return null;
		}
	}
}
