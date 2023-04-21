public class App {
  public static void main(String[] args) {
    /*
     * ----------------------------
     * Introduction to Control Flow
     * ----------------------------
     * 
     * Assuming we're writing a program to enroll students in courses
     * 
     * If a student has completed the prerequisites, they can enroll
     * Else, they need to complete the prerequisites
     * 
     * They can't take Physics II without first taking Physics I
     * 
     * This kind of decision-making is represeneted via conditional or control flow statements
     * 
     * Conditional statements allow us to be selective about which portion of our code to run
     * 
     * Conditional statements check a boolean condition and run a block of code depending on the condition
     * Curly braces mark the scope
     * Here's an example:
     */

    if (true) {
      System.out.println("Hello World!");
      // if the condition is true, the code block runs
      // Hello World! is printed
    }
    if (false) {
      System.out.println("Goodbye World!");
      // if the condition is false, the code block does not run
      // this code is also called if-then statements
    }

    /*
     * -----------------
     * If-Then Statement
     * -----------------
     * 
     * The if-then statement is the most simple control flow we can write
     */

    int flip = 1;
    if (flip == 1) {
      System.out.println("Heads");
      // the if keyword marks the beginning of the conditional statement, followed by parentheses
      // the parentheses hold a boolean datatype
    }

    /*
     * For the condition in parentheses we can also use variables that reference a boolean, or comparisions that evaluate to a boolean
     */

    boolean isValidPassword = true;

    if (isValidPassword) {
      System.out.println("Password accepted!");
    }
    // Prints: Password accepted!

    int numberOfItemsInCart = 9;

    if (numberOfItemsInCart > 12) {
      System.out.println("Express checkout not available");
    }
    // Since condition is not met, nothing is printed

    /*
     * ------------
     * If-Then-Else
     * ------------
     * 
     * We can create an alternate conditional branch with the else keyword:
     */

    boolean hasPrerequisite = true;

    if (hasPrerequisite) {
      // Enroll in course
      System.out.println("Enrolled in course!");
    } else {
      // Enroll in prerequisite
      System.out.println("Enrolled in prerequisite!");
    }

    /*
     * This conditional statement ensures that exactly one code block will be run
     * if the condition, hasPrerequisites, is false, the code block after else runs
     * 
     * The first code block runs if the condition evaluates to true
     * The second code block runs if the condition evaluates to false
     */

    /*
     * ---------------
     * If-Then-Else-If
     * ---------------
     * 
     * The conditional structure we've learned can be chained together to check as many conditions as required by our program.
     */

    String course = "Theatre";

    if (course.equals("Biology")) {
      // Enroll in Biology course
    } else if (course.equals("Algebra")) {
      // Enroll in Algebra course
    } else if (course.equals("Theatre")) {
      // Enroll in Theatre course
    } else {
      System.out.println("Course not found!");
    }

    int testScore = 72;

    if (testScore >= 90) {
      System.out.println("A");
    } else if (testScore >= 80) {
      System.out.println("B");
    } else if (testScore >= 70) {
      System.out.println("C");
    } else if (testScore >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
    // prints: C

    /*
     * -----------------------------
     * Nested Conditional Statements
     * -----------------------------
     * 
     * We can create more complex conditional structures by creating nested conditional statements
     */

    boolean outerCondition = true;
    boolean nestedCondition = true;

    if (outerCondition) {
      if (nestedCondition) {
        // executes if both conditions are true
        System.out.println("Both conditions are met!");
      }
    }

    int temp = 45;
    boolean raining = true;

    if (temp < 60) {
      // temp is 45 which is less than 60
      // our program will print:
      // Wear a jacket!
      System.out.println("Wear a jacket!");
      if (raining) {
        // The variable raining is a boolean with a value of true
        // our proram will print:
        // Bring your umbrella.
        System.out.println("Bring your umbrella.");
      } else {
        // Our program does not run the following
        System.out.println("Leave your umbrella home.");
      }
    }

    /*
     * ----------------
     * Switch Statement
     * ----------------
     * 
     * An alternative to chaining if-then-else conditions is to use the switch statement
     * This conditional will check a given value against any number of conditions and run the code block where there is a match
     */

    String historyCourse = "History";

    switch (historyCourse) {
      case "Algebra":
        // Enroll in Algebra
        break;
      case "Bilogoy":
        // Enroll in Biology
        break;
      case "History":
        // Enroll in History
        break;
      case "Theatre":
        // Enroll in Theatre
        break;
      default:
        System.out.println("Course not found");
    }

    /*
     * This example enrolls the student in History class by checking the value contained in the parentheses, historyCourse, against each of the case labels
     * If the value after the case label matches the value within the parentheses, the switch block is run
     * 
     * In the above example, historyCourse references the string "History", which matches case "History":
     * 
     * When no value matches, the default block runs. Akin to an else statement
     * 
     * Switch blocks are different from other code blocks because they are not marked by curly braces and we use the break keyword to exit the switch statement
     * 
     * Without break, code below the matching case label is run, including code under other case labels
     */
  }
}