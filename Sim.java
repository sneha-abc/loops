class Sim{
	String simName;
	String simHolderName;
	long simNumber;
	boolean simCardAvailable;
	
	public void setsimName(String name) {
     simName = name;
    }
	
	public void setsimHolderName(String name){
	 simHolderName = name;
	}
	
	public void setsimNumber(long number){
	  simNumber= number;
	}
	
	 public void cardIsAvailable(boolean card)
	{
		simCardAvailable = card;
	}
	
	public String getName()
	{
		return simName;
	}
	
	public String getsimHolderName()
	{
		return simHolderName;
	}
	
	public long getNumber()
	{
		return simNumber;
	}
	
	 public boolean isAvailable()
	{
		return simCardAvailable;
	}
		

public static void main(String[] args)
{
	System.out.println("sim1 details");
	
	Sim sim1 = new Sim();
	 
	 sim1.setsimName("jio");
	 sim1.setsimHolderName("sneha");
	 sim1.setsimNumber(9380483442l);
	 sim1.cardIsAvailable(true);
	 
	 System.out.println(sim1.getName());
	 System.out.println(sim1.getsimHolderName());
	 System.out.println(sim1.getNumber());
	 System.out.println(sim1.isAvailable());
	 
	 System.out.println("sim2 details");
	
	Sim sim2 = new Sim();
	 
	 sim2.setsimName("airtel");
	 sim2.setsimHolderName("sagar");
	 sim2.setsimNumber(9380103110l);
	 sim2.cardIsAvailable(true);
	 
	 System.out.println(sim2.getName());
	 System.out.println(sim2.getsimHolderName());
	 System.out.println(sim2.getNumber());
	 System.out.println(sim2.isAvailable());
	  
	  
}	
	
	}