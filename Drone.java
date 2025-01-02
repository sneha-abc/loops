class Drone{
	String model;
    int batteryLevel;
    double weight;
    String cameraResolution;
	
	public Drone(String model){
		this.model=model;
	}
	
	public Drone(String model , int batteryLevel){
		this.model=model;
		this.batteryLevel=batteryLevel;
	}

	public Drone(String model , int batteryLevel , double weight){
		this.model=model;
		this.batteryLevel=batteryLevel;
		this.weight=weight;
	}
	
	public Drone(String model , int batteryLevel , double weight , String cameraResolution){
		this(model,batteryLevel,weight);
		this.cameraResolution=cameraResolution;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getBatteryLevel()
	{
		return batteryLevel;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String getCameraResolution()
	{
		return cameraResolution;
	}
	
public static void main(String[] args){
	
	 
	
	Drone drone1 = new Drone ("Phantom");
	System.out.println(drone1.getModel());
	
	System.out.println("");
	
	Drone drone2 = new Drone ("Phantom",75);
	System.out.println(drone2.getModel());
	System.out.println(drone2.getBatteryLevel());
	
	System.out.println("");
	
	Drone drone3 = new Drone ("Phantom",75,1.38,"4K");
	System.out.println(drone3.getModel());
	System.out.println(drone3.getBatteryLevel());
	System.out.println(drone3.getWeight());
	System.out.println(drone3.getCameraResolution());
	
	
}
}