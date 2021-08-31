import java.util.Scanner;

public class Schule {
    public static void main(String[] args) {
        // =============teacherCreation============
        Lehrer teacher01 = new Lehrer();
        teacher01.setName("Gülcan");
        teacher01.setSurname("Kisakol");
        teacher01.setBranch("Mathematik");
        teacher01.setPhoneNumber("007");
        Lehrer teacher02 = new Lehrer("Elif" , "Yazici" , "Chemie" , "009");


        // =============creating teachers object for using TeachersClass ================
        DieLehrer teachers = new DieLehrer();
        teachers.addTeacherToList(teacher01);
        teachers.addTeacherToList(teacher02);

        // ============ course creation ======================

        KurseKlasse course101 = new KurseKlasse(101,"Analysis" , "Summer", 800);
        KurseKlasse course102 = new KurseKlasse(102,"Stochastik" , "Summer", 900);
        KurseKlasse course103 = new KurseKlasse(103,"Angewandte Mathe" , "Summer", 1000);
        KurseKlasse course104 = new KurseKlasse(104,"Geometrie" , "Summer", 1100);

        // =============creating courses object for using CoursesClass ================

        Kurse courses = new Kurse();
        courses.courseList.add(course101);
        courses.courseList.add(course102);
        courses.courseList.add(course103);
        courses.courseList.add(course104);

        // ================= begining of the interactive program ==================

        int goToProcess=1;
        Studenten student=new Studenten();

        do {
            System.out.println("");
            System.out.println("===============================");

            Scanner scan =new Scanner (System.in);

            System.out.println("Willkommen zu Koeln zu Universitaet "
                    + "\nWas würdest du gern tun ? ? "
                    + "\n1-Schule Informationen "
                    + "\n2-Liste der Lehrer "
                    + "\n3-Liste unserer Vorlesungen+"
                    + "\n4-Neuen Studenten erstellen+"
                    + "\n5-5-Liste von allen Studenten drucken "
                    + "\n6-Studenteninformationen mit ID anzeigen "
                    + "\n7-Schüler nach ID löschen");

            System.out.println("Bitte geben Sie '0' zun Beenden ein");

            goToProcess= scan.nextInt();


            switch(goToProcess) {

                case 1: {
                    printSchoolInformation();

                    break;
                }
                case 2: {

                    teachers.printTeachers();
                    System.out.println("Wir haben " + teachers.numbersOfTeachers() + " Fachkundige Ausbilder");
                    break;
                }
                case 3: {
                    courses.printCourses();
                    System.out.println("Wir haben " + courses.numberOfCourse()+ " Kurse verfügbar");
                    break;
                }
                case 4: {
                    student.createNewStudent();
                    break;
                }
                case 5: {
                    student.printStudents();
                    break;
                }
                case 6: {
                    student.getStudentInfo();
                    break;
                }
                case 7: {
                    student.removeStudent();
                    break;
                }

            }
        }while (goToProcess!=0);


        System.out.println("Danke, dass Sie sich für uns entschieden haben");


    } // end of main method

    public static void printSchoolInformation() {
        System.out.println("===== SCHULE INFORMATIONEN======");
        System.out.println("Name : " + Datein.NAME);
        System.out.println("Web Address : " + Datein.WEB_ADDRESS);
        System.out.println("Telephone Number : " + Datein.PHONE_NUMBER);
        System.out.println("Address : " + Datein.ADDRESS);

    }


}