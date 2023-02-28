import java.util.Scanner;
class PerfectCoupleException extends Exception{
	public PerfectCoupleException(String msg) {
		super(msg);
	} 
}

class GoodCoupleException extends Exception{
	public GoodCoupleException(String msg) {
		super(msg);
	} 
}
class 	UptoYouException extends Exception{
	public 	UptoYouException(String msg){
		super(msg);
	}
	
}
class NotPerfectCoupleException extends Exception{
	public 	NotPerfectCoupleException(String msg){
		super(msg);
	}
	
}


class CoupleMatch{
     String boyName, bFavColor, bCity , bWeather;
      int boyAge, bFavNumber; 
      
      String girlName, gFavColor, gCity, gWeather;
      int girlAge, gFavNumber; 
   
     
      
      

public void input() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ladies First");
	
	System.out.println("Hey girl enter your name"); 
	girlName = scan.nextLine();
	System.out.println("What is your favorite color"); 
	gFavColor = scan.nextLine();
	System.out.println("enter your city");
	gCity = scan.nextLine();
	System.out.println("What is your favorite weather");
	gWeather = scan.nextLine();
	System.out.println("What is your age");
	girlAge = scan.nextInt();
	System.out.println("What is your favorite number");
    gFavNumber = scan.nextInt();
}
public void input2() {
	Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println("Boy, it's your turn");
    
	System.out.println("Hey dude enter your name"); 
	boyName = scan.nextLine();
	
	System.out.println("What is your favorite color"); 
	bFavColor = scan.nextLine();
	System.out.println("enter your city");
	bCity = scan.nextLine();
	System.out.println("What is your favorite weather");
	bWeather = scan.nextLine();
	System.out.println("What is your age");
	boyAge = scan.nextInt();
	System.out.println("What is your favorite number");
    bFavNumber = scan.nextInt();
     
   
	
	

}
public void verify() throws PerfectCoupleException, GoodCoupleException, UptoYouException, NotPerfectCoupleException{
	if((gFavColor.equals(bFavColor)) && (gWeather.equals(bWeather))&& (boyAge==girlAge)&&(gFavNumber==bFavNumber)) {
		PerfectCoupleException pc = new PerfectCoupleException("You are a perfect couple:- 100% match ");
		System.out.println(pc.getMessage());
		throw pc;
		
	}
	
	if ((gFavColor.equals(bFavColor)) &&  (gWeather.equals(bWeather)) &&(gFavNumber==bFavNumber)) {
		GoodCoupleException gc = new GoodCoupleException("Good to go:- 70% match");
		System.out.println(gc.getMessage());
		throw gc;
	}
	
	if((gFavColor.equals(bFavColor))&&(gFavNumber==bFavNumber)) {
		UptoYouException w = new UptoYouException("It's upto you 50% match");
		System.out.println(w.getMessage());
		throw w;
	}
	else {
		NotPerfectCoupleException w = new NotPerfectCoupleException("Better luck next time");
		System.out.println(w.getMessage());
		throw w;
	}
}

}

class MatchChecking{
	public void matchChecking() {
		CoupleMatch cm = new CoupleMatch();
		try {
		cm.input();
		cm.input2();
	    cm.verify();
	    }
		catch(PerfectCoupleException | GoodCoupleException | UptoYouException | NotPerfectCoupleException e1){
			System.out.println("Thanks for using our application");
		}
	}
}

public class ValentineGame {

	public static void main(String[] args) {
		MatchChecking aa = new MatchChecking();
		aa.matchChecking();

	}

}
