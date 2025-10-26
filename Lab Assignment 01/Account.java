package com.mycompany.account;

class Account {
    String accountNumber;
    double balance;

    Account(String accNum, double bal) {
        if (accNum == null || accNum.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = "Invalid";
        } else {
            this.accountNumber = accNum;
        }

        if (bal < 0) {
            System.out.println("Error: Balance cannot be negative.");
            balance = 0.0;
        } else {
            balance = bal;
        }
    }
    
    public void displayInfo(){
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
    
        public static void main(String[] args) {
        Account a1 = new Account("ACC12345", 1500.75);
        a1.displayInfo();

        Account a2 = new Account("", 2000);
        a2.displayInfo();

        Account a3 = new Account("ACC67890", -500);
        a3.displayInfo();
    }
}
