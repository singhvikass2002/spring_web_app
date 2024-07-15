package spring_web_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring_web_app.Model.Reservation;
import spring_web_app.service.ReservationService;


@Controller
@RequestMapping("/reservation")
public class ReservationController {
	

	private ReservationService  reservationService;
	
	@Autowired(required=true)
	@Qualifier(value = "reservationService")
	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		System.out.println("ReservationController.bookingForm()");
		model.addAttribute("reservation", new Reservation());
		return "reservation-page";
	}
	
//	@ModelAttribute
//	public void addAttribute(Model model) {
//		System.out.println("ReservationController.addAttribute()");
//		Reservation res = new Reservation();
//		// provide reservation object to the model
//		model.addAttribute("reservation", res);
//	}


	@RequestMapping("/submitForm")
	// @ModelAttribute binds form data to the object
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		System.out.println("ReservationController.submitForm():  "+res.getFirstName());
		this.reservationService.addReservation(res);
		return "confirmation-page";
	}
}
