package Assignment1;

public class Finance {

	protected double businessLicense, salary, advertisementAndMarketing, Insurance, maintenance, prize;
	protected double entryFee , ticketFee, Sponsorship; 
	
	public Finance(double businessLicense, double salary, double advertisementAndMarketing, double Insurance, double maintenance, double prize, double entryFee, double ticketFee, double Sponsorship) {
		this.businessLicense = businessLicense;
		this.salary = salary;
		this.advertisementAndMarketing = advertisementAndMarketing;
		this.Insurance = Insurance;
		this.maintenance = maintenance;
		this.prize = prize;
		this.entryFee = entryFee;
		this.ticketFee = ticketFee;
		this.Sponsorship = Sponsorship;
	}
	
	public double totalNetIncome() {
		return totalRevenue() - totalExpense();
	}
	
	public double totalExpense() { 
		return businessLicense + Insurance + salary + advertisementAndMarketing + maintenance + prize;
	}
	
	public double totalRevenue() {
		return entryFee + ticketFee + Sponsorship;
	}
	
	public void FinancialSatement() {
		System.out.println("-----------------------FINANCIAL STATEMENT---------------------");
		System.out.println("1. \t Revenue");
		System.out.printf("%-20s: RM%.2f%n", "Entry Fee:", entryFee);
		System.out.printf("%-20s: RM%.2f%n", "Ticket Fee:", ticketFee);
		System.out.printf("%-20s: RM%.2f%n", "Total Sponsorship", Sponsorship);
		System.out.printf("%-20s: RM%.2f%n", "Total Revenue", totalRevenue());
		System.out.println();
		System.out.println("2. \t Expenses");
		System.out.printf("%-20s: RM%.2f%n", "Total Expense", totalExpense());
		System.out.printf("%-20s: RM%.2f%n", "businessLisense", businessLicense);
		System.out.printf("%-20s: RM%.2f%n", "Insurance", Insurance);
		System.out.printf("%-20s: RM%.2f%n", "Salary", salary);
		System.out.printf("%-20s: RM%.2f%n", "Advertisement And Marketing", advertisementAndMarketing);
		System.out.println();
		System.out.println("3. \t Net Income");
		System.out.printf("%-20s: RM%.2f%n%n", "Total Net Income", totalNetIncome());
	}
}
