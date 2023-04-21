import java.util.*;

public class MenuCommands {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";


    public static final String BLACK_BG = "\u001B[40m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BG = "\u001B[47m";
    
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
            System.out.println( entry.getKey());
            System.out.println(GREEN + "---" + entry.getValue() + "---");
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
