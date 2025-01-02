class OrLogical2{
	
	public static void main(String[] args){
		
		boolean haveskills=true;
		boolean havingdegree=false;
		boolean person=gettingInIT(haveskills,havingdegree);
		System.out.println(person);
		
		
		
	}
	public static boolean gettingInIT(boolean haveskills , boolean havingdegree){
		
		System.out.println("person");
		boolean result =haveskills || havingdegree;
		return result;
		
	}
	
	
	
	
}