import java.util.Scanner;
import java.text.DecimalFormat;

public class StudentScore{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//Variables
		int numOfStudents, marks, totalScore;
		double average;
		String grade;
		int again;
		
		do {
			totalScore = 0;
			grade = " ";
			
			System.out.print("How many students are there: ");
		numOfStudents = kb.nextInt();
		
		for (int i = 1; i <= numOfStudents; i++){
		
		System.out.print("Enter score for student " + i + " (0-100): ");
		marks = kb.nextInt();
		
		totalScore += marks;
		}
		System.out.println("Total score: " + totalScore);
		
		average = (double)totalScore/numOfStudents;
		
		System.out.println("Average score: " + df.format(average));
		
		if(average >= 90){
			grade = "A";
			System.out.println("Letter Grade: " + grade);
		}else if (average >= 80){
			grade = "B";
		}else if(average >= 70){
			grade = "C";
			System.out.println("Letter Grade: " + grade);
		}else {
			grade = "F";
		}
		System.out.println("Letter Grade: " + grade);
		System.out.print("Track another class (1 = yes, 0 = no): ");
		again = kb.nextInt();
		
		} while(again == 1);
		System.out.println("Goodbye!");
	}
}