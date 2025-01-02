class Condition{
public static void main(String[] args){

boolean isPowerAvilable=true;

int number = 7;  

 int age = 25;
 
 int marks = 75;

		if (isPowerAvilable   )
        {
            System.out.println("power available");
        }
		
		
        if (number % 2 == 0) {
            System.out.println(" even number");
        } else {
            System.out.println("odd number");
        }

		if (age < 13) {
            System.out.println("You are a Child");
        } else if (age >= 13 && age < 30) {
            System.out.println("You are a Teenager");
        } 
		
		
		if (marks >= 90) {
            System.out.println("Grade: A+");
        }
		else if (marks >= 80) {
            System.out.println("Grade: A");
        } 
		else if (marks >= 70) {
            System.out.println("Grade: B");
        }
		else if (marks >= 60) {
            System.out.println("Grade: C");
        }
		else if (marks >= 50) {
            System.out.println("Grade: D");
        } 
		else {
            System.out.println("Grade: F ");
        }	

	}
}
