package GradesProject;

/**
 * Name:
 *
 * Grades.java
 *
 * Use Student class to get test grades for two students
 * and compute averages
 *
 */
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        // TODO create student2, "Mike"
Student student2= new Student("Mike");
        // TODO input grades for Mary
        student1.inputGrades();

        // TODO print average for Mary
        System.out.println("The average for " +student1.getName()+ " is: "+ +student1.getAverage());
        // TODO input grades for Mike
student2.inputGrades();
        // TODO print average for Mike
        System.out.println("The average for " +student2.getName()+ " is: "+ +student2.getAverage());
    }
}