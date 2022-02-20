package com.student.management;

import java.util.ArrayList;
import java.util.List;

import static com.student.management.ClassRoomName.*;
import static com.student.management.Gender.FEMALE;
import static com.student.management.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        Principal principal = new Principal("Ovo", "Sheggey", 45, 002, MALE);

        Applicant applicant = new Applicant("Mary", "Mark", 22,
                013, FEMALE, 70, true);

        String applicantsMessage = principal.admitApplicant(applicant);

        System.out.println(applicantsMessage);


        Student maryJames = new Student("Mary", "James", 23,
                9, FEMALE, true, CLASS_ROOM_THREE);
        System.out.println(principal.expelStudent(maryJames));

        Student maryAdam = new Student("Mary", "Adam", 23,
                10, FEMALE, true, CLASS_ROOM_FOUR);

        List<Student> studentList = new ArrayList<>();
        studentList.add(maryJames);
        studentList.add(maryAdam);

        ClassRoom classRoom = new ClassRoom();

        Teacher emmaHarry = new Teacher("Emma", "Harry", 120, 8, MALE, classRoom);
        emmaHarry.addStudentsToClassRoom(studentList);

        classRoom.PrintClasses();

    }
}
