package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharId;
	@Column(unique = true)
	private int aadharNumaber;
	private LocalDate issuedDate;
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
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumaber=" + aadharNumaber + ", issuedDate=" + issuedDate + "]";
	}
}
