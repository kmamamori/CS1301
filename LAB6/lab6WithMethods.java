import java.util.*;

/* This program should do exactly what lab6Original does, but with multiple methods 
 ** Check out the main method to see how it makes use of (and calls) multiple methods.
 ** Then write these methods where prompted.
 ** An example is given to you: the method called promptUserForName.
 **/
public class lab6WithMethods {

    /* Example: promptUserForName() is given to you
     **/
	 public static String promptUserForName() {
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        return in.next();   
    }
    
    /* Here is the signature of the method called greetUser:
     ** Complete its body
     **/
        // your work goes here
	 public static void greetUser(String message, String user) {
	 	System.out.println(message + " " + user);
    }
    
    /* Here: Design the method called promptUserForAge */
	public static int promptUserForAge(){
		System.out.println("What is your age?");
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
    /* Here: Design the method called guessGradeLevel */
    public static void guessGradeLevel(int age){
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
	
    /* Here: Design the method called promptUserFor */
    public static double promptUserForW(){
		Scanner in = new Scanner(System.in);
		System.out.println("What is your weight(kg)?");
		return  in.nextDouble();
		}
		
	public static double promptUserForH(){
		Scanner in = new Scanner(System.in);
		System.out.println("What is your height(m)?");
		return in.nextDouble();
		}
		
	/* Here: Design the method called computeBMI */
	public static double computeBMI(double weight, double height){
		double BMI = weight / (height * height);
		return BMI;
	}
	/* Here: Design the method called printBMIRelevantMessage */
    public static void printBMIRelevantMessage(double BMI){
		if (BMI < 18.5) 
            System.out.println("You are underweight.");
		if(BMI < 25)
            System.out.println("Your weight is fine.");
		else if (BMI < 30)
            System.out.println("You are overweight.");
		else
            System.out.println("Your weight puts you in the obese range.");
		return;
	}
	/**************************************************************************************************
     ** The new and improved main method: it reads much more easily than the one from lab6Original.java
     ** However, you need to write the method signatures and bodies corresponding to each of the method 
     ** calls you see in the main method
     **/
    public static void main(String[] args) {
		String name = promptUserForName();
        greetUser("Welcome", name);

		int age = promptUserForAge();
		guessGradeLevel(age);
			
		double weight = promptUserForW();
		double height = promptUserForH();
		double BMI = computeBMI(weight, height);
		printBMIRelevantMessage(BMI);
        
        greetUser("Good bye", name);
	}

}