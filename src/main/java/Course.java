import java.util.UUID;

public class Course {

    private String courseId;
    private String name;
    private double price;
    private double money_earned;
    private Teacher teacher;

    public Course(String name, double price) {
        this.courseId = autoCourseId();
        this.name = name;
        this.price = price;
        this.money_earned = 0;
        this.teacher = null;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String autoCourseId(){
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        this.money_earned = money_earned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        String courseIdLine = "Course ID: " + courseId + "\n";
        String nameLine = "Name: " + name + "\n";
        String priceLine = "Price: " + String.format("$%.2f", price) + "\n";
        String moneyEarnedLine = "Money Earned: " + String.format("$%.2f", money_earned) + "\n";
        String teacherLine = "Teacher: " +(teacher != null ? getTeacher(): "N/A sin asignar") + "\n";
        String separatorLine = "---------------------------\n";

        String output = Color.PURPLE_BG + "COURSE\n" + Color.RESET;
        output += separatorLine + courseIdLine + nameLine + priceLine + moneyEarnedLine + teacherLine + separatorLine;

        return Color.BOLD + Color.PURPLE_BG.toString() + "COURSE\n" + Color.RESET +
                separatorLine +
                courseIdLine +
                nameLine +
                priceLine +
                moneyEarnedLine +
                teacherLine +
                separatorLine;
    }

    public void updateMoneyEarned(double price) {
        setMoney_earned(money_earned += price);
    }
}
