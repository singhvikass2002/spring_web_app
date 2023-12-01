package spring_web_app.Dao;


import java.util.List;

import com.journaldev.spring.model.Person;


public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}