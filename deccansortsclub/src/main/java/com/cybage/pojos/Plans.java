package com.cybage.pojos;

public class Plans {

	private int planId;
	private String planName;
	private double fees;
	private int duration;
	public Plans() {
		super();
	}
	public Plans(int planId, String planName, double fees, int duration) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.fees = fees;
		this.duration = duration;
	}
	
	public int getPlanId() {
		return planId;
	}
	
	public String getPlanName() {
		return planName;
	}
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Plans [planId=" + planId + ", planName=" + planName + ", fees=" + fees + ", duration=" + duration + "]";
	}
	
	
}
