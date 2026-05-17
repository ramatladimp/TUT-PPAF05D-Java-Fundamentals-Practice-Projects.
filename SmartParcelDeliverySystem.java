import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class SmartParcelDeliverySystem{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		
	//Variables
	String name, type = " ", fragile = " ", disType = " ", days = " ";
	double weight, distance, baseCost, deliverySurcharge = 0.0, fragileSurcharge = 0.0, discount = 0.0, totalCost;
	int deliveryType, isFragile;
	
	//Output 
	System.out.println("====================================================");
	System.out.println("	Smart Parcel Delivery System	");
	System.out.println("====================================================");
	
	//Input 
	System.out.print("Enter sender name: ");
	name = kb.next();
	System.out.print("Enter parcel weight (kg): ");
	weight = kb.nextDouble();
	System.out.print("Enter delivery distance (km): ");
	distance = kb.nextDouble();
	System.out.print("Delivery type (1=Standard 2=Express 3=Overnight): ");
	deliveryType = kb.nextInt();
	System.out.print("Is the parcel fragile? (1=Yes / 0=No): ");
	isFragile = kb.nextInt();

	//Processing 
	baseCost = weight * distance * 0.05;
	
	//Delivery type
	if (deliveryType == 1){
		type = "Standard";
	}else if(deliveryType == 2){
		type = "Express";
	}else if(deliveryType == 3){
		type = "Overnight";
	}
	
	//Delivery type surcharge.
	if (deliveryType == 1){
		deliverySurcharge = 0.00;
		
	}else if (deliveryType == 2){
		deliverySurcharge = 25.00;
		
	}else if (deliveryType == 3){
		deliverySurcharge = 60.00;
	}
	
	//Fragile
	fragile = (isFragile == 1)? "Yes" : "No";
	
	//Fragile surchage
	if (isFragile == 1){
		fragileSurcharge = 15.00;
	}else if (isFragile == 0){
		fragileSurcharge = 0.00;
	}
	
	//Type of discount
	
	if (baseCost >= 200.0){
		disType = "10%";
		
	}else if (baseCost >= 100.0){
		disType = "5%";
		
	}else{
		disType = "no discount";
	}
	
	
	//Discount 
	if (baseCost >= 200.0){
		discount = baseCost * 0.10;
	}else if (baseCost >= 100.0){
		discount = baseCost * 0.05;
	}else{
		discount = baseCost * 0;
	}
	
	//Estimated delivery days.
	if(deliveryType == 1){
		days = "5 day";
		
	}else if (deliveryType == 2){
		days = "2 day";
		
	}else if(deliveryType == 3){
		days = "1 day";
	}
	totalCost = baseCost + deliverySurcharge + fragileSurcharge - discount;
	
	//Final Output 
	
	System.out.println("-------------------------------------------------");
	System.out.println("		DELIVERY SUMMARY   		");
	System.out.println("---------------------------------------------------");
	
	System.out.println("Sender			: " + name);
	System.out.println("Weight			: " + df.format(weight) + " kg");
	System.out.println("Distance		: " + df.format(distance) + " km");
	System.out.println("Delivery Type		: " + type);
	System.out.println("Fragile			: " + fragile);
	System.out.println("---------------------------------------------------");
	
	System.out.println("Base Cost		: R " + df.format(baseCost));
	System.out.println("Type Surchage		: R " + df.format(deliverySurcharge));
	System.out.println("Fragile Fee		: R " + df.format(fragileSurcharge));
	System.out.println("Discount (" + disType + ")		: R " + df.format(discount));
	
	System.out.println("TOTAL COST		: R " + df.format(totalCost));
	System.out.println("Est. Delivery		: " + days + "(s)");
	
	System.out.println("===================================================");
	System.out.println("	Thank you for shipping with us! 		   ");
	System.out.println("===================================================");
	
	
	}
}