package com.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class CarId {
	private int modelNumaber;
	private int engineNumaber;
	public CarId() {
	}
	
	public CarId(int modelNumaber, int engineNumaber) {
		super();
		this.modelNumaber = modelNumaber;
		this.engineNumaber = engineNumaber;
	}

	public int getModelNumaber() {
		return modelNumaber;
	}
	public void setModelNumaber(int modelNumaber) {
		this.modelNumaber = modelNumaber;
	}
	public int getEngineNumaber() {
		return engineNumaber;
	}
	public void setEngineNumaber(int engineNumaber) {
		this.engineNumaber = engineNumaber;
	}
	@Override
	public String toString() {
		return "CarId [modelNumaber=" + modelNumaber + ", engineNumaber=" + engineNumaber + "]";
	}
}
