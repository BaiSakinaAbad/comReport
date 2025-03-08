package domain;
import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private ArrayList<Course> courseList;
    private Integer totalEnrolledUnits = 0;

    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public Integer getTotalEnrolledUnits(){
        for (Course course: courseList){
            totalEnrolledUnits += course.getUnit();
        }
        return totalEnrolledUnits;
    }

    public String toString() {
        String studentOutput = "";
        studentOutput += "Student number: " + getStudentNumber() + "\n" +
                "Student name: " + getName() + "\n" +
                "Program: " + getProgram() + "\n" +
                "Total units enrolled: " + getTotalEnrolledUnits() +"\n";

        studentOutput += "\nCourse code    Description            Units  Day   Time\n";
        for(Course course: getCourseList()) {
            studentOutput += course;
        }
        studentOutput += "\n";
        return studentOutput;
    }
}