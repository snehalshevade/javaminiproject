package com.cybage.pojos;

import java.sql.Date;

public class BatchInfo {
	private int batchId;
	private Date startDate;
	private Date endDate;
	private int batchSize;
	private String sportName;

	public BatchInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BatchInfo(int batchId, Date startDate, Date endDate, int batchSize, String sportName) {
		super();
		this.batchId = batchId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.batchSize = batchSize;
		this.sportName = sportName;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
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

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	@Override
	public String toString() {
		return "BatchInfo [batchId=" + batchId + ", startDate=" + startDate + ", endDate=" + endDate + ", batchSize="
				+ batchSize + ", sportName=" + sportName + "]";
	}

	

}
