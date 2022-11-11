/**
 * Author: Andrew Tang
 * Date: 10/27/2022
 * File: AssignmentISBN.java
 * Description: Program that does book inventory each day.
 */




import java.util.Scanner;

public class AssignmentISBN{

public static void main(String[]args) {
	Scanner input = new Scanner(System.in);	

System.out.println("************************************************ ");
System.out.println("* Welcome to the Daily Book Inventory Program! *");
System.out.println("************************************************");


String digitInputString = "Enter the first 12 digits of an ISBN-13 as a String: " ;
String returnOrCheckoutString = "Enter 'R' for return or 'C' for check out: ";
String contOrQuitString = "Enter 'Y' to continue, 'N' to quit: ";
String userInputISBN = " ";
String userInputBookInvent = " ";
String userInputYN = " ";

int numBookReturn = 0;
int numBookCheckout = 0;
char inputCR = ' ';
char inputYN = ' ';
char chd1 = ' ';
char chd2 = ' ';
char chd3 = ' ';
char chd4 = ' ';
char chd5 = ' ';
char chd6 = ' ';
char chd7 = ' ';
char chd8 = ' ';
char chd9 = ' ';
char chd10 = ' ';
char chd11 = ' ';
char chd12 = ' ';
char chd13 = ' ';

boolean quit = false;
int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0, d11 = 0, d12 = 0, d13 = 0;

do {
System.out.print(digitInputString);
userInputISBN = input.next();
	while (userInputISBN.length() < 12) {
		System.out.println("Invalid ISBN-13 number! Try again.");
		System.out.print(digitInputString);
		userInputISBN = input.next();
	}
chd1 = userInputISBN.charAt(0);
d1 = chd1 - '0';
chd2 = userInputISBN.charAt(1);
d2 = chd2 - '0';	
chd3 = userInputISBN.charAt(2);
d3 = chd3 - '0';
chd4 = userInputISBN.charAt(3);
d4 = chd4 - '0';
chd5 = userInputISBN.charAt(4);
d5 = chd5 - '0';
chd6 = userInputISBN.charAt(5);
d6 = chd6 - '0';
chd7 = userInputISBN.charAt(6);
d7 = chd7 - '0';
chd8 = userInputISBN.charAt(7);
d8 = chd8 - '0';
chd9 = userInputISBN.charAt(8);
d9 = chd9 - '0';
chd10 = userInputISBN.charAt(9);
d10 = chd10 - '0';
chd11 = userInputISBN.charAt(10);
d11 = chd11 - '0';
chd12 = userInputISBN.charAt(11);
d12 = chd12 - '0';
d13 = 10 - (d1+ 3*d2 + d3 + 3*d4 + d5 + 3*d6 + d7 + 3*d8 + d9 + 3*d10 + d11 + 3*d12)%10;

	
System.out.println("The ISBN-13 number is: " + userInputISBN + d13);
System.out.print(returnOrCheckoutString);
userInputBookInvent = input.next();
inputCR = userInputBookInvent.charAt(0);
if (inputCR == 'R') {
	numBookReturn++;}
else if (inputCR == 'C') {
	numBookCheckout++;	
}
System.out.println("************************************************");
System.out.println("*             Daily Book Inventory             *");
System.out.println("************************************************");

System.out.println("Number of books returned: " + numBookReturn);
System.out.println("Number of books checked out: " + numBookCheckout);
System.out.println("The total of books processed: " + (numBookReturn + numBookCheckout));

System.out.print(contOrQuitString);
userInputYN = input.next();
inputYN = userInputYN.charAt(0); 
if (inputYN == 'Y') {
	quit = false;}
else if (inputYN == 'N') {
	quit = true;	
}
}while(quit = true);
}//end main()
}//end class AssignmentISBN()
