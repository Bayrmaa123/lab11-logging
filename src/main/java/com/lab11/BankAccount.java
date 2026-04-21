package com.lab11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAccount {
    // 1. Logger тодорхойлох (Encapsulation)
    private static final Logger logger = LogManager.getLogger(BankAccount.class);
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Мөнгө нэмэх метод
    public void deposit(double amount) {
        logger.trace("Entering deposit() with amount={}", amount); // TRACE: Оролт
        if (amount <= 0) {
            logger.warn("Invalid deposit amount: {}. Amount must be positive.", amount); // WARN: Сөрөг дүн
            return;
        }
        logger.debug("Balance before deposit: {}", balance); // DEBUG: Өмнөх үлдэгдэл
        balance += amount;
        logger.info("Successfully deposited {}. New balance: {}", amount, balance); // INFO: Амжилттай
        logger.trace("Exiting deposit()"); // TRACE: Гаралт
    }

    // Мөнгө зарлагадах метод
    public void withdraw(double amount) {
        logger.trace("Entering withdraw() with amount={}", amount);
        if (amount <= 0) {
            logger.warn("Invalid withdraw amount: {}. Negative input.", amount); // WARN: Сөрөг дүн
            return;
        }
        if (amount > balance) {
            logger.error("Insufficient funds! Attempted to withdraw {} but balance is {}.", amount, balance); // ERROR: Үлдэгдэл хүрэхгүй
            return;
        }
        logger.debug("Balance before withdraw: {}", balance);
        balance -= amount;
        logger.info("Successfully withdrew {}. Remaining balance: {}", amount, balance);
        logger.trace("Exiting withdraw()");
    }

    public double getBalance() {
        logger.trace("Checking balance.");
        return balance;
    }

    // FATAL жишээ (Сургуулийн даалгаврын дагуу)
    public void checkSystemConfig() {
        boolean configError = false; // Жишээ болгож алдаа гаргав
        if (configError) {
            logger.fatal("CRITICAL SYSTEM ERROR: Bank configuration file is missing!"); // FATAL: Критик алдаа
        }
    }
}