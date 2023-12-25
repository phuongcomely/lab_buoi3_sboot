package vn.techmaster.buoi3_sboot.dao;


import org.springframework.stereotype.Repository;

import vn.techmaster.buoi3_sboot.database.PersonDB;
import vn.techmaster.buoi3_sboot.model.Person;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PersonDAOImpl implements PersonDAO {
    @Override
    public void printListPeople(List<Person> persons) {
        persons.forEach(System.out::println);
    }

    @Override
    public List<Person> getAll() {
        return PersonDB.people;
    }

    @Override
    public List<Person> sortPeopleByFullName() {
        return PersonDB.people.stream()
                .sorted(Comparator.comparing(Person::getFullname))
                .toList();
    }

    @Override
    public List<Person> sortPeopleByFullNameReversed() {
        return PersonDB.people.stream()
                .sorted(Comparator.comparing(Person::getFullname).reversed())
                .toList();
    }
    

    @Override
    public List<String> getSortedJobs() {
        return null;
    }

    @Override
    public List<String> getSortedCities() {
        return null;
    }

    @Override
    public List<String> femaleNames() {
        return null;
    }

    @Override
    public Person highestEarner() {
        return null;
    }

    @Override
    public List<Person> bornAfter1990() {
        return null;
    }

    @Override
    public double averageSalary() {
        return 0;
    }

    @Override
    public double averageAge() {
        return 0;
    }

    @Override
    public List<Person> nameContains(String keyword) {
        return null;
    }

    @Override
    public List<Person> sortedByAgeForMale() {
        return null;
    }

    @Override
    public Person longestName() {
        return null;
    }

    @Override
    public List<Person> aboveAverageSalary() {
        return null;
    }

    @Override
    public Map<String, List<Person>> groupPeopleByCity() {
        return null;
    }

    @Override
    public Map<String, Integer> groupJobByCount() {
        return null;
    }
    @Override
    public List<Person> inSalaryRange(int start, int end) {
        return PersonDB.people.stream()
                .filter(person -> person.getSalary() >= start && person.getSalary() <= end)
                .collect(Collectors.toList());
    }
    @Override
    public List<Person> startsWith(String prefix) {
        return PersonDB.people.stream()
                .filter(person -> person.getFullname().startsWith(prefix))
                .collect(Collectors.toList());
    }
    @Override
    public List<Person> sortByBirthYearDescending() {
        return PersonDB.people.stream()
                .sorted(Comparator.comparing(Person::getBirthday).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> top5HighestPaid() {
        return PersonDB.people.stream()
                .sorted(Comparator.comparingInt(Person::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
                //  return PersonDB.people.stream()
                // .sorted(Comparator.comparing(Person::getFullname).reversed())
                // .toList();
    }

     @Override
    public List<Person> inAgeRange(int start, int end) {
        return PersonDB.people.stream()
                .filter(person -> {
                    int age = calculateAge(person.getBirthday());
                    return age >= start && age <= end;
                })
                .collect(Collectors.toList());
    }
    private int calculateAge(LocalDate birthday) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - birthday.getYear();
    }
}
