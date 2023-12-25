package vn.techmaster.buoi3_sboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vn.techmaster.buoi3_sboot.dao.PersonDAO;
import vn.techmaster.buoi3_sboot.model.Person;

@SpringBootTest
class Buoi3SbootApplicationTests {
	@Autowired
	private PersonDAO personDAO;

	@Test
	void test_get_all(){
		personDAO.printListPeople(personDAO.getAll());
	}
	

}
