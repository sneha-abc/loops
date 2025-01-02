class Watch{
	String brandName;
    String strapMaterial;
    int waterResistance;
    int displaySize;
	
	public Watch(String brandName){
		this.brandName=brandName;
	}
	
	public Watch(String brandName , String strapMaterial){
		this.brandName=brandName;
		this.strapMaterial=strapMaterial;
	}

	public Watch(String brandName , String strapMaterial , int waterResistance){
		this.brandName=brandName;
		this.strapMaterial=strapMaterial;
		this.waterResistance=waterResistance;
	}
	
	public Watch(String brandName , String strapMaterial , int waterResistance , int displaySize){
		this(brandName,strapMaterial,waterResistance);
		this.displaySize=displaySize;
	}
	
	public String getbrandName()
	{
		return brandName;
	}
	
	public String getstrapMaterial()
	{
		return strapMaterial;
	}
	
	public int getwaterResistance()
	{
		return waterResistance;
	}
	
	public int getdisplaySize()
	{
		return displaySize;
	}
	
public static void main(String[] args){
	
	System.out.println("1st watch");
	
	Watch watch1 = new Watch ("Rolex");
	System.out.println(watch1.getbrandName());
	
	Watch watch2 = new Watch ("Rolex","Leather");
	System.out.println(watch2.getbrandName());
	System.out.println(watch2.getstrapMaterial());
	
	Watch watch3 = new Watch ("Rolex","Leather",200,70);
	System.out.println(watch3.getbrandName());
	System.out.println(watch3.getstrapMaterial());
	System.out.println(watch3.getwaterResistance());
	System.out.println(watch3.getdisplaySize());
	System.out.println("");
	
	System.out.println("2nd watch");
	
	Watch watch4 = new Watch ("Casio");
	System.out.println(watch4.getbrandName());
	
	Watch watch5 = new Watch ("Casio","Leather");
	System.out.println(watch5.getbrandName());
	System.out.println(watch5.getstrapMaterial());
	
	Watch watch6 = new Watch ("Casio","Leather",150,80);
	System.out.println(watch6.getbrandName());
	System.out.println(watch6.getstrapMaterial());
	System.out.println(watch6.getwaterResistance());
	System.out.println(watch6.getdisplaySize());
	System.out.println("");
	
	System.out.println("3rd watch");
	
	Watch watch7 = new Watch ("Omega");
	System.out.println(watch7.getbrandName());
	
	Watch watch8 = new Watch ("Omega","Rubber");
	System.out.println(watch8.getbrandName());
	System.out.println(watch8.getstrapMaterial());
	
	Watch watch9 = new Watch ("Omega","Rubber",300,50);
	System.out.println(watch9.getbrandName());
	System.out.println(watch9.getstrapMaterial());
	System.out.println(watch9.getwaterResistance());
	System.out.println(watch9.getdisplaySize());
	System.out.println("");
	
	System.out.println("4th watch");
	
	Watch watch10 = new Watch ("Rolex");
	System.out.println(watch10.getbrandName());
	
	Watch watch11 = new Watch ("Rolex","Leather");
	System.out.println(watch11.getbrandName());
	System.out.println(watch11.getstrapMaterial());
	
	Watch watch12 = new Watch ("Rolex","Leather",200,70);
	System.out.println(watch12.getbrandName());
	System.out.println(watch12.getstrapMaterial());
	System.out.println(watch12.getwaterResistance());
	System.out.println(watch12.getdisplaySize());
	System.out.println("");
	
	System.out.println("5th watch");
	
	Watch watch13 = new Watch ("Apple");
	System.out.println(watch13.getbrandName());
	
	Watch watch14 = new Watch ("Apple","Silicone");
	System.out.println(watch14.getbrandName());
	System.out.println(watch14.getstrapMaterial());
	
	Watch watch15 = new Watch ("Apple","Silicone",250,85);
	System.out.println(watch15.getbrandName());
	System.out.println(watch15.getstrapMaterial());
	System.out.println(watch15.getwaterResistance());
	System.out.println(watch15.getdisplaySize());
	System.out.println("");
	
	System.out.println("6th watch");
	
	Watch watch16 = new Watch ("Tissot");
	System.out.println(watch16.getbrandName());
	
	Watch watch17 = new Watch ("Tissot","Stainless");
	System.out.println(watch17.getbrandName());
	System.out.println(watch17.getstrapMaterial());
	
	Watch watch18 = new Watch ("Tissot","Stainless",150,60);
	System.out.println(watch18.getbrandName());
	System.out.println(watch18.getstrapMaterial());
	System.out.println(watch18.getwaterResistance());
	System.out.println(watch18.getdisplaySize());
	System.out.println("");
	
	System.out.println("7th watch");
	
	Watch watch19 = new Watch ("Hublot");
	System.out.println(watch19.getbrandName());
	
	Watch watch20 = new Watch ("Hublot","Rubber");
	System.out.println(watch20.getbrandName());
	System.out.println(watch20.getstrapMaterial());
	
	Watch watch21 = new Watch ("Hublot","Rubber",280,75);
	System.out.println(watch21.getbrandName());
	System.out.println(watch21.getstrapMaterial());
	System.out.println(watch21.getwaterResistance());
	System.out.println(watch21.getdisplaySize());
	System.out.println("");
	
	System.out.println("8th watch");
	
	Watch watch22 = new Watch ("Citizen");
	System.out.println(watch22.getbrandName());
	
	Watch watch23 = new Watch ("Citizen","Titanium");
	System.out.println(watch23.getbrandName());
	System.out.println(watch23.getstrapMaterial());
	
	Watch watch24 = new Watch ("Citizen","Titanium",290,90);
	System.out.println(watch24.getbrandName());
	System.out.println(watch24.getstrapMaterial());
	System.out.println(watch24.getwaterResistance());
	System.out.println(watch24.getdisplaySize());
	System.out.println("");
	
	System.out.println("9th watch");
	
	Watch watch25 = new Watch ("Rolex");
	System.out.println(watch25.getbrandName());
	
	Watch watch26 = new Watch ("Rolex","Leather");
	System.out.println(watch26.getbrandName());
	System.out.println(watch26.getstrapMaterial());
	
	Watch watch27 = new Watch ("Rolex","Leather",200,70);
	System.out.println(watch27.getbrandName());
	System.out.println(watch27.getstrapMaterial());
	System.out.println(watch27.getwaterResistance());
	System.out.println(watch27.getdisplaySize());
	System.out.println("");
	
	System.out.println("10th watch");
	
	Watch watch28 = new Watch ("Seiko");
	System.out.println(watch28.getbrandName());
	
	Watch watch29 = new Watch ("Seiko","Titanium");
	System.out.println(watch29.getbrandName());
	System.out.println(watch29.getstrapMaterial());
	
	Watch watch30 = new Watch ("Seiko","Titanium",295,20);
	System.out.println(watch30.getbrandName());
	System.out.println(watch30.getstrapMaterial());
	System.out.println(watch30.getwaterResistance());
	System.out.println(watch30.getdisplaySize());

}
 }	

  
 