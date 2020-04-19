package com.amsidh.hibernate.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_INFO")
public class UserDetails {
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@OneToMany()
	@JoinTable(name="USER_VECHILE",joinColumns={
			                                   @JoinColumn(referencedColumnName="USER_ID",name="USER_ID")  
			                                   },
			                inverseJoinColumns={
							     			   @JoinColumn(referencedColumnName="VEHICLE_ID",name="VEHICLE_ID")
	                                           }
	
			)
	private List<Vehicle> vehicleList=new ArrayList<Vehicle>();
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	
	
}
