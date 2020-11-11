package com.cybage.pojos;

import java.sql.Date;

public class Batch {
	private int batchId ;
	private int planId;
	private Date startDate;
	private Date endDate ;
	private int batchSize;
	private int sportId;
	public Batch() {
		super();
	}
	
	public Batch(int batchId, int planId, Date startDate, Date endDate, int batchSize, int sportId) {
		super();
		this.batchId = batchId;
		this.planId = planId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.batchSize = batchSize;
		this.sportId = sportId;
	}

	public int getBatchId() {
		return batchId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}
	public int getSportId() {
		return sportId;
	}
	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", planId=" + planId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", batchSize=" + batchSize + ", sportId=" + sportId + "]";
	}
	
	
}
