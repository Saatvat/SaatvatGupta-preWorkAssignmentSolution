 import java.util.Scanner;

public class multiOp {
	Scanner sc = new Scanner(System.in);

	
    //function to checkPalindrome
public void checkPalindrome(int num) {
	int rev = num;
	int result = 0;
	while (num != 0) {
		result = result * 10 + num % 10;
		num = num / 10;
	}
	
	if (result == rev)
		System.out.println("Palindrome");
	else
		System.out.println("Not a Palindrome");
}


     //function to printPattern
public void printPattern(int num) {
	for (int i = 0; i < num; i++) {
		for (int j = num - i; j > 0; j--) {
			System.out.print("*");
		}
		System.out.println(" ");
	}

}


   //function to check no is prime or not
 public void checkPrimeNumber(int num) {
	 int count = 0;
	 for (int i = 2; i <= num / 2; i++) {
		 if (num % i == 0)
			 count++;	 
	 }
	 if (count == 0)
		 System.out.println("Prime Number");
	 else
		 System.out.println("Not a Prime Number");
 }

 
   // function to print Fibonacci Series
   public void printFibonacciSeries(int num) {

         //initialize the first and second value as 0,1 respectively.
    int first = 0, second = 1, temp = 0;
    System.out.print("0, 1, ");
    for (int i = 2; i < num; i++) {
    	temp = second;
    	second += first;
    	first = temp;
    	if (i != num-1)
    		System.out.print(second + ", ");
    	else 
    		System.out.print(second);
    }

 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiOp obj = new multiOp();
        int choice;
        Scanner sc = new Scanner(System.in);

do {

System.out.println("\n\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"
+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();
choice = sc.nextInt();


switch (choice) {

case 0:
choice = 0;
break;


case 1: {
	System.out.print("Enter number : ");
	int num = sc.nextInt();
	obj.checkPalindrome(num);
}
break;


case 2: {
	System.out.print("Enter number : ");
	int num = sc.nextInt();
	obj.printPattern(num);
}
break;


case 3: {
	System.out.print("Enter number : ");
	int num = sc.nextInt();
	obj.checkPrimeNumber(num);
}
break;


case 4: {
	System.out.print("Enter number : ");
	int num = sc.nextInt();
	obj.printFibonacciSeries(num);
}
break;


default:
System.out.println("Invalid choice. Enter a valid no.\n");
}


} while (choice != 0);

System.out.println("Exited Successfully!!!");
sc.close();

}
	
	}



