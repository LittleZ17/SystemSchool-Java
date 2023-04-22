import java.util.*;

public class MenuCommands {
    
    public static void menuCommands() {

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
            System.out.print("Enter your command command: \n");
            final Scanner INPUT = new Scanner(System.in);
            String command = INPUT.nextLine();

            switch (command.toUpperCase()) {

                case "ENROLL":
                    System.out.println("Hola Fercho!!!");
                    //enrollStudent();
                    break;
                case "ASSIGN":
                    //assignTeacher();
                    break;
                case "SHOW COURSES":
                    //school.showCourses();
                    break;
                case "LOOKUP COURSE":
                    //lookupCourse();
                    break;
                case "SHOW STUDENTS":
                    //school.showStudents();
                    break;
                case "LOOKUP STUDENT":
                    //lookupStudent();
                    break;
                case "SHOW TEACHERS":
                    //school.showTeachers();
                    break;
                case "LOOKUP TEACHER":
                    //lookupTeacher();
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

}
