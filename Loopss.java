class Loopss{
	public static void main(String[] args){
System.out.println("decrement");

int j=1;

boolean seatInBusAvailable =true;

int day = 3;

 for(int i=10;i>=0;i--){

 System.out.println(i);}
 
 System.out.println("while loop");
 while (j<10){
			System.out.println(j);
			j++;
		}
		
 System.out.println("do while loop");
 
 do{
	 System.out.println("can be seated");
 }while( seatInBusAvailable == false);
 
 switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
	
 
 }
 
 }