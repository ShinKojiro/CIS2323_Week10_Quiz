import java.util.*;
public class FormLetterWriter{
	public static String lastName = "Doe";
	public static String firstName = "John";
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		
		displaySalutaion(lastName);
		System.out.println("Thank you for your recent order");
		
		displaySalutaion(firstName, lastName);
		System.out.println("Thank you for your recent order");
			
	}
	public static void displaySalutaion(String lName){
		lastName = lName;
		System.out.println("Dear Mr. or Ms. " + lastName);
	}
	public static void displaySalutaion(String fName, String lName){
		lastName = lName;
		firstName = fName;
		System.out.println("Dear " + firstName + " " + lastName);
	}
}