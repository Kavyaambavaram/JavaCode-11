package com.looseCoupling;

public class Mobile {
	Network sim;
	Mobile(Network sim){
		this.sim = sim;//this.sim = new Idea();
	}
	
	public String getNetwork(){
		return this.sim.getSim();
	}

}
