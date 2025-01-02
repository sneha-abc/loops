 
 class Loop1 {
    public static void main(String[] args) {
		 
        boolean exampassed=true;
        boolean haveseventyFivePersentAttendence = true;

        // Corrected comparison
        if (exampassed!=true  && haveseventyFivePersentAttendence!=false)
 			{
            System.out.println("passed the semester");
        }else{
		 System.out.println("failed the semester");
		}
		    }
}


10:25:25	insert into applicationinfo values ('AI02' , "facebook" , 15 , 4.2 , 'CI02'),
 ('AI03' , "twitter" , 40 , 4.2 , 'CI03'), ('AI04' , "spoyify" , 15, 4.3 , 'CI04'),
 ('AI05' , "Netflix" , 25 , 4.4 , 'CI05'), ('AI06' , "Gmail" , 29 , 4.5 , 'CI06'), 
 ('AI07' , "DigiLocker" , 75 , 4.7 , 'CI07'), ('AI08' , "Ola" , 35 , 4.9 , 'CI08'), 
 ('AI09' , "PUBG" , 51 , 4.7 , 'CI09'), ('AI10' , "Cnandy Crush" , 55 , 4.8 , 'CI10'), 
 ('AI11' , "Z E E" , 52 , 4.8 , 'CI11'), ('AI12' , "Zoom Meeting" , 18 , 4.8 , 'CI12'), 
 ('AI13' , "Google pay" , 48 , 4.5 , 'CI13'), ('AI14' , "Mutual Funds" , 13 , 4.3 , 'CI14'), 
 ('AI15' , "You Tube" , 35 , 4.2 , 'CI15'), ('AI16' , "Amazon" , 85 , 4.8 , 'CI16'),
 ('AI17' , "Zepto" , 56 , 4.1 , 'CI17'), ('AI18' , "Nykkaa" , 59 , 4.3 , 'CI18'), 
 ('AI19' , "FlipKart" , 75 , 4.1 , 'CI19'), ('AI20' , "My Metro" , 25 , 4.9 , 'CI20'), 
 ('AI21' , " Swiggy" , 65 , 4.2 , 'CI21'), ('AI22' , "Lenskart" , 9 , 4.3 , 'CI22'), 
 ('AI23' , "Adobe Scan" , 36 , 4.3 , 'CI23'), ('AI24' , "Jio cinima" , 45 , 4.1 , 'CI24'), 
 ('AI25' , "Remini" , 59 , 4.0 , 'CI25')	
 Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails 
 (`playstore`.`applicationinfo`, CONSTRAINT `applicationinfo_ibfk_1` FOREIGN KEY (`companyId`)
 REFERENCES `companyinfo` (`companyId`))	0.000 sec
