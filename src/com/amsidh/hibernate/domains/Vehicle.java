package com.amsidh.hibernate.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="VEHICLE")
public class Vehicle {

	@GeneratedValue
	@Id
	@Column(name = "VEHICLE_ID")
	private Integer vehicleId;
	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	
	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
