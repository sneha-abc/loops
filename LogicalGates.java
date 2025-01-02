class LogicalGates{
	public static void main(String[] args){
	boolean indiaIsInAsia=true;
	boolean karnatakaIsInIndia=false;
	boolean check = checking(indiaIsInAsia, karnatakaIsInIndia); 
    System.out.println(check);
	
	
	boolean isWeekend =true;
		boolean isHoliday=false;
		boolean get=getchecked(isWeekend,isHoliday);
		System.out.println(get);
		
		
		boolean personIsAvake=true;
	boolean check1=checking1(personIsAvake);
	System.out.println(check1);
	
	
	

	}
public static boolean checking(boolean indiaIsInAsia,boolean  karnatakaIsInIndia){
System.out.println("check");
boolean result=indiaIsInAsia && karnatakaIsInIndia;
return result;

}
 public static boolean getchecked(boolean isWeekend , boolean isHoliday){
		
		System.out.println("get");
		boolean result =isWeekend || isHoliday;
		return result;
 }
		
		public static boolean checking1(boolean personIsAvake){
		System.out.println("check1");
		boolean result=! personIsAvake;
		return result;
		
		
	}
}