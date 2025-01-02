class BitWise {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int multiply = multiplication(a, b);
        System.out.println(multiply);
		
		int sum=getsum(a,b);
		System.out.println(sum);
		
		boolean ageIsAboveTen=false;
	    boolean check=checking(ageIsAboveTen);
	    System.out.println(check);

    }

    public static int multiplication(int a, int b) {

        System.out.println("multiply");
        int c = a & b;
        return c;

    }
	public static int getsum(int a, int b){
    System.out.println("sum");
    int c= a | b;
    return c;
    }
	
	public static boolean checking(boolean ageIsAboveTen){
    System.out.println("check");
    boolean output=!ageIsAboveTen;
    return output;

}

}