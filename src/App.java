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
  }
}