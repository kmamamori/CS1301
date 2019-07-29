import java.util.*;
public class lab6Original {
	
	//1st method
	public static String userName(){
	System.out.println("What is your name?");
	Scanner in = new Scanner(System.in);
	String A = in.next();
	return A;
	}
		
	//2nd method
	public static void ageNum(){
	Scanner in = new Scanner(System.in);
	System.out.println("What is your age?");
	int age = in.nextInt();
	if(age<5)
		System.out.println("Your are still too young to worry about school!");
	else if (age == 5)
		System.out.println("You are probably a KinderGartner student!");
	else if(age >= 6 && age < 18)
		System.out.println("You are a " + (age-5) + " grade student.");
	else
		System.out.println("You are ready for college!");
	return;
	}
	
	//3rd method
	public static void bodyResult(double BMI){
		// Depending on BMI, give relevant comment
		if (BMI < 18.5) 
            System.out.println("You are underweight.");
		else if(BMI < 25)
            System.out.println("Your weight is fine.");
		else if (BMI < 30)
            System.out.println("You are overweight.");
		else
            System.out.println("Your weight puts you in the obese range.");
	}
	
	//3rd method
	public static double bodyNum(){
		Scanner in = new Scanner(System.in);
		System.out.println("What is your weight(kg)?");
		double weight = in.nextDouble();
		System.out.println("what is your height(m)?");
		double height = in.nextDouble();
		// Computes the BMI of user
		double BMI;
		BMI = weight / (height * height);
		bodyResult(BMI);
		return BMI;
	}

    public static void main(String[] args) {
	
        // Asks user for name and greets the user
		String name = userName();
		System.out.println("Hi, " + name + "!");
				
        // Asks user for age and decides which grade level the user should be at
		ageNum();

	    // Asks user for height and weight in metric
		bodyNum();
		
        // Prints a good-bye message using the user's name
        System.out.println("Good bye, " + name + "!");
    }
}