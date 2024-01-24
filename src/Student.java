import java.util.Objects;

public class Student {
    private int age, yearLevel, id;
    private static int studentCount;
    private String firstName, lastName;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id=studentCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public boolean equals(Student other) {
        return Objects.equals(firstName, other.getFirstName()) &&
                Objects.equals(lastName, other.getLastName()) &&
                age == other.getAge() &&
                yearLevel == other.getYearLevel();
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
    }
}
