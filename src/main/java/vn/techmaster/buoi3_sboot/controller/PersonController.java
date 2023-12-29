package vn.techmaster.buoi3_sboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.techmaster.buoi3_sboot.dao.PersonDAO;
import vn.techmaster.buoi3_sboot.model.Person;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonDAO personDAO;

    @GetMapping("/")
    public String getHome(){

        return "index";
    }

    @GetMapping("/getAll")
    public String getAll(Model model){
        List<Person> allPersons = personDAO.getAll();
       model.addAttribute("person", allPersons);
        return "getAll";
    }
    @GetMapping("/sortPeopleByFullName")
    public String sortPeopleByFullName(Model model){
        List<Person> sortedPersons = personDAO.sortPeopleByFullName();
        model.addAttribute("persons", sortedPersons);
        return "sortPeopleByFullName";
    }
//     @GetMapping("/getSortedJobs")
//    List<String> job = personDAO.getSortedJobs(); // Assuming you have a method to get sorted persons
    
       
//         return "getSortedJobs";
//     }
    // @GetMapping("/getSortedCities")
    // public String getSortedCities(Model model){
    //      List<String> getSortedCities = personDAO.getSortedCities();
    //      model.addAttribute("person", getSortedCities);
    //     return "getSortedCities";
    // }
    

}
