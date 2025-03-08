package techServ;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import domain.Student;

public class StudentDA {
    private ArrayList<Student> studentList;

    public StudentDA(String blockCode) throws FileNotFoundException {
        // Read the student CSV file
        Scanner studentInfo = new Scanner(
                new FileReader("C:\\Users\\Sakina Abad\\IdeaProjects\\oop_aggregationAbad\\src\\studentInfo.csv")
        );
        studentList = new ArrayList<>();

        while (studentInfo.hasNext()) {
            String[] rowData = studentInfo.nextLine().split(",");

            // Extract block code from the CSV (assuming it's the first column)
            String studentBlockCode = rowData[0].trim();

            // Only process students matching the target block code
            if (studentBlockCode.equals(blockCode)) {
                Student student = new Student();
                student.setStudentNumber(rowData[1].trim());
                student.setName(rowData[2].trim());
                student.setProgram(rowData[3].trim());

                // Load courses for this student
                CourseDA courseDA = new CourseDA(student.getStudentNumber());
                student.setCourseList(courseDA.getCourseList());

                studentList.add(student);
            }
        }
        studentInfo.close();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}