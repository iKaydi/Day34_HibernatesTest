package com.OyoHibernates;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Room {

	public String roomid;
	public String type;
	public Status status;
	public int costperday;
	
	@Id
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Enumerated(EnumType.STRING)
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getCostperday() {
		return costperday;
	}
	public void setCostperday(int costperday) {
		this.costperday = costperday;
	}
}
