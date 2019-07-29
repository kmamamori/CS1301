/*****************************************************************************
 * Welcome to fixMyCode.java!
 * In this file, I need help. My methods are not doing what they should
 * and I need you to help me fix them
 * Before each method, you will find a header, in comment, that describes
 * what I am expecting the method to do
 *****************************************************************************/

public class fixMyCode {

    /*************************************************************************
     * This method takes an array of integers and returns the average value of 
     * its elements: the result is a double
     *************************************************************************/
    public static double average(int[] A) {
        double sum = 0;
        double average;
        
        for (int i=0; i<A.length; i++)
            sum = sum + A[i];
        
        average = sum / A.length;
        return average;
    }
    
    /*************************************************************************
     * This method takes an array A of doubles and a double d
     * and returns true if d is found within A  
     *************************************************************************/
	public static boolean find(double[] A, double d) {
        for (int i=0; i<A.length-1; i++) {
            if (A[i]==d){
			 return true;
			}	
		}
            return false;
		}
    
    
    /*************************************************************************
     * This method takes an array A of strings 
     * and returns the length of its longest string element  
     *************************************************************************/
    public static double longest(String[] A) {
       	int max = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i].length() > A[i+1].length())
              	return A[i].length();
        }
        return max;
    }
    
     /*************************************************************************
     * This method creates a new string made of every other character of the 
     * input string, and returns it
     *************************************************************************/
    public static String everyOther(String str) {
        String result = "";
        for (int i=0; i<str.length(); i=i+2){ 
       			result = result + str.charAt(i);
        			System.out.println(result);
    	}
		return result;
	}
    
    /*************************************************************************
    * Main method where the above methods will be tested 
    *** In this part of the file, we test the above methods.
    *** One test per method is provided to you
    *** Please add at least one more test per method to show the flaw
    ***   of each method
    **************************************************************************/
    public static void main(String[] args) {
	
	/***** Testing Average ***/
		int[] A = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(average(A));
	/***My Testing****/ //Calculate the average for this semester
		int[] Q = {98, 90, 80, 79};
		System.out.println(average(Q));	
        
	/***** Testing Find ***/
        double[] D = {0.1, 0.7, 9.7, 4.5, 5.3};
        System.out.println(find(D,0.1));
	/*****My Testing****/ //Search if i had taken the same grade before
		double[] R = {98, 90, 80, 79};
		System.out.println(find(R,90));
        		
	/***** Testing Longest ***/
       String[] S = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
       System.out.println(longest(S));
   /*****My testing****/ //Find the number of the longest name of my family member
	   String[] J = {"Deyanira", "Andrea", "Manuel", "Sandra", "Jorge", "Jesus", "Ana"};
	   System.out.println(longest(J));
		
	/***** Testing everyOther ***/
        String G = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(everyOther(G));
	/*****My Testing*****/ //choose only odd numbers
		String U = "123456789";
		System.out.println(everyOther(U));	
		
    }
}