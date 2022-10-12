package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int pin = 1000;
   System.out.println("Enter a PIN");
   int userPin=in.nextInt();
   while (userPin!=pin) {
	   System.out.println("Invalid Pin. Try again.");
	   userPin=in.nextInt();
   }
   
   System.out.println("got it");
	   }
}
