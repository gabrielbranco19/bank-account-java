package programa_contabancaria;

import java.util.Locale;
import java.util.Scanner;

import entities.ClientAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int acnumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String acholder = sc.nextLine();
	
		System.out.print("Enter the initial deposit (0 for none): ");
		double initialDeposit = sc.nextDouble();
		
		ClientAccount acc = new ClientAccount(acholder, acnumber, initialDeposit);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.addDeposit(deposit);
		
		System.out.println("-".repeat(10));
		System.out.println(acc.AccountData());
		System.out.println("-".repeat(10));
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdrawValue(withdraw);
		System.out.println("-".repeat(10));
		System.out.println(acc.AccountData());
		
		sc.close();
	}

}
