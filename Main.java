import java.util.Scanner;
/**
 * determine if a number the user inputs is even or odd
 * @author Ahmad Zeshan 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  // create a Scanner for user input
	Scanner input = new Scanner(System.in);
    // TODO code applicat
    System.out.println("Please enter an integer:");
		int numberValue = input.nextInt();
		if (numberValue % 2 == 0){
		System.out.println(numberValue + " is an even number");
		}
		else{
		System.out.println(numberValue + " is an odd number");	
		}
  }
}
