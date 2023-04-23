import java.util.UUID;

public class Teacher {

    private String teacherId;
    private String name;
    private double salary;

    public Teacher(String name, double salary) {
        this.teacherId = autoTeacherId();
        this.name = name;
        this.salary = salary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    private String autoTeacherId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String teacherIdLine = "Teacher ID: " + teacherId + "\n";
        String nameLine = "Name: " + name + "\n";
        String salaryLine = "Salary: " + String.format("$%.2f", salary) + "\n";
        String separatorLine = "---------------------------\n";


        return Color.BOLD + Color.BLUE_BG.toString() + "TEACHER INFO:\n" + Color.RESET +
                separatorLine +
                teacherIdLine +
                nameLine +
                salaryLine +
                separatorLine;
    }
}
