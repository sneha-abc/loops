class Sofa {
    static String brand;
    static int warrantyYears;
    String material;
    String color;

    
    static {
        System.out.println("static block initialization");
        brand = "ComfortCreations";
        warrantyYears = 5;  
    }

     
    {
        System.out.println("non-static block initialization");
        material = "Thomas Blakemore";
        color = "brown";
    }

    public static void main(String[] args) {
         
        System.out.println( brand);
        System.out.println( warrantyYears);

         
        Sofa sofa1 = new Sofa();
         
        System.out.println(sofa1.material); 
		System.out.println(sofa1.color);

        Sofa sofa2 = new Sofa();
         
        System.out.println(sofa2.material);
		System.out.println(sofa2.color);

         
        Sofa sofa3 = new Sofa();
         
        System.out.println(sofa3.material);  
        System.out.println(sofa3.color);
		
		Sofa sofa4 = new Sofa();
         
        System.out.println(sofa4.material);  
        System.out.println(sofa4.color);
		
		
		Sofa sofa5 = new Sofa();
         
        System.out.println(sofa5.material);  
        System.out.println(sofa5.color);
		
		
		Sofa sofa6 = new Sofa();
         
        System.out.println(sofa6.material);  
        System.out.println(sofa6.color);
		
		
		Sofa sofa7 = new Sofa();
         
        System.out.println(sofa7.material);  
        System.out.println(sofa7.color);
		
		Sofa sofa8 = new Sofa();
         
        System.out.println(sofa8.material);  
        System.out.println(sofa8.color);
		
		
		Sofa sofa9 = new Sofa();
         
        System.out.println(sofa9.material);  
        System.out.println(sofa9.color);
		
		
		Sofa sofa10 = new Sofa();
         
        System.out.println(sofa10.material);  
        System.out.println(sofa10.color);
        
    }
}
