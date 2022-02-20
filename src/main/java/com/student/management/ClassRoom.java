package com.student.management;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

import static com.student.management.ClassRoomName.*;

public class ClassRoom {

    private static final int ONE = 1;

    private final EnumMap<ClassRoomName, List<Student>> classCollection;

    public ClassRoom() {

        this.classCollection = new EnumMap<>(ClassRoomName.class);

        this.classCollection.put(CLASS_ROOM_ONE, new ArrayList<>());
        this.classCollection.put(CLASS_ROOM_TWO, new ArrayList<>());
        this.classCollection.put(CLASS_ROOM_THREE, new ArrayList<>());
        this.classCollection.put(CLASS_ROOM_FOUR, new ArrayList<>());
        this.classCollection.put(CLASS_ROOM_FIVE, new ArrayList<>());
        this.classCollection.put(CLASS_ROOM_SIX, new ArrayList<>());


    }

    public void assignStudentToClassRoom(Student student, ClassRoomName className) {

        classCollection.get(className).add(student);
    }

    public void PrintClasses() {

        classCollection.forEach((key, value) -> System.out.println(key + " = " + value));
    }


}
