import java.util.ArrayList;
import java.util.List;

public class DieLehrer {/*
 * 3) Teachers class
 *    * there should be a list to store all teachers
 *    * there should be a method to add teachers to teachers list
 *    * there should be a method to print all teachers
 *    * there should be a method to print numbers of teachers
 */

    List<Lehrer> teachersList = new ArrayList<>();

    public void addTeacherToList(Lehrer teacher ) {

        teachersList.add(teacher);
    }

    public void printTeachers() {

        System.out.println("===Lehrerliste aus der Lehrerklasse =====");
        for (Lehrer each : teachersList) {

            System.out.println(each.toString(each));
        }


    }

    public int numbersOfTeachers() {

        return teachersList.size();
    }
}