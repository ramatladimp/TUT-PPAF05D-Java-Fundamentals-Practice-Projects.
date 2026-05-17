import java.util.Scanner;
import java.util.Random;
public class FitnessScoringApp{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		
	//Variables
	String name;
	char fitnessGrade;
	int numOfReps, resistanceLevel, scaled, max, min, difference, ascii;
	double weight, caloriesBurned, bonus;
	boolean exceed;
	
	//Input 
	System.out.print("Please enter your name: ");
	name = kb.next();
	System.out.print("Please enter your fitness grade: ");
	fitnessGrade = kb.next().charAt(0);
	System.out.print("Enter the number of reps completed: ");
	numOfReps = kb.nextInt();
	System.out.print("Please enter your body weight in Ibs: ");
	weight = kb.nextDouble();
	
	//Random resistance level
	resistanceLevel = rd.nextInt(10) + 1;
	scaled = resistanceLevel * 10;
	
	//Processing 
	max = Math.max(numOfReps, scaled);
	min = Math.min(numOfReps, scaled);
	difference = Math.abs(numOfReps - scaled);
	caloriesBurned = Math.PI * weight  * numOfReps/1000.0;
	
	//Casting 
	ascii = fitnessGrade;
	
	//Logic check
	exceed = numOfReps > ascii;
	
	//A random bonus multiplier
	bonus = Math.random() * caloriesBurned;
	
	
	//Output 
	System.out.println("\n=== Workout Score Calculator ===");
	System.out.println("Athlete : " + name);
	System.out.println("Fitness Grade: " + fitnessGrade + " (ASCII: " + ascii + ")");
	System.out.println("Reps completed: " + numOfReps);
	System.out.println("Body weight: " + weight + " Ibs");
	System.out.println("Random Resistance Level: " + resistanceLevel + " (scaled: " + scaled + ")");
	
	System.out.println("\nMax (reps vs scaled resistance): " + max);
	System.out.println("\nMin (reps vs scaled resistance): " + min);
	System.out.println("Performance Gap: " + difference);
	System.out.println("Calories Burned: " + Math.round(caloriesBurned*100)/100.0);
	System.out.println("Bonus Calories (random multiplier): " + Math.round(bonus*100)/100.0);
	
	System.out.println("\nReps (" + numOfReps + ") > ASCII of '" + fitnessGrade + "' (" + ascii + ")? " + exceed);
	if (exceed){
		System.out.println("You crushed your grade banchmark!");
	}else{
		System.out.println("Keep pushing to beat your benchmark");
	}
	
	System.out.println("\nFinal Workout Score: " + difference);
	
	}
}