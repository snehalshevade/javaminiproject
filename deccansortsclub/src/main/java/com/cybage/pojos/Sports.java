package com.cybage.pojos;

public class Sports {
	private int sportId;
	private String sportName;
	
	public Sports() {
		super();
	}

	public Sports(int sportId, String sportName) {
		super();
		this.sportId = sportId;
		this.sportName = sportName;
	}

	public int getSportId() {
		return sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	@Override
	public String toString() {
		return "Sports [sportId=" + sportId + ", sportName=" + sportName + "]";
	}


	
	
	
	
}
