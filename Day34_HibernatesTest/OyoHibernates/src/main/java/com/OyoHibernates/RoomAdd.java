package com.OyoHibernates;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class RoomAdd {

	public static void main(String[] args) {
		
		
		Room room = new Room();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Room No  ");
		room.setRoomid(sc.next());
		
		room.setStatus(Status.AVAILABLE);
		
		System.out.println("Enter Cost Per Day");
		room.setCostperday(sc.nextInt());
		
		System.out.println("Enter Room Type ");
		room.setType(sc.next());
		
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(room);
		t.commit();
	}
}