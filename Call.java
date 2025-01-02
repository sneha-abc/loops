Modifier accessmodifier returntype method()

return;



local variable with the method 
 parameteraized variable inside the bracet
 
 parameteraized method
 non
 
 arguments for caller method
 parameters which is inside the bracet
 
 
 
class Testshort{
    public static void main(String[] args) {
        System.out.println("Calling main method");

        
      short svalue = getsvalue;

        System.out.println(svalue);
		 
    }

     
    public static short getsvalue (short s) {
        System.out.println("Calling  getsvalue");
        return (short)2;
    }
}



  class CarsCount {
    public static void main(String[] args) {
        System.out.println("Calling main method");

        // Correct method call
       int cars = numberOfCars(10);

        System.out.println(cars);
		 
    }

    // Correct method definition
    public static int  numberOfCars(int number) {
        System.out.println("Calling  numberOfCars");
        return  10;
    }
}
