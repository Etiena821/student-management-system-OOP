package com.student.management;

public class Student extends Person {

    private final boolean expelled;
    private final ClassRoomName classRoomName;

    public Student(String firstName, String lastName, int age, int id, Gender gender, boolean expelled, ClassRoomName classRoomName1) {
        super(firstName, lastName, age, id, gender);
        this.expelled = expelled;
        this.classRoomName = classRoomName1;
    }

    public boolean isExpelled() {
        return expelled;
    }

    public ClassRoomName getClassRoomName() {
        return classRoomName;
    }
}
