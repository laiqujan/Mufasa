public interface Transaction {

	public Double getBalance(String cardNumber);

	public Double deposit(String cardNumber, double amount);

	public Double debit(String cardNumber, double amount);

}
