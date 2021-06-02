package Assignment1;

import java.util.Scanner;

public class CarRacingMain {
	
	public static void main(String[] args) {
		String login;
		int adminOptions;
		
		Scanner input = new Scanner(System.in);	
		
		CarRacing RacingCarCompany = new CarRacing();
		RacingCarCompany.detailOfCompany("Pro MotorSport Enterprise", "Alor Setar, Kedah", "1.\tPossess a NATION COMPETITION LICENSE\n2.\tGood Healt Situation", "12p.m.-10p.m. Everyday");
		typeOfRacing a = new typeOfRacing();
		a.typeOfRacing();
		
		do {
			System.out.println("Login as Admin / Customer: " );
			login = input.next();

			switch(login) {
				case "Admin":
				do {
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
					case 0:
						break;
					default:
						System.out.println("Invalid choice. Try again.\n");
						break;
					}
				}while(adminOptions == 0);
					
				case "Customer":
					Customer client1 = new Customer();
					client1.Customer();
					break;
				
				case "Back":
					System.out.println("Back to the main menu");
					break;
			}
		}while(login == "Back");


	}
}