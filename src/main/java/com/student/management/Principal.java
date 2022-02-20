package com.student.management;

public class Principal extends Person {

    public static final int CUT_OFF_MARK = 70;

    public Principal(String firstName, String lastName, int age, int id, Gender gender) {
        super(firstName, lastName, age, id, gender);
    }

    public String admitApplicant(Applicant applicant) {

        if (applicant.isPassed() && applicant.getExamScore() >= CUT_OFF_MARK) {

            return "Congratulations " + applicant.getFirstName() + ", You have been admitted.";
        }

        return "Sorry " + applicant.getFirstName() + ", you did not make the cut off mark.";
    }

    public String expelStudent(Student student) {

        if (student.isExpelled()) {

            return student.getFullName() + " has been expelled";
        }

        return student.getFullName() + " is currently not expelled";
    }
}

