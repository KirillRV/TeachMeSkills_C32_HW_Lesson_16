package com.teachmeskills.lesson_16.app;

import com.teachmeskills.lesson_16.model.Student;
import com.teachmeskills.lesson_16.util.PassportGenerator;

import java.util.*;
/*
Create a collection of passport numbers (String format).
Create a collection of students from our group.
Each collection should not contain duplicate elements.
Create a key-value collection, where the key is the passport number from the first collection, and the value is an object of the Student class from the second collection.
Loop through a key-value collection with a for-each loop and display the collection's elements on the screen.
 */
public class AppRunner {
    public static void main(String[] args) {
        Set<String> passportNumbers = PassportGenerator.GeneratePassportNumbers();
        Set<Student> students = new LinkedHashSet<>(Arrays.asList( //Нашел способ в интернете
        new Student ("Andrew"),
        new Student("Dmitriy"),
        new Student("Ilya"),
        new Student("Igor"),
        new Student("Marina"),
        new Student("Daniil"),
        new Student("Kirill"),
        new Student("Kate"),
        new Student("Dmitry"),
        new Student("Rita"),
        new Student("Vlad"),
        new Student("Sergio"),
        new Student("Oleg")
        ));

        Map<String, Student> passportStudentMap = new HashMap<>();

        Iterator<String> passportIterator = passportNumbers.iterator();
        for (Student student : students) {
            if (passportIterator.hasNext()) {
                passportStudentMap.put(passportIterator.next(), student);
            }
        }

        passportStudentMap.forEach((numPassport, student) ->
                System.out.println("Passport: " + numPassport + ", Name: " + student.getName())
        );
    }
}