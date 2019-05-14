// The program below helps to detect ANY prime number. Just enter your value and trust the system.
// (c) DamiDrevid
import java.util.Scanner; //Here, I imported scanner from Java library.

public class PrimeCheck { //Class declarition
//Instance variable declaration
    int temp;
    boolean isPrime=true;
    
//main method
   public static void main(String args[]) {		
	Scanner dami = new Scanner(System.in); //
	System.out.println("Enter any number: ");
	//capture the input in an integer
	int num = dami.nextInt(); //placeholder for the value entered by user.
        dami.close(); //Safe practice. It helps keep out intruders
	for(int i=2;i<=num/2;i++) { //The algorithm using the for statement of Java.
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}