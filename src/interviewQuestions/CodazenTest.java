package interviewQuestions;

import java.util.HashMap;

/**
 * Codazen Software Engineering Assessment
 Problem Statement
 A interviewQuestions.Student has the following properties: first name, last name, and age. A Course can then be considered
 to be an array of Students that are enrolled in the Course. Given two Courses, determine how many
 Students are enrolled in both Courses.
 Input Format
 Your function should take two Courses (arrays of Students) as inputs.
 A interviewQuestions.Student object is designed as follows:
 {
 firstName: string,
 lastName: string,
 age: integer
 }
 Output Format
 Your output should be an integer representing the number of Students that are in both Courses. Return
 0 if the Courses share no Students between them. As a sanity check, your output should not exceed the
 smallest Course size.
 Examples
 interviewQuestions.Student A: { firstName: George, lastName: Washington, age: 23 }
 interviewQuestions.Student B: { firstName: John, lastName: Adams, age: 25 }
 interviewQuestions.Student C: { firstName: Thomas, lastName: Jefferson, age: 27 }
 Input 1 Input 2 Output
 [interviewQuestions.Student A, interviewQuestions.Student B] [interviewQuestions.Student A, interviewQuestions.Student C] 1
 [interviewQuestions.Student A, interviewQuestions.Student B] [interviewQuestions.Student A, interviewQuestions.Student B, interviewQuestions.Student C] 2
 [interviewQuestions.Student A, interviewQuestions.Student B] [interviewQuestions.Student C] 0
 Constraints
 You may use any language you feel most comfortable with. However, please refrain from using any
 built-in/library sorting methods should you feel the need to use them. You must implement any sorting
 algorithm on your own.
 Your implementation should consider time/space complexity.
 First and last names will only contain alphabetical letters.
 Ages will be nonnegative.
 A Course can have any number of Students, and both Courses do not have to be the same size.
 Students can have the same first name, last name or age as other Students, but no two Students can
 share all three of the same properties.
 Deliverables
 Please include the following:
 Your code containing the solution to this problem.
 A set of test cases that show inputs and outputs you considered for this problem.
 The time and space complexities of your solution
 How many hours you worked on this assessment
 */
public class CodazenTest {
    public static void main(String args[]){
        CodazenTest codazenTest = new CodazenTest();

        Student student1 = new Student("John", "Doe", 25);
        Student student2 = new Student("George", "Washington", 23);
        Student student3 = new Student("John", "Adams", 25);
        Student student4 = new Student("Thomas", "Jefferson", 27);
        Student student5 = new Student("Betty", "Holmes", 22);
        Student student6 = new Student("Sarah", "Jane", 21);

        Student[] classA = new Student[]{student1, student2, student3};
        Student[] classB = new Student[]{student2, student3};
        System.out.println(codazenTest.count(classA, classB));

        classA = new Student[]{student1,student2, student3};
        classB = new Student[]{student4, student5, student6};
        System.out.println(codazenTest.count(classA, classB));

        classA = new Student[]{};
        classB = new Student[]{};
        System.out.println(codazenTest.count(classA, classB));
        
    }

    public int count(Student[] classA, Student[] classB){
        //count variable holds the number of students that are present in both the classes
        int count = 0;

        /**
         * hashmap that stores the student details, where-
         * key --> student object
         * value --> occurrence of the student
         */
        HashMap<Student, Integer> map = new HashMap<>();

        /**
        *Add students in class A to the hashmap
        *Since in the first array class A, student entries would not be repeated we can successfully add the student to the hashmap,
        *without checking if the map already contains the student
        */
        for (Student student : classA) {
            map.put(student, 1);
        }

        /**
         * Add students in class B to the hashmap
         * If the student is already present in the hashmap, we increment the occurrence of the student and increment count
         */
        for (Student student : classB) {
            if (map.containsKey(student)) {
                map.put(student, map.get(student) + 1);
                count += 1;
            } else {
                map.put(student, 1);
            }
        }

        return count;
    }


}
