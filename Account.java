 public class Account {
  int accountNo;
  String name;
  float balance;
  public Account(int accountNo, String name, float balance) {
    this.accountNo = accountNo;
    this.name = name;
    this.balance = balance;
  }
  public void deposit(float amount) throws NegativeNumberException {
    if (amount < 0) {
      throw new NegativeNumberException("Invalid transaction, cannot deposit negative amount");
    }
    balance += amount;
  }
  public void withdraw(float amount) throws MinimumBalanceException {
	  
    if (amount < 0) {
      throw new NegativeNumberException("Invalid transaction, cannot withdraw negative amount");
    }
    if (balance - amount < 500) {
      throw new MinimumBalanceException("Insufficient Funds! Minimum balance should be Rs.500/-");
    }
    balance -= amount;
  }
}
class NegativeNumberException extends Exception {
  public NegativeNumberException(String message) {
    super(message);
  }
}
class MinimumBalanceException extends Exception {
  public MinimumBalanceException(String message) {
    super(message);
  }
}
