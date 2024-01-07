package spring_web_app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring_web_app.Model.Reservation;
import spring_web_app.dao.ReservationDAO;
@Service
public class ReservationServiceImpl implements ReservationService {
	private ReservationDAO reservationDAO;
	
	public void setReservationDAO(ReservationDAO reservationDAO) {
		this.reservationDAO = reservationDAO;
	}

	@Override
	@Transactional
	public void addReservation(Reservation r) {
		this.reservationDAO.addReservation(r);
		
	}

	@Override
	@Transactional
	public void updateReservation(Reservation r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Reservation> listReservations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Reservation getReservationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void removeReservation(int id) {
		// TODO Auto-generated method stub
		
	}

}
