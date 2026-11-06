package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharId;
	@Column(unique = true)
	private int aadharNumaber;
	private LocalDate issuedDate;
	@OneToOne(mappedBy = "aadhar")
	private Citizen citizen;
	public Aadhar() {
	}
	public Aadhar(int aadharNumaber, LocalDate issuedDate) {
		this.aadharNumaber = aadharNumaber;
		this.issuedDate = issuedDate;
	}
	public Aadhar(int aadharId, int aadharNumaber, LocalDate issuedDate) {
		this.aadharId = aadharId;
		this.aadharNumaber = aadharNumaber;
		this.issuedDate = issuedDate;
	}
	public int getAadharId() {
		return aadharId;
	}
	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}
	public int getAadharNumaber() {
		return aadharNumaber;
	}
	public void setAadharNumaber(int aadharNumaber) {
		this.aadharNumaber = aadharNumaber;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumaber=" + aadharNumaber + ", issuedDate=" + issuedDate + "]";
	}
}
