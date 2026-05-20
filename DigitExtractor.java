import java.util.Scanner;
public class DigitExtractor{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		//Output 
		System.out.println("================================");
		System.out.println(" Digit Extractor");
		System.out.println("================================");
		
		//Input 
		int num;
		System.out.print("Enter a 4-digit number: ");
		num = kb.nextInt();
		
		//Processing 
		int thousands, hundreds, tens, ones, sum;
		thousands = num / 1000; //shift 3 decimal places right
		hundreds = (num / 100) % 10; //shift 2 decimal places right and isolate by 10 using mod
		tens = (num / 10) % 10; // shift 1 decimal place right and isolate by 10 using mod.
		ones = num % 10; // Just isolate by 10 using mod.
		
		sum = thousands + hundreds + tens + ones;
		
		//Output 
		System.out.println("--------------------------------");
		System.out.println("Thousands = " + thousands);
		System.out.println("Hundred   = " + hundreds);
		System.out.println("Tens      = " + tens);
		System.out.println("Ones      = " + ones);
		System.out.println("--------------------------------");
		System.out.println(" Sum of digits = " + sum);
		System.out.println("================================");
		
	}
}