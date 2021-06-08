package Assignment1;

import java.util.Scanner;
import java.io.IOException;

public class CarRacingMain {
	
	public static void main(String[] args) {
		Login();
	
	}
	
	public static void Login(){
		String login;
		int adminOptions;
		Scanner input = new Scanner(System.in);	
		
		CarRacing RacingCarCompany = new CarRacing();
		RacingCarCompany.detailOfCompany("Pro MotorSport Enterprise", "Alor Setar, Kedah", "1.\tPossess a NATION COMPETITION LICENSE\n\t\t 2.\tGood Healt Situation", "12p.m.-10p.m. Everyday");
		RacingCarCompany.printDetailOfCompany();
		typeOfRacing a = new typeOfRacing();
		a.typeOfRacing();
		do {
			System.out.println("\nAdmin / Customer: " );
			login = input.next();
			
			switch(login) {
			case "Admin":
			do {
			System.out.println("\n\n1\tEmployee Management\n2\tAdvertisementAndMarketing\n3\tFinance\n4\tProvided Car\n5\tBack To Login\n0\tExit");
			System.out.print("Option:\t");
			adminOptions = input.nextInt();
			switch (adminOptions) {

				case 1:
					EmployeeManagement employee1 = new EmployeeManagement();
					employee1.EmployeeManagementSystem();
					break;
				case 2:
					AdvertisementAndMarketing advertisement1 = new AdvertisementAndMarketing();
					advertisement1.AdvertisementOptions();
					break;
				case 3:
					Finance finance1 = new Finance(5000, 5627000, 1670000, 18750, 8470400, 15000, 90000000, 500000, 8000000);
					finance1.FinancialSatement();
					break;
				case 4:
					providedCar Car1 = new providedCar();
					Car1.providedCar();
					break;
				case 5:
					Login();
					break;
				case 0:
					System.out.println("\n\n=== Have a  Good Days!===");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please Try again\n");
					break;
				}
			}while(adminOptions != 1 && adminOptions != 2 || adminOptions != 3 || adminOptions != 4 || adminOptions != 0);
				break;
			
			case "Customer":
				Customer client1 = new Customer();
				client1.Customer();
				break;
				
		} return;
			
		}while(adminOptions == 0);
	}
}