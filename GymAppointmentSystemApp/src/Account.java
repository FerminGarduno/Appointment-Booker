import java.util.ArrayList;

public class Account {
    private String name;
    private String password;
    private int numOfCourses;
    private boolean isStaff;

    private ArrayList<Course> coursesEnrolledIn = new ArrayList<>();

    public Account(String userName, String userPass) {
        this.name = userName;
        this.password = userPass;
        this.isStaff = false; // Default to false
    }

    public Account(String userName, String userPass, boolean isStaff) {
        this.name = userName;
        this.password = userPass;
        this.isStaff = isStaff;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getNumberOfCourses() {
        numOfCourses = coursesEnrolledIn.size();
        return numOfCourses;
    }

    public String getCourseList() {
        return coursesEnrolledIn.toString();
    }

    public void addCourse(Course course) {
        if (!coursesEnrolledIn.contains(course)) {
            coursesEnrolledIn.add(course);
            course.addMember(this);
        }
    }

    public void removeCourse(Course course) {
        if (coursesEnrolledIn.contains(course)) {
            coursesEnrolledIn.remove(course);
            course.removeMember(this);
        }
    }

    public String getInformation() {
        return "Name: " + name + ". Password: " + password;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public ArrayList<Course> getCoursesEnrolledIn() {
        return coursesEnrolledIn;
    }
}