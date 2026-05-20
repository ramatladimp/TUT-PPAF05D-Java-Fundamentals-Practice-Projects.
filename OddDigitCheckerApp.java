import java.util.Scanner;
public class OddDigitCheckerApp{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
	//Output 
	System.out.println("===========================");
	System.out.println("  Right Triangle Calculator");
	System.out.println("===========================");
	
	
	//Input 
	int num;
	System.out.print("Enter a number: ");
	num = kb.nextInt();
	
	//Decision making and output
	if (num % 2 != 0){
		
		System.out.println(num + " is odd.");
		int convertedNum = num - 1;
		System.out.println("Converted even number: " + convertedNum);
		int ones = convertedNum % 10;
		System.out.println("Ones digit of " + convertedNum + " = " + ones);
		
	}else{
		System.out.println(num + " is NOT an odd number.");
	}
	
	System.out.println("---------------------------");
	
	}
}