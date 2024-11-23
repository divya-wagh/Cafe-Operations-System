package com.cafe.cupofjoy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class Sales {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sr;
	private String date;
	private int totalsales;
	public int getSr() {
		return sr;
	}
	public String getDate() {
		return date;
	}
	public int getTotalsales() {
		return totalsales;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTotalsales(int totalsales) {
		this.totalsales = totalsales;
	}
	
	
}