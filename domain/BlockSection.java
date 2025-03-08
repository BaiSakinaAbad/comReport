package domain;
import java.util.ArrayList;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private int totalStudents;
    private ArrayList <Student> studentList;

    public String getBlockCode() {
        return blockCode;
    }
    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAdviser() {
        return adviser;
    }
    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
        this.totalStudents = studentList.size();
    }


    public String toString() {
        String result = new String();
        result = "Block Section: " + getBlockCode() + "\n" +
                "Block Section Description: " + getDescription() + "\n" +
                "Class Adviser: " + getAdviser() + "\n" +
                "Total Student: " + totalStudents + "\n\n";

      for (Student student: studentList) {
          result += student;
      }

            return result;
        }
        }

