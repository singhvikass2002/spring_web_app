package spring_web_app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import spring_web_app.Model.Reservation;

public class ReservationDAOImpl implements ReservationDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addReservation(Reservation r) {
		Session session =this.sessionFactory.openSession();
		session.persist(r);
		session.beginTransaction().commit();
		System.out.println("saved successfully");
		
	}

	@Override
	public void updateReservation(Reservation r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reservation> listReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getReservationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeReservation(int id) {
		// TODO Auto-generated method stub
		
	}

}
