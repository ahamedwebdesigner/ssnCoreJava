package com.ssn.reflections.Entity;

public interface Car {
	public int weight=0;
	public int gers=0;
	public int MaxPower=0;
	public int MaxSpeet=0;
	public int presentGare=0;
	
	public Boolean powerStatus=false;
	
	public void start();
	public void stop();
	public void puteGare(int gare);
	void increaseGear();
}
