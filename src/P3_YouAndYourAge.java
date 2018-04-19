

/*
	ISYS 320 DONE DONE DONE DONE DONE
	Name(s): Dave Rapp
	Date: 4-16-18
*/
import java.util.Scanner;
public class P3_YouAndYourAge {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Give me your Name ");
		String name = console.nextLine();
		
		System.out.println("Now what is your age? ");
		int age = console.nextInt();
		
		
		System.out.println("Wow " + name + " you've been alive "+ age +" years? Amazing.");
		
	}

}