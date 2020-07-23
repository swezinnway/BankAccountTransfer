package ACCOUNT;

public class Account {
 public String id;
 public String name;
public  int balance=0;
 
 public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

public Account(String id, String name, int balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}

public int credit(int amt) {
	balance+=amt;
	return balance;
	
}
public void debit(int amt) {
	if(amt<=balance) {
		balance-=amt;
		System.out.println("Your balance is "+balance);
	}else {
		System.out.println("amount not insufficent");
	}
	}

public int transferTo(Account another,int amt) {
	 if (amt<=balance) {
		 balance-=amt;
			another.credit(amt);
		}else {
			System.out.println("amount exceed!");
		}
	return balance;
	 }
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Account a=new Account("a", "Nu Nu",15000);
	Account b=new Account("b", "Aye Aye", 1600000);

	b.transferTo(a,100000);
	System.out.println("Nu Nu balance is "+a.balance);
	System.out.println("Aye Aye balance is "+b.balance);
}

@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}
}


