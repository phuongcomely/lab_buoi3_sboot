package vn.techmaster.buoi3_sboot.database;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import vn.techmaster.buoi3_sboot.utils.IFileReader;

// CommandLineRunner là một interface chạy 1 lần sau khi Spring Boot khởi động
@Configuration
public class InitData implements CommandLineRunner {
    @Autowired
    private IFileReader fileReader;


    @Override
    public void run(String... args) throws Exception {
        PersonDB.people = fileReader.readFile("person.csv");
        System.out.println("people size : " + PersonDB.people.size());
    }
    
}
