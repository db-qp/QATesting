
//import java.util.Scanner;
public class Assignment2 {
	public static String Validate(long cardNumber) {

		         // since the card number is 16 digits, we need long integer
				 //long cardNumber=0;

				 final int CARD_LENGHT = 16;
				 int length, sum1=0, sum2=0, finalSum=0;
				 int[] digitArray = new int[CARD_LENGHT];
				 //Scanner scan = new Scanner(System.in);

				 // reads the eight digit card number
				 //System.out.println("Enter the 16 digit card number: " );
				 //cardNumber = scan.nextLong();
				 // get the card length
				 length = (int) (Math.log10(cardNumber) + 1);
				 if (length != CARD_LENGHT)
				 {
					 return ("Invalid card number, need to have 16 digits");
				 }
				 else {
					// get each digit from the card number and set the digitArray
					 int i = CARD_LENGHT - 1;

					 while(cardNumber > 0)
					 {
						 digitArray[i] = (int)(cardNumber%10);
						 cardNumber = cardNumber/10;
						 i = i - 1;

					 }
					 
					 // starting from the right most digit add every other digit to sum 1
					 // changed i >= 2 to i >= 1 so it can add the last digit
					 for(i= CARD_LENGHT - 1;  i >=1 ; i= i -2)
					 {
						 sum1 =  sum1 + digitArray[i];
					 }

					 // get each digit not counted in above, multiply by 2 and add each digit of  multiplied
					 // numbers to sum 2
					 for(i= CARD_LENGHT - 2;  i >= 0; i= i-2)
					 {
						 int num = digitArray[i]*2;
						 // added this to split the doubled integer
						 int firstNum = (int) num / 10;
						 int secondNum = num % 10;
						 sum2 =  sum2 + firstNum + secondNum;
					 }


					 // find the final sum
					 finalSum = sum1 + sum2;

					 // check if the last digit of the final sum is 0
					 if(finalSum%10 == 0)
					 {
						 //System.out.println("Valid Card");
						 return "Valid Card";
					 }else
					 {
						// System.out.println("Invalid Card");
						return "Invalid Card";
					 }

				 }
				 
	}
 }





