package com.student.management;

public class Applicant extends Person {

    private final int examScore;
    public final boolean passed;

    public Applicant(String firstName, String lastName, int age,
                     int id, Gender gender, int examScore, boolean passed) {
        super(firstName, lastName, age, id, gender);

        this.examScore = examScore;
        this.passed = passed;
    }

    public int getExamScore() {
        return examScore;
    }

    public boolean isPassed() {
        return passed;
    }
}
