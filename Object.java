class Object
 {
 
	String bottleColor;
	String bottleName;
	int bottlePrice;
	boolean waterAvailable;
	int waterAmount=10;
	boolean availableDrinkWater;
	
	public void setName(String name)
	{
		bottleName = name;
	}
	
	public String getName()
	{
		return bottleName;
	}
	
	
	public void setColor(String color)
	{
		bottleColor = color;
	}
	
	
	public String getColor()
	{
		return bottleColor;
	}
	
	public void setPrice(int price)
	{
		bottlePrice = price;
	}
	
	
	public int getPrice()
	{
		return bottlePrice;
	}
	
	public void isWaterAvailable(boolean avail)
	{
		waterAvailable = avail;
	}
	
	
	public boolean isWaterAvailableInBottle()
	{
		return waterAvailable;
	}
	
	
	public void amountofWater(int water)
	{
		if ((waterAmount-water)>0)
		{
		availableDrinkWater=true;
		}
	}
	
	
	public boolean waterAmount()
	{
		return availableDrinkWater;
	}
	
	
	public static void main(String[] args)
	{
		Object bottle = new Object();
		
		bottle.setName("Aqua");
		System.out.println(bottle.getName());
		
		bottle.setColor("white");
		System.out.println(bottle.getColor());
		
		bottle.setPrice(20);
		System.out.println(bottle.getPrice());
		
		bottle.isWaterAvailable(true);
		System.out.println(bottle.isWaterAvailableInBottle());
		
		bottle.amountofWater(10);
		System.out.println(bottle.waterAmount());
		
		
	}
	
 }
 
 
 
 
 
 class Object
 {
 
	String bottleColor;
	String bottleName;
	int bottlePrice;
	boolean waterAvailable;
	int waterAmount=10;
	boolean availableDrinkWater;
	public void setName(String name)
	{
		bottleName = name;
	}
	public String getName()
	{
		return bottleName;
	}
	public void setColor(String color)
	{
		bottleColor = color;
	}
	public String getColor()
	{
		return bottleColor;
	}
	public void setPrice(int price)
	{
		bottlePrice = price;
	}
	public int getPrice()
	{
		return bottlePrice;
	}
	public void isWaterAvailable(boolean avail)
	{
		waterAvailable = avail;
	}
	public boolean isWaterAvailableInBottle()
	{
		return waterAvailable;
	}
	public void amountofWater(int water)
	{
		if ((waterAmount-water)>0)
		{
		availableDrinkWater=true;
		}
	}
	public boolean waterAmount()
	{
		return availableDrinkWater;
	}
	public static void main(String[] args)
	{
		System.out.println("object creation for bottle 1");
		Object bottle = new Object();
		bottle.setName("Aqua");
		System.out.println(bottle.getName());
		bottle.setColor("white");
		System.out.println(bottle.getColor());
		bottle.setPrice(20);
		System.out.println(bottle.getPrice());
		bottle.isWaterAvailable(true);
		System.out.println(bottle.isWaterAvailableInBottle());
		bottle.amountofWater(10);
		System.out.println(bottle.waterAmount());
		System.out.println("object creation for bottle 2");
		
		Object bottle1 = new Object();
		bottle1.setName("bisleri");
		System.out.println(bottle1.getName());
		bottle1.setColor("blue");
		System.out.println(bottle1.getColor());
		bottle1.setPrice(30);
		System.out.println(bottle1.getPrice());
		bottle1.isWaterAvailable(true);
		System.out.println(bottle1.isWaterAvailableInBottle());
		bottle1.amountofWater(9);
		System.out.pri ntln(bottle1.waterAmount());
		System.out.println("object creation for bottle 3");
		
		Object bottle2 = new Object();
		bottle2.setName("signature");
		System.out.println(bottle2.getName());
		bottle2.setColor("black");
		System.out.println(bottle2.getColor());
		bottle2.setPrice(40);
		System.out.println(bottle2.getPrice());
		bottle2.isWaterAvailable(true);
		System.out.println(bottle2.isWaterAvailableInBottle());
		bottle2.amountofWater(8);
		System.out.println(bottle2.waterAmount());
		System.out.println("object creation for bottle 4");
		
		Object bottle3 = new Object();
		bottle3.setName("railwater");
		System.out.println(bottle3.getName());
		bottle3.setColor("white");
		System.out.println(bottle3.getColor());
		bottle3.setPrice(10);
		System.out.println(bottle3.getPrice());
		bottle3.isWaterAvailable(false);
		System.out.println(bottle3.isWaterAvailableInBottle());
		bottle3.amountofWater(11);
		System.out.println(bottle3.waterAmount());
		System.out.println("object creation for bottle 5");
		
		Object bottle4 = new Object();
		bottle4.setName("aquafina");
		System.out.println(bottle4.getName());
		bottle4.setColor("white");
		System.out.println(bottle4.getColor());
		bottle4.setPrice(40);
		System.out.println(bottle4.getPrice());
		bottle4.isWaterAvailable(true);
		System.out.println(bottle4.isWaterAvailableInBottle());
		bottle4.amountofWater(6);
		System.out.println(bottle4.waterAmount());
		System.out.println("object creation for bottle 6");
		
		Object bottle5 = new Object();
		bottle5.setName("himalaya");
		System.out.println(bottle5.getName());
		bottle5.setColor("blue");
		System.out.println(bottle5.getColor());
		bottle5.setPrice(100);
		System.out.println(bottle5.getPrice());
		bottle5.isWaterAvailable(true);
		System.out.println(bottle5.isWaterAvailableInBottle());
		bottle5.amountofWater(8);
		System.out.println(bottle5.waterAmount());
		System.out.println("object creation for bottle 7");
		
		Object bottle6 = new Object();
		bottle6.setName("Aquine");
		System.out.println(bottle6.getName());
		bottle6.setColor("black");
		System.out.println(bottle6.getColor());
		bottle6.setPrice(50);
		System.out.println(bottle6.getPrice());
		bottle6.isWaterAvailable(true);
		System.out.println(bottle6.isWaterAvailableInBottle());
		bottle6.amountofWater(1);
		System.out.println(bottle6.waterAmount());
		System.out.println("object creation for bottle 8");
		
		Object bottle7 = new Object();
		bottle7.setName("bootle8");
		System.out.println(bottle7.getName());
		bottle7.setColor("white");
		System.out.println(bottle7.getColor());
		bottle7.setPrice(40);
		System.out.println(bottle7.getPrice());
		bottle7.isWaterAvailable(true);
		System.out.println(bottle7.isWaterAvailableInBottle());
		bottle7.amountofWater(0);
		System.out.println(bottle7.waterAmount());
		System.out.println("object creation for bottle 9");
		
		Object bottle8 = new Object();
		bottle8.setName("bootle9");
		System.out.println(bottle8.getName());
		bottle8.setColor("blue");
		System.out.println(bottle8.getColor());
		bottle8.setPrice(40);
		System.out.println(bottle8.getPrice());
		bottle8.isWaterAvailable(false);
		System.out.println(bottle8.isWaterAvailableInBottle());
		bottle8.amountofWater(-1);
		System.out.println(bottle8.waterAmount());
		System.out.println("object creation for bottle 10");
		
		Object bottle9 = new Object();
		bottle9.setName("bootle10");
		System.out.println(bottle9.getName());
		bottle9.setColor("blue");
		System.out.println(bottle9.getColor());
		bottle9.setPrice(100);
		System.out.println(bottle9.getPrice());
		bottle9.isWaterAvailable(true);
		System.out.println(bottle9.isWaterAvailableInBottle());
		bottle9.amountofWater(8);
		System.out.println(bottle9.waterAmount());
			
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 