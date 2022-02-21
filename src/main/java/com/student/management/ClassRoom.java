package com.student.management;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import static com.student.management.ClassRoomName.*;

public class ClassRoom {

    private static final int ONE = 1;

    private final EnumMap<ClassRoomName, List<Student>> classRoomCollection;

    public ClassRoom() {

        this.classRoomCollection = new EnumMap<>(ClassRoomName.class);

        this.classRoomCollection.put(CLASS_ROOM_ONE, new ArrayList<>(ONE));
        this.classRoomCollection.put(CLASS_ROOM_TWO, new ArrayList<>(ONE));
        this.classRoomCollection.put(CLASS_ROOM_THREE, new ArrayList<>(ONE));
        this.classRoomCollection.put(CLASS_ROOM_FOUR, new ArrayList<>(ONE));
        this.classRoomCollection.put(CLASS_ROOM_FIVE, new ArrayList<>(ONE));
        this.classRoomCollection.put(CLASS_ROOM_SIX, new ArrayList<>(ONE));

    }

    public void assignStudentToClassRoom(Student student, ClassRoomName className) {

        classRoomCollection.get(className).add(student);
    }

    public void printClassRoomsAndStudents() {

        classRoomCollection.forEach((key, value) -> System.out.println(key + " = " + value));
    }

}
