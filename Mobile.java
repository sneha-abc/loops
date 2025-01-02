class Mobile{
	String brand;
	String network;
	String operatingSystem;
	String batteryCapacity; 
	
	public Mobile(String brand){
		this.brand=brand;
	}
	
	public Mobile(String brand , String network){
		this.brand=brand;
		this.network=network;
	}
	
	public Mobile(String brand , String network , String operatingSystem){
		this.brand=brand;
		this.network=network;
		this.operatingSystem=operatingSystem;
	}
	
	public Mobile(String brand , String network , String operatingSystem , String batteryCapacity){
		this(brand,network,operatingSystem);
		this.batteryCapacity=batteryCapacity;
	}
	
	public String getbrand()
	{
		return brand;
	}
	
	
	public String getnetwork()
	{
		return network;
	}
	
	public String getoperatingSystem()
	{
		return operatingSystem;
	}
	
	public String getbatteryCapacity ()
	{
		return batteryCapacity;
	}
	
	public static void main(String[] args){
	
	System.out.println("1st Mobile");
	
	Mobile mobile1 = new Mobile ("apple");
	System.out.println(mobile1.getbrand());
	
	Mobile mobile2 = new Mobile ("apple","5G");
	System.out.println(mobile2.getbrand());
	System.out.println(mobile2.getnetwork());
	
	Mobile mobile3= new Mobile ("apple","5G","OS","189mAh");
	System.out.println(mobile3.getbrand());
	System.out.println(mobile3.getnetwork());
	System.out.println(mobile3.getoperatingSystem());
	System.out.println(mobile3.getbatteryCapacity());
	System.out.println("");
	
	
	System.out.println("2nd Mobile");
	
	Mobile mobile4 = new Mobile ("vivo");
	System.out.println(mobile4.getbrand());
	
	Mobile mobile5 = new Mobile ("viv","5G");
	System.out.println(mobile5.getbrand());
	System.out.println(mobile5.getnetwork());
	
	Mobile mobile6= new Mobile ("vivo","5G","android","156mAh");
	System.out.println(mobile6.getbrand());
	System.out.println(mobile6.getnetwork());
	System.out.println(mobile6.getoperatingSystem());
	System.out.println(mobile6.getbatteryCapacity());
	System.out.println("");
	
	
	System.out.println("3rd Mobile");
	
	Mobile mobile7 = new Mobile ("redmi");
	System.out.println(mobile7.getbrand());
	
	Mobile mobile8 = new Mobile ("redmi","5G");
	System.out.println(mobile8.getbrand());
	System.out.println(mobile8.getnetwork());
	
	Mobile mobile9= new Mobile ("redmi","5G","android","146mAh");
	System.out.println(mobile9.getbrand());
	System.out.println(mobile9.getnetwork());
	System.out.println(mobile9.getoperatingSystem());
	System.out.println(mobile9.getbatteryCapacity());
	System.out.println("");
	
	
	System.out.println("4th Mobile");
	
	Mobile mobile10 = new Mobile ("samsung");
	System.out.println(mobile10.getbrand());
	
	Mobile mobile11 = new Mobile ("samsung","5G");
	System.out.println(mobile11.getbrand());
	System.out.println(mobile11.getnetwork());
	
	Mobile mobile12= new Mobile ("samsung","5G","android","176mAh");
	System.out.println(mobile12.getbrand());
	System.out.println(mobile12.getnetwork());
	System.out.println(mobile12.getoperatingSystem());
	System.out.println(mobile12.getbatteryCapacity());
	System.out.println("");
	
	
	System.out.println("5th Mobile");
	
	Mobile mobile13 = new Mobile ("oneplus");
	System.out.println(mobile13.getbrand());
	
	Mobile mobile14 = new Mobile ("oneplus","5G");
	System.out.println(mobile14.getbrand());
	System.out.println(mobile14.getnetwork());
	
	Mobile mobile15= new Mobile ("oneplus","5G","android","175mAh");
	System.out.println(mobile15.getbrand());
	System.out.println(mobile15.getnetwork());
	System.out.println(mobile15.getoperatingSystem());
	System.out.println(mobile15.getbatteryCapacity());
	System.out.println("");
	
	
	
	System.out.println("6th Mobile");
	
	Mobile mobile16 = new Mobile ("oppo");
	System.out.println(mobile16.getbrand());
	
	Mobile mobile17 = new Mobile ("oppo","4G");
	System.out.println(mobile17.getbrand());
	System.out.println(mobile17.getnetwork());
	
	Mobile mobile18= new Mobile ("oppo","4G","android","182mAh");
	System.out.println(mobile18.getbrand());
	System.out.println(mobile18.getnetwork());
	System.out.println(mobile18.getoperatingSystem());
	System.out.println(mobile18.getbatteryCapacity());
	System.out.println("");
	
	
	System.out.println("7th Mobile");
	
	Mobile mobile19 = new Mobile ("nothing");
	System.out.println(mobile19.getbrand());
	
	Mobile mobile20 = new Mobile ("nothing","5G");
	System.out.println(mobile20.getbrand());
	System.out.println(mobile20.getnetwork());
	
	Mobile mobile21= new Mobile ("nothing","5G","android","192mAh");
	System.out.println(mobile21.getbrand());
	System.out.println(mobile21.getnetwork());
	System.out.println(mobile21.getoperatingSystem());
	System.out.println(mobile21.getbatteryCapacity());
	System.out.println("");
	
	
	System.out.println("8th Mobile");
	
	Mobile mobile22 = new Mobile ("realme");
	System.out.println(mobile22.getbrand());
	
	Mobile mobile23 = new Mobile ("realme","4G");
	System.out.println(mobile23.getbrand());
	System.out.println(mobile23.getnetwork());
	
	Mobile mobile24= new Mobile ("realme","4G","android","190mAh");
	System.out.println(mobile24.getbrand());
	System.out.println(mobile24.getnetwork());
	System.out.println(mobile24.getoperatingSystem());
	System.out.println(mobile24.getbatteryCapacity());
	System.out.println("");
	
	System.out.println("9th Mobile");
	
	Mobile mobile25 = new Mobile ("lenovo");
	System.out.println(mobile25.getbrand());
	
	Mobile mobile26 = new Mobile ("lenovo","5G");
	System.out.println(mobile26.getbrand());
	System.out.println(mobile26.getnetwork());
	
	Mobile mobile27= new Mobile ("lenovo","5G","android","199mAh");
	System.out.println(mobile27.getbrand());
	System.out.println(mobile27.getnetwork());
	System.out.println(mobile27.getoperatingSystem());
	System.out.println(mobile27.getbatteryCapacity());
	System.out.println("");
	
	System.out.println("10th Mobile");
	
	Mobile mobile28 = new Mobile ("sony");
	System.out.println(mobile28.getbrand());
	
	Mobile mobile29 = new Mobile ("sony","5G");
	System.out.println(mobile29.getbrand());
	System.out.println(mobile29.getnetwork());
	
	Mobile mobile30= new Mobile ("sony","5G","android","179mAh");
	System.out.println(mobile30.getbrand());
	System.out.println(mobile30.getnetwork());
	System.out.println(mobile30.getoperatingSystem());
	System.out.println(mobile30.getbatteryCapacity());
	 
	
	 
	}	
}