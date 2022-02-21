package com.student.management;

import java.util.ArrayList;
import java.util.List;

import static com.student.management.ClassRoomName.*;
import static com.student.management.Gender.FEMALE;
import static com.student.management.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        Principal principal = new Principal("Ovo", "Sheggey", 45, 2, MALE);

        Applicant applicant = new Applicant("Mary", "Mark", 22, 11, FEMALE, 70, true);

        String applicantsMessage = principal.admitApplicant(applicant);

        System.out.println(applicantsMessage);


        // Class_Room_One Students
        Student markHenry = new Student("Mark", "Henry", 20, 1, MALE, false, CLASS_ROOM_ONE);
        Student kemiJones = new Student("Kemi", "Jones", 23, 2, FEMALE, false, CLASS_ROOM_ONE);

        // Class_Room_Two Students
        Student boluAdo = new Student("Bolu", "Ado", 25, 9, MALE, false, CLASS_ROOM_TWO);
        Student amakaUche = new Student("Amaka", "Uche", 23, 10, FEMALE, false, CLASS_ROOM_TWO);

        // Class_Room_Three Students
        Student obiUche = new Student("Obi", "Uche", 20, 11, MALE, false, CLASS_ROOM_THREE);
        Student nkechiOvo = new Student("Nkechi", "Ovo", 23, 12, FEMALE, false, CLASS_ROOM_THREE);

        // Class_Room_Four Students
        Student tayoOjo = new Student("Tayo", "Ojo", 25, 19, MALE, false, CLASS_ROOM_FOUR);
        Student maryAdam = new Student("Mary", "Adam", 23, 20, FEMALE, true, CLASS_ROOM_FOUR);

        // Class_Room_Five Students
        Student chidiOkoro = new Student("Chidi", "Okoro", 25, 24, MALE, false, CLASS_ROOM_FIVE);
        Student evelynShade = new Student("Evelyn", "Shade", 23, 25, FEMALE, true, CLASS_ROOM_FIVE);

        // Class_Room_Six Students
        Student seyiLaw = new Student("Seyi", "Law", 20, 26, MALE, false, CLASS_ROOM_SIX);
        Student bintaHadjia = new Student("Binta", "Hadjia", 23, 27, FEMALE, false, CLASS_ROOM_SIX);


        StudentListPojo studentListPojo = new StudentListPojo();

        studentListPojo.setAmakaUche(amakaUche);
        studentListPojo.setBoluAdo(boluAdo);
        studentListPojo.setBintaHadjia(bintaHadjia);
        studentListPojo.setChidiOkoro(chidiOkoro);
        studentListPojo.setKemiJones(kemiJones);
        studentListPojo.setMarkHenry(markHenry);
        studentListPojo.setSeyiLaw(seyiLaw);
        studentListPojo.setObiUche(obiUche);
        studentListPojo.setNkechiOvo(nkechiOvo);
        studentListPojo.setTayoOjo(tayoOjo);
        studentListPojo.setMaryAdam(maryAdam);
        studentListPojo.setEvelynShade(evelynShade);

        List<Student> studentList = getStudentList(studentListPojo);


        System.out.println(principal.expelStudent(bintaHadjia));

        ClassRoom classRoom = new ClassRoom();

        Teacher teacherHarry = new Teacher("Emma", "Harry", 120, 8, MALE, classRoom);
        teacherHarry.addStudentsToClassRoom(studentList);

        classRoom.printClassRoomsAndStudents();

    }

    private static List<Student> getStudentList(StudentListPojo pojo) {

        List<Student> studentList = new ArrayList<>(1);

        studentList.add(pojo.getMaryAdam());
        studentList.add(pojo.getMarkHenry());
        studentList.add(pojo.getKemiJones());
        studentList.add(pojo.getBoluAdo());
        studentList.add(pojo.getAmakaUche());
        studentList.add(pojo.getObiUche());
        studentList.add(pojo.getNkechiOvo());
        studentList.add(pojo.getTayoOjo());
        studentList.add(pojo.getSeyiLaw());
        studentList.add(pojo.getBintaHadjia());
        studentList.add(pojo.getEvelynShade());
        studentList.add(pojo.getChidiOkoro());

        return studentList;
    }
}
