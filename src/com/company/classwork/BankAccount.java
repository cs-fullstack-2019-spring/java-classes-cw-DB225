package com.company.classwork;

public class BankAccount {
    private String customerName;
    private int currentBalance;
    private int withdraw;
    private int deposit;

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void withdrawInfo(){
        System.out.println("The new balance of "+this.customerName + " is "+(this.currentBalance-this.withdraw));
    }
    public void depositInfo(){
        System.out.println("The new balance of "+this.customerName + " is "+(this.currentBalance+this.deposit));
    }
}
