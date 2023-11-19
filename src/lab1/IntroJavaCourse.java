package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Alex Tindall
 * @version 1.00
 */
public class IntroJavaCourse extends SoftwareCourse {

    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
    public String getPrerequisites() { return prerequisites; }
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "AdvancedJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", credits=" + credits +
                '}';
    }

}
