import java.util.Arrays;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numOfStudents;
        System.out.println("Please enter the amount of students in your class: ");
        numOfStudents = input.nextInt();
        String[] studentNames = new String[numOfStudents];
        int[] studentIds = new int[numOfStudents];
        String[] studentMajors = new String[numOfStudents];
        String[] studentEdDept = new String[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Please enter the name of students #" + (i+1));
            studentNames[i]= input.nextLine();

            System.out.println("Please enter the ID of students #" + (i+1));
            studentIds[i]= input.nextInt();

            System.out.println("Please enter the major of students #" + (i+1));
            studentMajors[i]= input.nextLine();

            System.out.println("Please enter the educational department of students #" + (i+1));
            studentEdDept[i]= input.nextLine();

        }

        for (int i = 0; i< numOfStudents; i++) {
            System.out.println("................");
            System.out.println("Student name :\t " + studentNames[i]);
            System.out.println("Student id :\t " + studentIds[i]);
            System.out.println("Student major :\t " + studentMajors[i]);
            System.out.println("Student Ed. Dprt :\t " + studentEdDept[i]);
            System.out.println("................");
        }

        System.out.println("Sorted Students");
        for (int i = 0; i<numOfStudents; i++){
            for (int j = 0; j<numOfStudents; j++){
                int idofStudentA = studentIds[j];
                int idofStudentB = studentIds[j+1];
                String nameA = studentNames[j];
                String nameB = studentNames[j+1];
                String majorA = studentMajors[j];
                String majorB = studentMajors[j+1];
                String edDptA = studentEdDept[j];
                String edDptB = studentEdDept[j+1];

                if (idofStudentA > idofStudentB) {

                }

            }
        }

//        System.out.println(Arrays.toString(studentNames));
//        System.out.println(Arrays.toString(studentIds));
//        System.out.println(Arrays.toString(studentMajors));
//        System.out.println(Arrays.toString(studentEdDept));



    }
}
