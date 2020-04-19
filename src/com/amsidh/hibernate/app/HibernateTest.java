package com.amsidh.hibernate.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.amsidh.hibernate.domains.UserDetails;
import com.amsidh.hibernate.domains.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("First User");

		List<Vehicle> vehicleList=new ArrayList<Vehicle>();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("CAR");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("BIKE");

		Vehicle vehicle3 = new Vehicle();
		vehicle3.setVehicleName("TRUCK");

		Vehicle vehicle4 = new Vehicle();
		vehicle4.setVehicleName("ZEEP");

		vehicleList.add(vehicle);
		vehicleList.add(vehicle2);
		vehicleList.add(vehicle3);
		vehicleList.add(vehicle4);
		
		user.setVehicleList(vehicleList);
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.save(vehicle3);
		session.save(vehicle4);
		session.getTransaction().commit();
		session.close();

	}

}
