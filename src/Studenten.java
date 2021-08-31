import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studenten {private String studentId;
    private int gradeYear;
    private String firstName;
    private String lastName;
    private String courseName;
    private static int costOfCourse;
    private int tuitionBalance;

    static int id=1000;
    Map<String, String> studentInfo = new HashMap<>();



    public void createNewStudent() {
        id++;
        Studenten s = new Studenten();
        System.out.println("Neuer Student erfolgreich erstellt");
        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte Name eingeben");
        s.firstName=scan.next();
        System.out.println("Bitte Lastname eingeben");
        s.lastName=scan.next();
        System.out.println("Bitte Jahrgangsstufe eingeben");
        s.studentId=scan.next()	+ id;
        studentInfo.put(s.studentId, s.firstName + " "+ s.lastName);


    }



    public void printStudents() {
        System.out.println(studentInfo);
    }
    public void getStudentInfo() {

        Scanner scan = new Scanner(System.in);
        String idOfStudent = "";
        String result = "";


        System.out.println("Geben Sie den Studentenausweis ein, um Informationen zu erhalten");
        System.out.println("Drücken Sie 'X', um zum Hauptmenü zu gelangen");

        idOfStudent = scan.nextLine();
        result = studentInfo.get(idOfStudent);

        if(!idOfStudent.equals("X")) {
            System.out.println(result);
        }

    }

    public void removeStudent() {
        Scanner scan = new Scanner(System.in);
        String idOfStudent = "";
        String result = "";


        System.out.println("Geben Sie den Studentenausweis ein, um ihn zu entfernen/löschen");

        idOfStudent = scan.nextLine();
        result = studentInfo.remove(idOfStudent);//remove() with key returns the value in a map


        System.out.println(result);
        System.out.println("Aus der Schülerliste entfernt");


    }
}