package com.ssn.reflections.Entity;

public class BMW implements Car{
	public int weight;
	public int gers;
	public int MaxPower;
	public int MaxSpeet;
	private int presentGare=0;
	
	public int getPresentGare() {
		return presentGare;
	}

	public void setPresentGare(int presentGare) {
		this.presentGare = presentGare;
	}

	public Boolean powerStatus=false;
	
	public BMW() {}
	
	@Override
	public void start() {
		System.out.println("car Has started Put on seat belts Before moving");
		powerStatus=true;
		
	}
	
	@Override
	public void stop() {
		System.out.println("car Has Stoped Apply Hand Break Before getting down");
		powerStatus=false;
	}
	
	public void puteGare(int gare){
		presentGare=gare;
		System.out.println("The care is now in :"+ presentGare+" Gare");
	}

	@Override
	public void increaseGear() {
		++presentGare;
		System.out.println("The care is now in :"+ presentGare+" Gare");
	}
	
	@SuppressWarnings("unused")
	private void HonkingHoren() {
	        System.out.println("BBBBBBEEEEEEEEEEEPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP!");
	}
}
