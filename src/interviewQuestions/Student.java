package interviewQuestions;

/**
 * Created by Shweta on 5/15/2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String first_name, String last_name, int age) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.age = age;
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
}
