package Assignment1;

import java.util.Scanner;

public class EmployeeManagement {
	Scanner input = new Scanner(System.in);
	protected String employeeName, email, position, username, password, newPassword, comfirmPassword;
	protected int age, TAC;
	protected long contactNo, IC;
	protected double salary;
	private String confirmPassword;
	
	public static void main(String[] args) {
	EmployeeManagement a = new EmployeeManagement();
	//a.AddEmployee();
	//a.printDetail();
	a.forgetPassword(13579);
	a.deleteEmployee();
	
	}
		public void AddEmployee() {
			System.out.println("-------------------Add Employee---------------");
			System.out.print("Enter the name: ");
			this.employeeName = input.next();
			System.out.print("Enter age: ");
			this.age = input.nextInt();
			System.out.print("Enter contact no: ");
			this.contactNo = input.nextLong();
			System.out.print("Enter position: ");
			this.position = input.next();
			System.out.print("Enter salary: ");
			this.salary = input.nextDouble();
		System.out.println("The new employee has been successfully added. ");
		return;
		}
		public void Login(String username, String password) {
			this.username = input.next();
			this.password = input.next();
				if(this.username.equals(username) && password.equals(password)) {
					System.out.println("Login Successful.");
				}else{
					System.out.println("Please try again.");
				}
		}
		public void printDetail() {
			System.out.format(" Name " + "\t\t :" + this.employeeName + "\n Age " + "\t\t :" + this.age + "\n Contact No " + "\t :" + this.contactNo + "\n Possition " + "\t :" + this.position + "\n Salary " + "\t :%.2f\"", this.salary);
		}	
		public void forgetPassword(int TAC) {
			System.out.println("\n------------Reset Your Password------------");			
			System.out.print("TAC \t: ");
			this.TAC = input.nextInt();
				if (this.TAC == TAC) {
					while (this.TAC == TAC) {
						System.out.println("Enter a new password: \t");
						this.newPassword = input.next();
						System.out.println("Comfirm password: \t");
						this.confirmPassword = input.next();
					
						if (this.confirmPassword == this.newPassword || this.newPassword == this.comfirmPassword) {
							System.out.println("New password has been updated");
						} else
							System.out.println("Please try again!");
			TAC++;
				} 
			}else 
				do{
					System.out.println("The TAC is incorrect, please try again!");
					System.out.print("TAC \t: ");
					this.TAC = input.nextInt();
					if(this.TAC == TAC) {
						System.out.println("Enter a new password: \t");
						this.newPassword = input.next();
						System.out.println("Comfirm password: \t");
						this.confirmPassword = input.next();
					
						if (this.confirmPassword == this.newPassword && this.newPassword == this.confirmPassword) {
							System.out.println("New password has been updated");
						} else
							System.out.println("Please try again!");
			TAC++;
					}
				} while(this.TAC!=TAC);
		}
	
		public void deleteEmployee() {
			this.employeeName = input.next();
			this.age = input.nextInt();
			this.contactNo = input.nextLong();
			this.position = input.next();
			this.salary = input.nextDouble();
			
		}
}
