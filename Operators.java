class Operators{
	public static void main(String[] args){
	 
		int a=10;
		
		int b=15;
		
		int c=20;
		
	int add=addition(a,b,c);
	System.out.println(add);
	
	int substract=substraction(a,b,c);
	System.out.println(substract);
	
	int multiply=multiplication(a,b,c);
	System.out.println(multiply);
	
	int divide=division(a,b,c);
	System.out.println(divide);
	
	float modulus=modulation(a,b,c);
	System.out.println(modulus);

	}
	public static int addition(int a,int b,int c){
	System.out.println("addition");
			int d=a+b+c;
			return d;
       }

public static int substraction(int a,int b,int c){
	System.out.println(" substraction");
			int d=a-b-c;
			return d;
       }

public static int multiplication(int a,int b,int c){
	System.out.println("multiplication");
	 int d=a*b*c;
	return d;
	
}
public static int division(int a,int b,int c){
	System.out.println("division");
	int d=a/b/c;
	return d;
}

public static float modulation(int a,int b,int c){
	
	System.out.println("modulation");
	float d=a%b%c;
	return d;
}

}