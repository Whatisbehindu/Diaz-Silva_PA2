/*Declare Class BMICalc
 * Read user input (method)
 * 		Determines unit type (method)
 * 			Undergoes a choice to choose metric or imperial (methods)
 * 				(Must enter valid value or keeps prompting to choose)
 * Depending on the unit 
 * 		Read in user's weight(private variable)
 * 		Read in user's height (private variable)
 * 			Exits program if negative value
 * Calculate BMI (Method)
 * 		Calls bmi category (method)
 * 		calls display bmi (method)
 * */
import java.util.Scanner;

public class BMICalculator {
	//Create scanner
	Scanner input = new Scanner(System.in);
	
	//weight and height the user will set
	private double weight;
	private double height;
	
	//Choice of imperial (1) or Metric (0)
	private int choice;
	
	//BMI
	private double bmi;
	
	//BMI Category
	private String category;
	
	//Printing the BMI and the Category
	public void displayBmi() {
		System.out.printf("Your BMI is %.2f, the category is %s", bmi, category);
	}
	
	//Starts the BMI calculation process
	public void readUserData() {
		int unit; // 1 for imperial, 0 for metric
		unit = readUnitType();
		readMeasurementData(unit);
		choice = unit;
	}
	
	//Begins reading process
	private void readMeasurementData(int choice) {
		if (choice == 1)
			readImperialData();
		else
			readMetricData();
	}
	
	//User input for imperial data
	private void readImperialData() {
		System.out.println("What is your weight in pounds?");
		setWeight();
		System.out.println("what is your height in inches?");
		setHeight();
	}
	
	//User input for metric data
	private void readMetricData() {
		System.out.println("What is your weight in kg?");
		setWeight();
		System.out.println("what is your height in centimeters?");
		setHeight();
	}
	
	//Choice between imperial or metric units
	private int readUnitType() {
		int choice=2;
		while (choice>=2) {
			System.out.println("Do you want to use metric or imperial units?");
			System.out.println("Type 1 for imperial, 0 for metric");
			choice = input.nextInt();
			if (choice == 0 || choice == 1 )
				break;
			else 
				System.out.println("Enter a valid answer");
			choice = 2;
		}
		return choice;
	}
	
	//Set weight method only accessible in this class
	private void setWeight() {
		double weight;
		weight = input.nextDouble();
		if (weight<0)
			System.exit(0);
		else
			this.weight = weight;
	}
	
	//Set height method only accessible in this class
	private void setHeight() {
		double height;
		height = input.nextDouble();
		if (height<0)
			System.exit(0);
		else
			this.height = height;
	}	
	
	//Get weight method public
	public double getWeight() {
		return weight;
	}
	
	//Get height method public
	public double height() {
		return height;
	}
	
	//Calculate BMI
	public void calculateBmi() {
		double bmi;
		if (choice == 1 ) {
			bmi = (703*weight)/(Math.pow(height, 2));
			this.bmi=bmi;
			calculateBmiCategory(bmi);
		}
		else {
			bmi = (weight)/(Math.pow(height/100, 2));
			this.bmi=bmi;
			calculateBmiCategory(bmi);
		}
		
	}
	
	//Finding the range
	private void calculateBmiCategory(double bmi) {
		String category;
		if (bmi < 18.5)
			category = "Underweight";
		else {
			if (bmi >= 18.5 && bmi <= 24.9)
				category = "Normal Weight";
			else {
				if (bmi >=25 && bmi <= 29.9)
					category = "Overweight";
				else {
					category = "Obesity";
				}
			}
		}
		this.category = category;
	}
	
}
