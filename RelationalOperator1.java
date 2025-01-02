class RelationalOperator1{

	public static void main(String[] argss){
		
		int marks = 62;
		
		String grade = "F";
		
	if(marks >95)
		{grade = "A1";}
	
	if(marks >=91 && marks<=95)
	     {grade = "A2";}
	 
	if(marks >=81 && marks<=90)
	     {grade = "B1";}
	 
	if(marks >=71 && marks<=80)
	     {grade = "B2";}
	 
	if(marks >=61 && marks<=70)
	     {grade = "C1";}
	 
	if(marks >=51 && marks<=60)
	     {grade = "D1";}
	 
	if(marks >=41 && marks<=50)
	     {grade = "D2";}
	 
	if(marks >=35 && marks<=40)
	     {grade = "E";}
	
	 
	 System.out.println(grade);
		}
}