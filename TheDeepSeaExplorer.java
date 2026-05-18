import java.util.Scanner;
import java.util.Random;
public class TheDeepSeaExplore{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		
	//Variables 
	String name;
	char rank;
	int depth, currentStrength, pressureAnomaly, adjDepth, exertion, safeZone, value;
	double oxygenLevel, oxygenConsumed, remOxygen, survivalScore;
	boolean exceed;
	
	//Input 
	System.out.print("Enter driver's name: ");
	name = kb.nextLine();
	System.out.print("Enter driver's rank: ");
	rank = kb.next().charAt(0);
	System.out.print("Enter depth reached in meters(1-500): ");
	depth = kb.nextInt();
	System.out.print("Enter tank oxygen level(%): ");
	oxygenLevel = kb.nextDouble();
	
	
	//Processing 
	currentStrength = rd.nextInt(50) + 1;
	pressureAnomaly = rd.nextInt(61) - 30;
	
	adjDepth = Math.abs(depth - pressureAnomaly);
	
	exertion = Math.max(adjDepth, (currentStrength*8));
	safeZone = Math.min(adjDepth, (currentStrength*8));
	oxygenConsumed = Math.PI * adjDepth * (currentStrength/100.0);
	remOxygen = Math.abs(oxygenLevel - oxygenConsumed);
	value = rank;
	exceed = adjDepth > value;
	
	survivalScore = Math.random() * remOxygen;
	
	//Output 
	System.out.println("\n=== Deep Sea Explore ===");
	System.out.println("Driver: " + name);
	System.out.println("Rank: " + rank);
	System.out.println("Depth Reached: " + depth);
	System.out.println("Tank Oxygen: " + oxygenLevel + "%");
	System.out.print("Current Strength: " + currentStrength);
	System.out.println(" | Pressure Anomaly: " + pressureAnomaly);
	
	System.out.println("\nAdjusted Depth: " + adjDepth + "m");
	System.out.println("Max Exertion: " + exertion);
	System.out.println("Min Safe Zone: " + safeZone);
	System.out.println("Oxygen Consumed: " + Math.round(oxygenConsumed * 100)/100.0);
	System.out.println("Remaining Oxygen: " + Math.round(remOxygen * 100)/100.0);
	
	System.out.println("\nAdjusted Depth (" + adjDepth + ") > ASCII of '" + rank + "' (" + value + ")? " + exceed);
	
	System.out.println("\nSurvival Score: " + Math.round(survivalScore * 100)/100.0);
	
	if (rank >= 'C'){
		System.out.println("Elite diver status achieved!");
	}else{
		System.out.println("Keep training, rookie!");
	}
	
	}
}