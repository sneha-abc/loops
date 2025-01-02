class Laptop
{
String lapName;
int lapRam;
String battery;
int display;
public Laptop(String lapName)
{
	this.lapName=lapName;
}
public Laptop(String lapName,int lapRam)
{
	this.lapName=lapName;
	this.lapRam=lapRam;
}
public Laptop(String lapName,int lapRam,String battery)
{
	this.lapName=lapName;
	this.lapRam=lapRam;
	this.battery=battery;
}
public Laptop(String lapName,int lapRam,String battery,int display)
{
	this (lapName,lapRam,battery);
	this.display=display;
}
public String getlapName()
	{
		return lapName;
	}
	public int getlapRam()
	{
		return lapRam;
	}
	public String getBattery()
	{
		return battery;
	}
	public int getDisplay()
	{
		return display;
	}
public static void main(String[] args)
	{
		System.out.println("one laptop");
		
		Laptop laptop=new Laptop("dell");
		System.out.println(laptop.getlapName());
		Laptop lap=new Laptop("dell",8);
		System.out.println(lap.getlapName());
		System.out.println(lap.getlapRam());
		Laptop lap1= new Laptop("hp",16,"10000mah",20);
		System.out.println(lap1.getlapName());
		System.out.println(lap1.getlapRam());
		System.out.println(lap1.getBattery());
		System.out.println(lap1.getDisplay());
		
		System.out.println("second laptop");
		Laptop laptop1=new Laptop("hp");
		System.out.println(laptop1.getlapName());
		Laptop lap3=new Laptop("dell",8);
		System.out.println(lap3.getlapName());
		System.out.println(lap3.getlapRam());
		Laptop lap4= new Laptop("hp",28,"15000mah",30);
		System.out.println(lap4.getlapName());
		System.out.println(lap4.getlapRam());
		System.out.println(lap4.getBattery());
		System.out.println(lap4.getDisplay());
		
		System.out.println("third laptop");
		Laptop laptop3=new Laptop("lenovo");
		System.out.println(laptop.getlapName());
		Laptop lap5=new Laptop("lenovo",18);
		System.out.println(lap5.getlapName());
		System.out.println(lap5.getlapRam());
		Laptop lap6= new Laptop("lenovo",18,"10500mah",20);
		System.out.println(lap6.getlapName());
		System.out.println(lap6.getlapRam());
		System.out.println(lap6.getBattery());
		System.out.println(lap6.getDisplay());
		
		System.out.println("forth laptop");
		Laptop laptop4=new Laptop("intel");
		System.out.println(laptop4.getlapName());
		Laptop lap7=new Laptop("dell",8);
		System.out.println(lap7.getlapName());
		System.out.println(lap7.getlapRam());
		Laptop lap8= new Laptop("intel",38,"15000mah",30);
		System.out.println(lap8.getlapName());
		System.out.println(lap8.getlapRam());
		System.out.println(lap8.getBattery());
		System.out.println(lap8.getDisplay());
		
		System.out.println("fifth laptop");
		Laptop laptop5=new Laptop("dell");
		System.out.println(laptop.getlapName());
		Laptop lap9=new Laptop("dell",28);
		System.out.println(lap9.getlapName());
		System.out.println(lap9.getlapRam());
		Laptop lap10= new Laptop("dell",28,"15000mah",30);
		System.out.println(lap10.getlapName());
		System.out.println(lap10.getlapRam());
		System.out.println(lap10.getBattery());
		System.out.println(lap10.getDisplay());
		
		System.out.println("sixth laptop");
		Laptop laptop6=new Laptop("intel");
		System.out.println(laptop.getlapName());
		Laptop lap11=new Laptop("intel",28);
		System.out.println(lap11.getlapName());
		System.out.println(lap11.getlapRam());
		Laptop lap12= new Laptop("intel",23,"15000mah",20);
		System.out.println(lap12.getlapName());
		System.out.println(lap12.getlapRam());
		System.out.println(lap12.getBattery());
		System.out.println(lap12.getDisplay());
		
        System.out.println("seventh laptop");
		Laptop laptop7=new Laptop("lenova");
		System.out.println(laptop7.getlapName());
		Laptop lap13=new Laptop("lenova",8);
		System.out.println(lap13.getlapName());
		System.out.println(lap13.getlapRam());
		Laptop lap14= new Laptop("lenova",15,"16000mah",30);
		System.out.println(lap14.getlapName());
		System.out.println(lap14.getlapRam());
		System.out.println(lap14.getBattery());
		System.out.println(lap14.getDisplay());
		
        System.out.println("eighth laptop");
		Laptop laptop8=new Laptop("hp");
		System.out.println(laptop8.getlapName());
		Laptop lap15=new Laptop("hp",32);
		System.out.println(lap15.getlapName());
		System.out.println(lap15.getlapRam());
		Laptop lap16= new Laptop("hp",32,"10000mah",20);
		System.out.println(lap16.getlapName());
		System.out.println(lap16.getlapRam());
		System.out.println(lap16.getBattery());
		System.out.println(lap16.getDisplay());	

        System.out.println("ninth laptop");
		Laptop laptop9=new Laptop("dell");
		System.out.println(laptop9.getlapName());
		Laptop lap17=new Laptop("dell",16);
		System.out.println(lap17.getlapName());
		System.out.println(lap17.getlapRam());
		Laptop lap18= new Laptop("dell",16,"15000mah",32);
		System.out.println(lap18.getlapName());
		System.out.println(lap18.getlapRam());
		System.out.println(lap18.getBattery());
		System.out.println(lap18.getDisplay());
		
		System.out.println("tenth laptop");
		Laptop laptop10=new Laptop("intel");
		System.out.println(laptop10.getlapName());
		Laptop lap19=new Laptop("intel",32);
		System.out.println(lap19.getlapName());
		System.out.println(lap19.getlapRam());
		Laptop lap20= new Laptop("intel",32,"15000mah",32);
		System.out.println(lap20.getlapName());
		System.out.println(lap20.getlapRam());
		System.out.println(lap20.getBattery());
		System.out.println(lap20.getDisplay());
	}	
}