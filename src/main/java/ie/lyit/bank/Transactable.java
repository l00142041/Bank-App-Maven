package ie.lyit.bank;

public interface Transactable {
	public abstract void deposit(double amount);
	void withdraw(double amount);  
}
