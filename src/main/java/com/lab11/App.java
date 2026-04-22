package com.lab11;

public class App {
    public static void main(String[] args) {
        // --- БАНКНЫ ДАНСНЫ ЛОГ (Алхам 2) ---
        BankAccount myAccount = new BankAccount(1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(-50.0);  // WARN үүсгэнэ
        myAccount.withdraw(3000.0); // ERROR үүсгэнэ
        myAccount.withdraw(200.0);
        myAccount.checkSystemConfig(); // FATAL турших

        // --- ХЭРЭГЛЭГЧИЙН АЛДААНЫ ЛОГ (Алхам 3 - DEBUG хийх) ---
        System.out.println("Customer debug эхэллээ...");
        Customer buggyCustomer = new Customer("Bold", null); // email нь null
        try {
            buggyCustomer.getDomain(); // Энд NullPointerException гарч, ERROR лог бичигдэнэ
        } catch (Exception e) {
            // Програмыг гацаахгүйн тулд алдааг энд барьж авна
            System.err.println("Лог файл руу алдааг бичлээ.");
        }
    }
}