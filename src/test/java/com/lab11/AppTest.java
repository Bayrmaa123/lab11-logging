package com.lab11;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        // Хүлээгдэж буй үр дүн 1500.0 байх ёстой
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(1000.0);
        account.withdraw(400.0);
        // Хүлээгдэж буй үр дүн 600.0 байх ёстой
        assertEquals(600.0, account.getBalance(), 0.001);
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(500.0); // Үлдэгдэл хүрэхгүй үе
        // Үлдэгдэл хэвээрээ (100.0) үлдэх ёстой
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}