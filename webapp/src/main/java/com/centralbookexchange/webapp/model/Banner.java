package com.centralbookexchange.webapp.model;

import java.io.Serializable;

public class Banner implements Serializable
{
	private static final long serialVersionUID = 2070530497371283475L;
	
	private int eventId;
	private Event baseEvent;
	private String eventTimes;
	
	public Banner(int eventId, Event baseEvent, String eventTimes)
	{
		this.setEventId(eventId);
		this.setBaseEvent(baseEvent);
		this.setEventTimes(eventTimes);
	}
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public Event getBaseEvent() {
		return baseEvent;
	}
	public void setBaseEvent(Event baseEvent) {
		this.baseEvent = baseEvent;
	}
	public String getEventTimes() {
		return eventTimes;
	}
	public void setEventTimes(String eventTimes) {
		this.eventTimes = eventTimes;
	}
	
}
