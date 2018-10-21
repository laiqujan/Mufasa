import java.util.ArrayList;

public class BankAccount {
	private String passwrod;
	private String cardHolderName;
	private String cardType;
	private String cardNumber;
	private String expiaryDate;
	private Address address;
	private ArrayList<Customer> customer;
	private Transaction transaction;
	private double balance;

	public BankAccount(Address address, String passwrod, String cardHolderName, String cardType, String cardNumber,
			String expiaryDate, ArrayList<Customer> customer, Transaction transaction, double balance) {
		this.address = address;
		this.passwrod = passwrod;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expiaryDate = expiaryDate;
		this.customer = customer;
		this.transaction = transaction;
	}

	public BankAccount(Address address, String passwrod, String cardHolderName, String cardType, String cardNumber,
			String expiaryDate, double balance) {
		this.address = address;
		this.passwrod = passwrod;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expiaryDate = expiaryDate;
		this.balance = balance;
	}

	public BankAccount(String cardNumber, double balance) {
		this.balance = balance;
		this.cardNumber = cardNumber;
		this.customer = new ArrayList<>();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiaryDate() {
		return expiaryDate;
	}

	public void setExpiaryDate(String expiaryDate) {
		this.expiaryDate = expiaryDate;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	public void addCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}

	public Transaction accessTransaction() {
		return transaction;
	}

	public void startTransaction(Transaction transaction, String transType) {
		this.transaction = transaction;
	}

	public void addCustomerAccount(Customer cs) {
		this.customer.add(cs);
	}

	public Double getTotalBalance() {
		return this.transaction.getBalance(this.cardNumber);

	}

}
