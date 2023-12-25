package vn.techmaster.buoi3_sboot.utils;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

import vn.techmaster.buoi3_sboot.model.Person;

@Component
public class CSVFileReader implements IFileReader {
    @Override
    public List<Person> readFile(String filePath) {
        List<Person> people = new ArrayList<>();

        Path path = Paths.get(filePath);
        try {
            FileReader filereader = new FileReader(path.toFile());
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                Person person = new Person();
                person.setId(Integer.valueOf(row[0]));
                person.setFullname(row[1]);
                person.setJob(row[2]);
                person.setGender(row[3]);
                person.setCity(row[4]);
                person.setSalary(Integer.valueOf(row[5]));
                person.setBirthday(row[6]);

                people.add(person);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return people;
    }
}