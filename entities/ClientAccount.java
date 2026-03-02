package entities;

public class ClientAccount {
	
	// atributos
	private String acholder;
	private int acnumber;
	private double balance;
	private static final double WITHDRAW_TAX = 5.00;
	
	// construtres
	public ClientAccount(String acholder, int acnumber, double initialDeposit) {
		this.acholder = acholder;
		this.acnumber = acnumber;
		this.balance = initialDeposit;
	}
	/* inicializa a conta com os dados informados pelo usuário
	 o saldo pode iniciar em 0 caso não haja deposito inicial */
	
	// encapsulamento
	public String getAcholder() {
		return acholder;
	}
	
	// métodos
	public void addDeposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdrawValue(double withdraw) {
		this.balance -= (withdraw + WITHDRAW_TAX);
	}
	
	public String AccountData() {
		return 	String.format(
				"Account data: \n"
				+ "Account: %d, Holder: %s, Balance: %.2f",
				acnumber, 
				acholder, 
				balance
				);
	}
	
}
