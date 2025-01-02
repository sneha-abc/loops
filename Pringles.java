class Pringles {
    String companyName;
    String flavor;
    int price;
     

	public void setCompanyName(String companyName) {
     this.companyName = companyName;
    }
	
	public void setFlavor(String flavor){
	 this.flavor = flavor;
	}
	
	public void setPrice(int price){
	 this.price = price;
	}
	
	
	 public String getCompanyName() {
        return companyName;
    }

	
	public String getflavor() {
        return flavor;
    }

	 public int getPrice() {
        return price;
    }
	
	 
	public static void main(String[] args){
	 
    
	Pringles pringles = new Pringles();
    
	pringles.setCompanyName("Pringle");
    pringles.setFlavor("masala");
    pringles.setPrice(20);
	 
	 
	System.out.println(pringles.getCompanyName());
    System.out.println(pringles.getflavor());
    System.out.println(pringles.getPrice());	
     }
}