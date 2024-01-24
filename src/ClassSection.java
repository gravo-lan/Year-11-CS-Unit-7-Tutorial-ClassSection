import java.util.ArrayList;

public class ClassSection {

    private String subject;
    private int capacity, yearLevel;
    private final ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (student.getYearLevel() == yearLevel) {
            for (Student s : students) {
                if (s.equals(student) || s.getId() == student.getId()) {
                    return;
                }
            }
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public boolean isStudentEnrolled(Student student) {
        return students.contains(student);
    }

    @Override
    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students + "}";
    }
}
