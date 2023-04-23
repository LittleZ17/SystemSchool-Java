import java.util.*;

public class MenuCommands {
    private String nameSchool;


    public static void menuCommands(String nameSchool, Map<String, Teacher> teachersList, Map<String, Course> coursesList, Map<String, Student> studentsList) {

        Map<String, String> commandInfo = new LinkedHashMap<>();

        commandInfo.put("ENROLL", " Intro [STUDENT_ID] [COURSE_ID]");
        commandInfo.put("SHOW COURSES", " Intro for show all Courses");
        commandInfo.put("ASSIGN", " Intro [TEACHER_ID] [COURSE_ID]");
        commandInfo.put("LOOKUP COURSE", " Intro [COURSE_ID]");
        commandInfo.put("SHOW STUDENTS", " Intro for show all Students");
        commandInfo.put("LOOKUP STUDENT", " Intro [STUDENT_ID]");
        commandInfo.put("SHOW TEACHERS", " Intro for show all Teachers");
        commandInfo.put("LOOKUP TEACHER", " Intro [TEACHER_ID]");
        commandInfo.put("SHOW PROFIT", " Intro for show all profit");
        commandInfo.put("QUIT", " Exit!");

        //String [] commands = {"ENROLL", "ASSIGN", "SHOW COURSES", "LOOKUP COURSE", "SHOW STUDENTS", "LOOKUP STUDENT", "SHOW TEACHERS", "LOOKUP TEACHER", "SHOW PROFIT", "QUIT"};
        boolean quit = false;

        for (Map.Entry<String, String> entry : commandInfo.entrySet()) {
            System.out.println(Color.PURPLE_BG + "|*|*|*| | | |  " + entry.getKey() + "  | | | |*|*|*|" + Color.RESET);
            System.out.println(  "------>   "+entry.getValue() + Color.RESET);
            System.out.println("");
            //System.out.println("................................"+ Color.RESET);
        }

        while (!quit) {
            System.out.print("Enter your command:: \n");
            final Scanner INPUT = new Scanner(System.in);
            String command = INPUT.nextLine();

            switch (command.toUpperCase()) {

                case "ENROLL":
                    //enroll(idStudent, idCourse);
                    break;
                case "ASSIGN":
                    //assignTeacher();
                    break;
                case "SHOW COURSES":
                    showAllCourses(coursesList);
                    break;
                case "LOOKUP COURSE":
                    System.out.println("Introduce ID Course:");
                    String idCourse = INPUT.nextLine();
                    Course course = courseById(coursesList, idCourse);
                    break;
                case "SHOW STUDENTS":
                    showStudents(studentsList);
                    break;
                case "LOOKUP STUDENT":
                    System.out.println("Introduce ID Student:");
                    String idStudent= INPUT.nextLine();
                    Student student = studentById(studentsList, idStudent);
                    break;
                case "SHOW TEACHERS":
                    showTeachers(teachersList);
                    break;
                case "LOOKUP TEACHER":
                    System.out.println("Introduce ID Teacher:");
                    String idTeacher = INPUT.nextLine();
                    teacherById(teachersList, idTeacher);
                    break;
                case "SHOW PROFIT":
                    //System.out.println("Profit: $" + /*school.calculateProfit()*/);
                    break;
                case "QUIT":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }

        }
    }

    public static void showAllCourses(Map<String, Course> coursesList){
        System.out.println(coursesList);
    }
    public static void showStudents(Map<String, Student> studentsList){
        System.out.println(studentsList);
    }
    public static void showTeachers(Map<String, Teacher> teachersList){
        System.out.println(teachersList);
    }


    public static Course courseById(Map<String, Course> coursesList, String idCourse){
        return coursesList.get(idCourse);
    }

    public static Student studentById(Map<String, Student> studentsLists, String idStudent){
        return studentsLists.get(idStudent);
    }
    public  static Teacher teacherById(Map<String, Teacher> teachersList, String idTeacher){
        return teachersList.get(idTeacher);
    }

    public class EnrollmentSystem {
        private List<Student> students;
        private List<Course> courses;
        // other properties and methods

        public void enroll(String studentId, String courseId) {
            Student student = findStudent(studentId);
            Course course = findCourse(courseId);

            if (student == null) {
                System.out.println("Error: Student with ID " + studentId + " not found.");
                return;
            }

            if (course == null) {
                System.out.println("Error: Course with ID " + courseId + " not found.");
                return;
            }

            if (course.getMoney_earned() + course.getPrice() > Double.MAX_VALUE) {
                System.out.println("Error: Maximum value of money earned exceeded for course " + courseId + ".");
                return;
            }

            student.addCourse(course);
            course.updateMoneyEarned(course.getPrice());

            System.out.println("Enrollment successful for student " + studentId + " in course " + courseId + ".");
        }

        private Student findStudent(String studentId) {
            for (Student student : students) {
                if (student.getStudentId().equals(studentId)) {
                    return student;
                }
            }
            return null;
        }

        private Course findCourse(String courseId) {
            for (Course course : courses) {
                if (course.getCourseId().equals(courseId)) {
                    return course;
                }
            }
            return null;
        }



}
