package lab1;

public abstract class SoftwareCourse {

    protected String courseName;
    protected String courseNumber;
    protected double credits;

    public SoftwareCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);

    public double getCredits() {
        return credits;
    }

    public abstract  void  setCredits(double credits);
}
