package com.student.management;

import java.util.List;

public class Teacher extends Person {

    private final ClassRoom classRoom;

    public Teacher(String firstName, String lastName, int age, int id, Gender gender, ClassRoom classRoom) {
        super(firstName, lastName, age, id, gender);

        this.classRoom = classRoom;
    }

    public void addStudentsToClassRoom(List<Student> studentList) {

        if (studentList != null) {

            for(Student student : studentList) {

                classRoom.assignStudentToClassRoom(student, student.getClassRoomName());
            }
        }

    }
}
