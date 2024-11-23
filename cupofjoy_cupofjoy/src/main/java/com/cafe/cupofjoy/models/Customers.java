package com.cafe.cupofjoy.models;

import jakarta.persistence.*;

@Entity
@Table(name="cust_info")
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sr;
	private String name;
	private String mob;
	private int bill;
	private String billstatus;
	private String date;
	
	public Customers() {
		super();
	}

	public Customers(String name, String mob, int bill, String billstatus, String date) {
		super();
		this.name = name;
		this.mob = mob;
		this.bill = bill;
		this.billstatus = billstatus;
		this.date = date;
	}

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public String getBillstatus() {
		return billstatus;
	}

	public void setBillstatus(String billstatus) {
		this.billstatus = billstatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
