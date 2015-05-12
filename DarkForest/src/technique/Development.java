package technique;

import AI.AIActions;

public class Development {
	protected Technique technique=null;
	protected long remainder=0;
	protected AIActions myAI=null;
	
	public Development(AIActions ai){
		myAI=ai;
	}
	
	public boolean checkOK(){
		if(technique==null){
			return true;
		}else{
			return false;
		}
	}
	
	public void getTechnique(Technique t){
		technique=t;
		if(technique!=null){			
			remainder=t.getNeededPoint();
		}
	}
	
	public void researching(){
		remainder=remainder-myAI.getGalaxy().myParameter.getSciencePoint();
		
		if(remainder<0){
			myAI.getGalaxy().myParameter.changeResourse(technique.getDecreaseResourse());
			myAI.getGalaxy().myParameter.changeResourseDecrease(technique.getAddResourseDecrease());
			myAI.getGalaxy().myParameter.changeSciencePoint(technique.getAddSciencePoint());
			myAI.getGalaxy().myParameter.changeCulturePoint(technique.getAddCulturePoint());
			myAI.getGalaxy().myParameter.changeIndustryPoint(technique.getAddIndustryPoint());
			
			myAI.getGalaxy().myParameter.availableTechnique.remove(technique);
			myAI.getGalaxy().myParameter.unlockedTechnique.add(technique);
			
			technique.setGalaxy(myAI.getGalaxy());
			technique.action();
			Technique[] save=technique.getUnlockTechnique();
			
			if(save!=null){
//				System.out.println("Here");
				for(int i=0;i<save.length;i++){
					if(save[i].getName().equals("science")){						
						myAI.getGalaxy().myParameter.availableTechnique.add(save[i]);					
					}else{
						myAI.getGalaxy().myParameter.availableIndustry.add(save[i]);
					}
				}
			}
			
//			System.out.println(myAI.getGalaxy().myParameter.availableTechnique.size());
			
			System.out.println(myAI.getGalaxy().getMyName()+"完成了"+technique.getName());
			
			technique=null;
		}
	}
	
	public void building(){
		remainder=remainder-myAI.getGalaxy().myParameter.getIndustryPoint();
		
		if(remainder<0){
			myAI.getGalaxy().myParameter.changeResourse(technique.getDecreaseResourse());
			myAI.getGalaxy().myParameter.changeResourseDecrease(technique.getAddResourseDecrease());
			myAI.getGalaxy().myParameter.changeSciencePoint(technique.getAddSciencePoint());
			myAI.getGalaxy().myParameter.changeCulturePoint(technique.getAddCulturePoint());
			myAI.getGalaxy().myParameter.changeIndustryPoint(technique.getAddIndustryPoint());
			
			myAI.getGalaxy().myParameter.availableIndustry.remove(technique);
			
			technique.setGalaxy(myAI.getGalaxy());
			technique.action();
			Technique[] save=technique.getUnlockTechnique();
			
			if(save!=null){
//				System.out.println("Here");
				for(int i=0;i<save.length;i++){
					if(save[i].getName().equals("science")){						
						myAI.getGalaxy().myParameter.availableTechnique.add(save[i]);					
					}else{
						myAI.getGalaxy().myParameter.availableIndustry.add(save[i]);
					}					
				}
			}
			
//			System.out.println(myAI.getGalaxy().myParameter.availableTechnique.size());
			
			System.out.println(myAI.getGalaxy().getMyName()+"完成了"+technique.getName());
			
			technique=null;
		}
	}
}
