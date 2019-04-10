package com.kakao.check.model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
  * @update :
  * @explanation : Check Work info
  */
public class CheckInfo {
	
	private int chid;
	private int cid;
	private int uid;
	private String goonYn;
	private String offYn;
	private Date date;
	private Time goonTime;
	private Time offTime;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getChid() {
		return chid;
	}
	public void setChid(int chid) {
		this.chid = chid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getGoonYn() {
		return goonYn;
	}
	public void setGoonYn(String goonYn) {
		this.goonYn = goonYn;
	}
	public String getOffYn() {
		return offYn;
	}
	public void setOffYn(String offYn) {
		this.offYn = offYn;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getGoonTime() {
		return goonTime;
	}
	public void setGoonTime(Time goonTime) {
		this.goonTime = goonTime;
	}
	public Time getOffTime() {
		return offTime;
	}
	public void setOffTime(Time offTime) {
		this.offTime = offTime;
	}
	
	
	
}
