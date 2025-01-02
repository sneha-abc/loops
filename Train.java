 class Train
{
static String trainName;
static int trainFare;
String trainType;
String destiLocation;
static{
	System.out.println("i am static block");
	trainName="rajdhani";
	trainFare=2500;
	//destiLocation="delhi";
}
{
	System.out.println("i an non static block");
	trainName="intercity";
	trainType="AC";
	destiLocation="delhi";
}
public static void main(String[] args)
{
	System.out.println(trainName);
	System.out.println(trainFare);
	Train train = new Train();
	System.out.println(train.trainName);
	System.out.println(train.destiLocation);
	
	Train train1 = new Train();
	System.out.println(train1.trainName);
	System.out.println(train1.trainType);
	
	Train train2 = new Train();
	System.out.println(train2.trainName);
	System.out.println(train2.trainFare);
	
	Train train3 = new Train();
	System.out.println(train3.trainName);
	System.out.println(train3.trainFare);
	
	Train train4 = new Train();
	System.out.println(train4.trainName);
	System.out.println(train4.trainFare);
	
	Train train5 = new Train();
	System.out.println(train5.trainName);
	System.out.println(train5.trainFare);
	
	Train train6 = new Train();
	System.out.println(train6.trainName);
	System.out.println(train6.trainFare);
	
	Train train7 = new Train();
	System.out.println(train7.trainName);
	System.out.println(train7.trainFare);
	
	Train train8 = new Train();
	System.out.println(train8.trainName);
	System.out.println(train8.trainFare);
	
	Train train9 = new Train();
	System.out.println(train9.trainName);
	System.out.println(train9.trainFare);
	
	
}
}