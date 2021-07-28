package com.example.WriteCSV.service;

import com.example.WriteCSV.model.Person;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteCSVService {

    List<Person> persons = Arrays.asList(
            new Person("Kelvin Prince", 11, "Calgary", "kk@gmail.com"),
            new Person("Will Bedu", 21, "London", "will@gmail.com"),
            new Person("Johnny Woode", 33, "Accra", "woode@gmail.com"),
            new Person("Emma Bonsu", 43, "Kumasi", "emma@gmail.com")
    );

    public void writeCSV() throws IOException {
        Field[] fields = Person.class.getDeclaredFields();
        List<String> classFields = new ArrayList<>(fields.length);
        Arrays.stream(fields).forEach(
                field -> {
                    field.setAccessible(true);
                    classFields.add(field.getName());
                }
        );
        String[] columns = classFields.toArray(new String[classFields.size()]);
        File tempFile = File.createTempFile("./" + "trial", ".csv");
        FileWriter writer = new FileWriter(tempFile);

        try (CSVPrinter printer = new CSVPrinter(writer, CSVFormat.EXCEL.withHeader(columns))) {
            persons.forEach((person -> {
                try {
                    printer.printRecord(person.getName(), person.getAge(), person.getEmail(), person.getLocation());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        }
    }
}
