package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author Alex Tindall
 * @version 1.00
 */
public class AdvancedJavaCourse extends SoftwareCourse {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
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

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public String getPrerequisites() { return prerequisites; }

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
