package GradesProject;

/**
 * Name:
 *
 * Student.java
 *
 *  Define a student class that stores name, score on test 1, and
 *  score on test 2. Methods prompt for and read in grades,
 *  compute the average, and return a string containing student?s info.
 *
 */
public class Student

{

    // TODO 1a: declare instance data for the Student Class
    private String name;
    private double test1;
    private double test2;
    private double average;


    /**
     * The default constructor
     */
    public Student(String studentName)
    {
        // The constructor initializes the instance data
        // TODO 1b: add body of constructor
        this.name = studentName;
    }

    /**
     *
     * inputGrades: prompt for and read in student's grades for test1 and test 2.
     * Use name in prompts, e.g., "Enter's Joe's score for test1".
     */
    public void inputGrades()
    {
        // TODO 1c: add body of inputGrades
        this.test1 = MyTools.readDouble("Enter " + name + "'s score for test 1: ");
        this.test2 = MyTools.readDouble("Enter " + name + "'s score for test 2: ");
    }
    /**
     *
     * getAverage: compute and return the student's test averag e
     */
    // TODO 1d: add header for getAverage
    public double getAverage()
    {
        return (test1+test2)/2;


        // TODO 1e: add body of getAverage
    }


    /**
     * getName: return the student's name
     */
    // TODO 1d: add header for getName
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: "+ this.name + "\tTest1: "+ this.test1+ "\tTest2: " + this.test2;
    }
}