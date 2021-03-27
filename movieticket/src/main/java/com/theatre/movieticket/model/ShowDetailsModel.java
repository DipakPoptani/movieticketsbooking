package com.theatre.movieticket.model;

import java.util.Date;

public class ShowDetailsModel {

	private int id;
	private String showName;
	private Date showStartTime;
	private int minTickets;
	private int maxTickets;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Date getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}
	public int getMinTickets() {
		return minTickets;
	}
	public void setMinTickets(int minTickets) {
		this.minTickets = minTickets;
	}
	public int getMaxTickets() {
		return maxTickets;
	}
	public void setMaxTickets(int maxTickets) {
		this.maxTickets = maxTickets;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
