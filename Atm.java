class Atm
{
int atmNumber;
boolean cardAvailable;
int atmPin;
boolean cashAvailable;
    public void setNumber(int number)
	{
		atmNumber = number;
	}
	public int getNumber()
	{
		return atmNumber;
	}
	public void cardIsAvailable(boolean card)
	{
		cardAvailable = card;
	}
	public boolean isAvailable()
	{
		return cardAvailable;
	}
	 public void setPin(int pin)
	{
		atmPin = pin;
	}
	public int getPin()
	{
		return atmPin;
	}
	public void cashIsAvailable(boolean cash)
	{
		cashAvailable = cash;
	}
	public boolean cashIsAvailableinAtm()
	{
		return cashAvailable;
	}

public static void main(String[] args)
{
	System.out.println("atm details");
	Atm atm = new Atm();
	atm.setNumber(654215982);
	System.out.println("atm number is " + atm.getNumber());
	atm.cardIsAvailable(true);
	System.out.println(atm.isAvailable());
	atm.setPin(1997);
	System.out.println("atm pin is " + atm.getPin());
	atm.cashIsAvailable(true);
	System.out.println(atm.cashIsAvailableinAtm());
}

}