 
 
 

class OrLogical1{
	public static void main(String[] args){
	boolean haspassword=false;
	boolean hasfingerprint=true;
	boolean canlogin=check(haspassword,hasfingerprint);
System.out.println(canlogin);		
		
	}
	public static boolean check(boolean haspassword, boolean hasfingureprint){
		System.out.println("canlogin");
	boolean result=haspassword||hasfingureprint;
		return result;
	}
	
	
}
