package Assignment1;
import java.util.Scanner;
public class AdvertisementAndMarketing {
	public static void main(String[] args) {
	
	}
	
	Scanner input = new Scanner(System.in);
	String method1, method2, method3, offlineAdvertisement, celebritySpokeman;
	int Options;
	
	public void AdvertisementOptions(){
		System.out.println("Option: ");
		Options = input.nextInt();
		switch(Options) {
			case 1:
				System.out.println("Method 1 :" );
				method1();
			break;
			
			case 2:
				System.out.println("Method 2 :" );
				System.out.println(method2("Billboard"));
			break;
			
			case 3:
				System.out.println("Method 3 :" );
				System.out.println(method3("Vin Diesel", 1));
			break;
				
		}
	}
	public String method1() {
		System.out.println("Online advertising: \n"+"Facebook \n"+ "Twitter \n"+"Youtube");
		return method1;
	}
	public String method2(String offlineAdvertisement) {
		return offlineAdvertisement;
	}
	public String method3(String celebritySpokeman, int Spokeman) {
		return Spokeman + ". " +celebritySpokeman;
	}
}

