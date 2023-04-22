import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void header(String msj){
        System.out.println(Color.YELLOW_BG + "");
        System.out.println(Color.BOLD + msj);
        System.out.println(Color.YELLOW_BG + "");
        System.out.println(Color.RESET);
    }
    public static void title(String msj){
        System.out.println(Color.GREEN_BG + "");
        System.out.println(Color.BOLD + msj);
        //System.out.println(Color.YELLOW_BG + "");
        System.out.println(Color.RESET);
    }
    public static void subtitle(String msj){
        //System.out.println(Color.PURPLE_BG + "");
        System.out.println(Color.BOLD + Color.BLUE_BG.toString() + msj + Color.RESET);
        //System.out.println(Color.YELLOW_BG + "");
        //System.out.println(Color.RESET);
    }

    public static void appStart(){
        header("WELCOME TO SYSTEM SCHOOL");

        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Please introduce name for School :");
        String nameSchool =  INPUT.nextLine();

        title("DATA TEACHER FOR " + nameSchool.toUpperCase());
        System.out.println("Enter the number of TEACHERS to be created: ");
        int numTeacher = INPUT.nextInt();
        System.out.println("");

        Map<String, Teacher> teachersList = new HashMap<>();


        for(int i = 0; i < numTeacher; i++) {
            final Scanner INPUT_FOR = new Scanner(System.in);
            subtitle("Teacher number: "+ (i + 1));

            System.out.println("Teacher's name:");
            String teacherName = INPUT_FOR.nextLine();
            System.out.println("Teacher's salary:");
            double teacherSalary = INPUT_FOR.nextDouble();

            System.out.println(Color.CHECK + "\n");

            Teacher teacherInput = new Teacher(teacherName, teacherSalary);
            teachersList.put(teacherInput.getTeacherId(), teacherInput);

            }

        System.out.println(teachersList.keySet());

        title("DATA COURSES FOR " + nameSchool);

        System.out.println("Enter the number of COURSES to be created: ");
        Map<String, Course> coursesList = new HashMap<>();
        int numCourses = INPUT.nextInt();

        for(int i = 0; i < numCourses; i++) {
            final Scanner INPUT_FOR = new Scanner(System.in);
            subtitle("Course number: "+ (i + 1));

            System.out.println("Course's name:");
            String courseName = INPUT_FOR.nextLine();
            System.out.println("Course's price:");
            double coursePrice = INPUT_FOR.nextDouble();

            System.out.println(Color.CHECK + "\n");

            Course courseInput = new Course(courseName, coursePrice);
            coursesList.put(courseInput.getCourseId(), courseInput);
        }
        System.out.println(coursesList);


        title("DATA STUDENTS FOR " + nameSchool);

        System.out.println("How many STUDENTS are in your school?");
        Map<String, Student> studentsList = new HashMap<>();
        int numStudents = INPUT.nextInt();

        for(int i = 0; i < numStudents; i++){
            final Scanner INPUT_FOR = new Scanner(System.in);
            subtitle("Student number: "+ (i + 1));

            System.out.println("Student # "+ i + "Student's name");
            String studentName = INPUT_FOR.nextLine();
            System.out.println("Student's address:");
            String studentAddress = INPUT_FOR.nextLine();
            System.out.println("Student's email:");
            String studentEmail = INPUT_FOR.next();
            System.out.println(Color.CHECK + "\n");

            Student studentInput = new Student(studentName, studentAddress, studentEmail);
            studentsList.put(studentInput.getStudentId(), studentInput);
        }
        System.out.println(studentsList);


    }
}
