package com.szymczyk;

public class Main {

    public static void main(String[] args) {

    	VipCustomer AnnaCustomer = new VipCustomer();
    	System.out.println(AnnaCustomer.getName());

		VipCustomer MariaCustomer = new VipCustomer("Maria", 60000.0);
		System.out.println(MariaCustomer.getName());

		VipCustomer ZofiaCustomer = new VipCustomer("Zofia", 790000.0, "zofia@zofia.com");
		System.out.println(ZofiaCustomer.getName());

	//	System.out.println(AnnaCustomer.getCreditLimit());
	//	System.out.println(AnnaCustomer.getEmailAdress());

	//BankAccount bobsAccount = new BankAccount(); //"123", 0.00, "Bob Builder", "bob@gmail.com", "123 456 789");
//
//		System.out.println(bobsAccount.getNumber());
//		System.out.println(bobsAccount.getBalance());
//		System.out.println(bobsAccount.getCustomerName());
//		System.out.println(bobsAccount.getEmail());
//		System.out.println(bobsAccount.getPhonenumber());

//	bobsAccount.withdrawal(100.0);

//	bobsAccount.deposit(50.0);
//	bobsAccount.withdrawal(100.0);

//	bobsAccount.deposit(51.0);
//	bobsAccount.withdrawal(100.0);

//	BankAccount timAccount = new BankAccount("Tim", "tim@gmail.com", "876 123 566");
//		System.out.println(timAccount.getNumber() + "name" + timAccount.getCustomerName());
    }
}
