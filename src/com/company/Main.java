package com.company;
import com.company.classwork.BankAccount;
import com.company.classwork.Dog;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setName("Spike");
        d1.setBred("beagle");
        d1.setAge(12);
        d1.setColor("brown");
        d1.printDetails();

        Dog d2 = new Dog();
        d2.setName("elvis");
        d2.setBred("terrier");
        d2.setAge(7);
        d2.setColor("tan");
        d2.printDetails();

        Dog d3 = new Dog();
        d3.setName("Zo");
        d3.setBred("yorie");
        d3.setAge(5);
        d3.setColor("silver/brown");
        d3.printDetails();


        BankAccount KYancy = new BankAccount();
        KYancy.setCustomerName("Kevin Yancy");
        KYancy.setCurrentBalance(10);
        KYancy.setDeposit(100);
        KYancy.depositInfo();


        BankAccount KGibbs = new BankAccount();
        KGibbs.setCustomerName("Kenn gibbs");
        KGibbs.setCurrentBalance(1000);
        KGibbs.setWithdraw(100);
        KGibbs.withdrawInfo();
    }
}
