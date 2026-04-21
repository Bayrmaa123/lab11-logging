package com.lab11;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(1000.0);
        account.withdraw(400.0);
        assertEquals(600.0, account.getBalance(), 0.001);
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(500.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testCustomerDomain() {
        // Хэвийн и-мэйл хаяг шалгах
        Customer customer = new Customer("Bold", "bold@gmail.com");
        assertEquals("GMAIL.COM", customer.getDomain());
    }
}