package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author Alex Tindall
 * @version 1.00
 */
public class IntroToProgrammingCourse extends SoftwareCourse {


    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    @Override
    public String toString() {
        return "AdvancedJavaCourse{" +
                "prerequisites='" + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", credits=" + credits +
                '}';
    }



}
