import java.util.Scanner;
public class BankAccount {
	Scanner sc=new Scanner(System.in);
	long accountNumber;
	String accountHolderName;
	double balance;
	
	void deposit() {
		double deposit=100000.00;
		balance=balance+deposit;
		System.out.println("Deposit money:"+deposit);
		System.out.println("balance after deposit:"+balance);
	}
	
	void withdraw() {
		double withdraw=5000;
		balance=balance-withdraw;
		System.out.println("withdraw  money:"+withdraw);
		System.out.println("balance after withdraw:"+balance);
		
	}
	
	void checkbalence() {
		System.out.println("check balance:"+balance);
	}
	void Displaydetails() {
		System.out.println("Account Number:" +accountNumber);
		System.out.println("Account Holder Name:" +accountHolderName);
	    System.out.println("Balance:"+balance);
	    deposit();
	    withdraw();
	    checkbalence();
	}
	BankAccount(long accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}

	public static void main(String[] args) {
		BankAccount ba=new  BankAccount(1234567892,"anusha",10000.00);
		ba.Displaydetails();
			}

}
