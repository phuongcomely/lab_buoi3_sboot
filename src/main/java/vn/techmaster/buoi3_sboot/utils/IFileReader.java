package vn.techmaster.buoi3_sboot.utils;

import java.util.List;

import vn.techmaster.buoi3_sboot.model.Person;

public interface IFileReader {
        List<Person> readFile(String filePath);
}
