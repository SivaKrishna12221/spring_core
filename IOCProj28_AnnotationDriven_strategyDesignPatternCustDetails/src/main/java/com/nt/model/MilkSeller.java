package com.nt.model;

import java.util.Date;

public class MilkSeller {
	private Date dt;
	private int id;
	private String name;
	private String address;
	private float litres;
	private float fat;
	private float litreCost;
	private float amount;

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Date getDt() {
		return dt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getLitres() {
		return litres;
	}

	public void setLitres(float litres) {
		this.litres = litres;
	}

	public float getFat() {
		return fat;
	}

	public void setFat(float fat) {
		this.fat = fat;
	}

	public float getLitreCost() {
		return litreCost;
	}

	public void setLitreCost(float litreCost) {
		this.litreCost = litreCost;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}
