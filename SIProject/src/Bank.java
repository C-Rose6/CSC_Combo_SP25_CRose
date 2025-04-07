import java.util.Scanner;

public class Bank {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double balance = 2000;
		double overdraft = 200;
		System.out.println("$" + balance);

		System.out.println("How much would you like to withdraw?");
		double amount = sc.nextDouble();
		
		balance = withdraw(balance, amount, overdraft);
		
		System.out.println("Your new balance is: $" + balance);
	}

	public static double withdraw(double balance, double withdrawAmount, double overdraft) {
		return balance - withdrawAmount;
		
	}
//	public static double deposit() {
	}
