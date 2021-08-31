import java.util.ArrayList;
import java.util.List;

public class Kurse {/*
 * 5) Courses class
 *     * there should be a list to store all courses
 *     * there should be a method to add courses to courses list
 *     * there should be a method to print all courses
 *     * there should be a method to print numbers of courses
 *
 */

    List<KurseKlasse> courseList = new ArrayList<>();

    public void addCourse(KurseKlasse course) {
        courseList.add(course);
    }


    public void printCourses() {
        System.out.println("=====Kursliste von CoursesClass====");
        for(KurseKlasse each:courseList) {
            System.out.println(each.toString(each));
        }

    }

    public int numberOfCourse() {

        return courseList.size();
    }

}