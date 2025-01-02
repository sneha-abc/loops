class Shoes {
    static String brand;
    static int warrantyMonths;
    String type;  
    int size;  

    
    static {
        System.out.println("static initialaization block");
        brand = "Nike";
        warrantyMonths = 12;
    }

     
    {
        System.out.println("non-static initialaization block");
        type = "Casual";  
        size = 7; 
    }

    public static void main(String[] args) {
         
        System.out.println(brand);
        System.out.println(warrantyMonths);

         
        Shoes shoe1 = new Shoes();
         
        System.out.println(shoe1.type);
		System.out.println(shoe1.size);

         
        Shoes shoe2 = new Shoes();
         
        System.out.println(shoe2.type);
		System.out.println(shoe2.size);


		Shoes shoe3 = new Shoes();
        System.out.println(shoe3.type);  
        System.out.println( shoe3.size);
		
		
		Shoes shoe4 = new Shoes();
        System.out.println(shoe4.type);  
        System.out.println(shoe4.size);
		
		Shoes shoe5 = new Shoes();
        System.out.println(shoe5.type);  
        System.out.println(shoe5.size);
		
		
		Shoes shoe6 = new Shoes();
        System.out.println(shoe6.type);  
        System.out.println( shoe6.size);
		
		Shoes shoe7 = new Shoes();
        System.out.println(shoe7.type);  
        System.out.println(shoe7.size);
		
		
		Shoes shoe8 = new Shoes();
        System.out.println(shoe8.type);  
        System.out.println(shoe8.size);
		
		
		Shoes shoe9 = new Shoes();
        System.out.println(shoe9.type);  
        System.out.println( shoe9.size);
        

        Shoes shoe10 = new Shoes();
        System.out.println(shoe10.type);  
        System.out.println(shoe10.size);		
    }
}
