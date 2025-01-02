class RelationalOperator{

	public static void main(String[] argss){
		
		
		int marks=10;
		
		char grade = 'F';
		
		if(marks > 90)
		           {grade ='A';}
		 
		if(marks > 80 && marks <= 90)
		           {grade ='B';}	
		
		if(marks > 70 && marks <= 80)
					{grade = 'C';}
				
		if(marks > 60 && marks <= 70)
					{grade = 'D';}
				
		if(marks > 35 && marks <= 60)
					{grade = 'E';}
			    
			   
		System.out.println(grade);
	}




}