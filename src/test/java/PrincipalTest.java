import com.student.management.Applicant;
import com.student.management.ClassRoomName;
import com.student.management.Principal;
import com.student.management.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.student.management.ClassRoomName.*;
import static com.student.management.Gender.FEMALE;
import static com.student.management.Gender.MALE;

class PrincipalTest {

    private final Principal principal = new Principal("James", "Harden", 45, 001, MALE);

    @Test
    void admitApplicantPass() {
        Applicant applicant = new Applicant("Harry", "Emmanuel", 21,
                011, MALE, 79, true);

        Assertions.assertEquals("Congratulations, You have been admitted.",
                principal.admitApplicant(applicant));
    }

    @Test
    void admitApplicantFail() {
        Applicant applicant = new Applicant("Ada", "Chioma", 21,
                012, FEMALE, 58, false);

        Assertions.assertEquals("Sorry, you did not make the cut off mark.",
                principal.admitApplicant(applicant));
    }

    @Test
    void expelStudentTrue() {
        Student student =  new Student("Okoro", "Umukoro", 19,
                01, MALE, true,  CLASS_ROOM_FOUR);

        Assertions.assertEquals("Student has been expelled", principal.expelStudent(student));
    }

    @Test
    void expelStudentFalse() {
        Student student =  new Student("Mike", "Williams", 19,
                05, MALE, false, CLASS_ROOM_ONE);

        Assertions.assertEquals("Student is currently not expelled", principal.expelStudent(student));
    }
}
