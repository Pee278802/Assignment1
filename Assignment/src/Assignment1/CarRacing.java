package Assignment1;

public class CarRacing {
	private String name, location, businessHours, requirement;
	
	public void detailOfCompany(String name, String location, String requirement, String businessHours) {
		name = this.name;
		location = this.location;
		businessHours = this.businessHours;
		requirement = this.requirement;
	}
	
	public void printDetilOfCompany() {
		System.out.println("Name:\t" + name);
		System.out.println("Location:\t" + location);
		System.out.println("Requirement:\t" + requirement);
		System.out.println("Business Hours:\t" + businessHours);
	}
}
