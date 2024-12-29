class Car{
	String brand;
	String name;
	String colour;
	int numberOfGear;
	int price;
	
	public Car(String brand,String name, String colour , int numberOfGear , int price){
		this.brand =brand;
		this.name =name;
		this.colour =colour;
		this.numberOfGear=numberOfGear;
		this.price=price;
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setColour(String colour){
		this.colour=colour;
	}
	
	public void setNumberOfGear(int numberOfGear){
		this.numberOfGear=numberOfGear;
	}
	
	public void setPrice(int price){
		this.price=price;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String getName(){
		return name;
	}
	
	public String getColour(){
		return colour;
	}
	
	public int getNumberOfGear(){
		return numberOfGear;
	}
	
	public int getPrice(){
		return price;
	}
	
	  
	public static void main(String[] args){
		 
		
		System.out.println("car1 details");
System.out.println("");
		Car car1 = new Car("Bayerische Motoren Werke" , "BMW" , "black" , 6 , 250000);
		
        System.out.println(car1.brand);
        System.out.println(car1.name);
        System.out.println(car1.colour);
        System.out.println(car1.numberOfGear);
        System.out.println(car1.price);	
System.out.println("");
		
		car1.setBrand("Bayerische Motoren Werke1");
		car1.setName("BMW1");
		car1.setColour("black1");
		car1.setNumberOfGear(7);
		car1.setPrice(288880);
		
		System.out.println(car1.getBrand());
		System.out.println(car1.getName());
		System.out.println(car1.getColour()); 
		System.out.println(car1.getNumberOfGear());
		System.out.println(car1.getPrice());
System.out.println("");
System.out.println("");

        System.out.println("car2 details");
System.out.println("");
		Car car2 = new Car( "Tesla", "Model S", "Red", 1, 80000);
		
        System.out.println(car2.brand);
        System.out.println(car2.name);
        System.out.println(car2.colour);
        System.out.println(car2.numberOfGear);
        System.out.println(car2.price);
System.out.println("");
            car2.setBrand("Tesla");
			car2.setName("Model S");
			car2.setColour("Red");
			car2.setNumberOfGear(1);
			car2.setPrice(80000);
			
			System.out.println(car2.getBrand());
			System.out.println(car2.getName());
			System.out.println(car2.getColour());
			System.out.println(car2.getNumberOfGear());
			System.out.println(car2.getPrice());		
		
System.out.println("");
System.out.println("");
		
		System.out.println("car3 details");
System.out.println("");
		Car car3 = new Car( "Audi", "A6", "Silver", 7, 60000);
		
        System.out.println(car3.brand);
        System.out.println(car3.name);
        System.out.println(car3.colour);
        System.out.println(car3.numberOfGear);
        System.out.println(car3.price);	
System.out.println("");
			car3.setBrand("Audi");
			car3.setName("A6");
			car3.setColour("Silver");
			car3.setNumberOfGear(7);
			car3.setPrice(60000);
			
			System.out.println(car3.getBrand());
			System.out.println(car3.getName());
			System.out.println(car3.getColour());
			System.out.println(car3.getNumberOfGear());
			System.out.println(car3.getPrice());
System.out.println("");
System.out.println("");
		
		System.out.println("car4 details");
		
System.out.println("");
		
		Car car4 = new Car("Mercedes-Benz", "C-Class", "White", 6, 450000 );
		
        System.out.println(car4.brand);
        System.out.println(car4.name);
        System.out.println(car4.colour);
        System.out.println(car4.numberOfGear);
        System.out.println(car4.price);		
		
System.out.println("");
		
		    car4.setBrand("Mercedes-Benz");
			car4.setName("C-Class");
			car4.setColour("White");
			car4.setNumberOfGear(6);
			car4.setPrice(450000);
			
			System.out.println(car4.getBrand());
			System.out.println(car4.getName());
			System.out.println(car4.getColour());
			System.out.println(car4.getNumberOfGear());
			System.out.println(car4.getPrice());
			
System.out.println("");
System.out.println("");
			
		System.out.println("car5 details");
		
System.out.println("");
		Car car5 = new Car("Toyota", "Corolla", "Blue", 5, 20000 );
		
        System.out.println(car5.brand);
        System.out.println(car5.name);
        System.out.println(car5.colour);
        System.out.println(car5.numberOfGear);
        System.out.println(car5.price);
System.out.println("");
			car5.setBrand("Toyota");
			car5.setName("Corolla");
			car5.setColour("Blue");
			car5.setNumberOfGear(5);
			car5.setPrice(20000);
			
			System.out.println(car5.getBrand());
			System.out.println(car5.getName());
			System.out.println(car5.getColour());
			System.out.println(car5.getNumberOfGear());
			System.out.println(car5.getPrice());
		
System.out.println("");
System.out.println("");
		
		System.out.println("car6 details");
		
System.out.println("");
		
		Car car6 = new Car("Ford", "Mustang", "Yellow", 5, 35000 );
		
        System.out.println(car6.brand);
        System.out.println(car6.name);
        System.out.println(car6.colour);
        System.out.println(car6.numberOfGear);
        System.out.println(car6.price);	

System.out.println("");
		
			car6.setBrand("Ford");
			car6.setName("Mustang");
			car6.setColour("Yellow");
			car6.setNumberOfGear(5);
			car6.setPrice(35000);
			
			System.out.println(car6.getBrand());
			System.out.println(car6.getName());
			System.out.println(car6.getColour());
			System.out.println(car6.getNumberOfGear());
			System.out.println(car6.getPrice());
		
System.out.println("");
System.out.println("");
		
		System.out.println("car7 details");
		
System.out.println("");
		
		Car car7 = new Car( "Jaguar", "XE", "Green", 8, 55000);
		
        System.out.println(car7.brand);
        System.out.println(car7.name);
        System.out.println(car7.colour);
        System.out.println(car7.numberOfGear);
        System.out.println(car7.price);		
		
System.out.println("");
		
			car7.setBrand("Jaguar");
			car7.setName("XE");
			car7.setColour("Green");
			car7.setNumberOfGear(8);
			car7.setPrice(55000);
			
			System.out.println(car7.getBrand());
			System.out.println(car7.getName());
			System.out.println(car7.getColour());
			System.out.println(car7.getNumberOfGear());
			System.out.println(car7.getPrice());
		
System.out.println("");
System.out.println("");
		
		System.out.println("car8 details");
		System.out.println("");
		Car car8 = new Car("Chevrolet", "Camaro", "Orange", 6, 42000 );
		
        System.out.println(car8.brand);
        System.out.println(car8.name);
        System.out.println(car8.colour);
        System.out.println(car8.numberOfGear);
        System.out.println(car8.price);	
		
System.out.println("");

			car8.setBrand("Chevrolet");
			car8.setName("camaro");
			car8.setColour("Orange");
			car8.setNumberOfGear(6);
			car8.setPrice(42000);
			
			System.out.println(car8.getBrand());
			System.out.println(car8.getName());
			System.out.println(car8.getColour());
			System.out.println(car8.getNumberOfGear());
			System.out.println(car8.getPrice());
		
System.out.println("");
System.out.println("");
		
		
		System.out.println("car9 details");
		
System.out.println("");
		
		Car car9 = new Car("Lexus", "RX", "Purple", 7, 55000 );
		
        System.out.println(car9.brand);
        System.out.println(car9.name);
        System.out.println(car9.colour);
        System.out.println(car9.numberOfGear);
        System.out.println(car9.price);	

System.out.println("");
		
			car9.setBrand("Lexus");
			car9.setName("RX");
			car9.setColour("Purple");
			car9.setNumberOfGear(7);
			car9.setPrice(55000);
			
			System.out.println(car9.getBrand());
			System.out.println(car9.getName());
			System.out.println(car9.getColour());
			System.out.println(car9.getNumberOfGear());
			System.out.println(car9.getPrice());
			
System.out.println("");
System.out.println("");
			
			
		
		System.out.println("car10 details");
		
System.out.println("");
		
		Car car10 = new Car("Honda", "Civic", "Grey", 6, 25000 );
		
        System.out.println(car10.brand);
        System.out.println(car10.name);
        System.out.println(car10.colour);
        System.out.println(car10.numberOfGear);
        System.out.println(car10.price);	
		
System.out.println("");
		
			car10.setBrand("Honda");
			car10.setName("Civic");
			car10.setColour("Grey");
			car10.setNumberOfGear(6);
			car10.setPrice(25000);
			
			System.out.println(car10.getBrand());
			System.out.println(car10.getName());
			System.out.println(car10.getColour());
			System.out.println(car10.getNumberOfGear());
			System.out.println(car10.getPrice());
		
		 			 
 	}

}