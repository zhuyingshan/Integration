package po;

public class Selection {

    public String studentId;
    public String courseId;
    public double grade;

    public Selection() {
    }

    public Selection(String studentID, String coureseID) {
        this.studentId = studentID;
        this.courseId = coureseID;
        this.grade=0;
    }

    public Selection(String studentID, String coureseID, double grade) {
        this.studentId = studentID;
        this.courseId = coureseID;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
