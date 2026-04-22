package com.lab11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer {
    private static final Logger logger = LogManager.getLogger(Customer.class);
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        // Параметрт лог хэрэглэх (String concatenation-аас зайлсхийх)
        logger.info("New customer created: name={}, email={}", name, mask(email));
    }

    // И-мэйл хаягийг масклах функц (Жишээ: bold@gmail.com -> bo***om)
    private static String mask(String s) {
        if (s == null || s.length() < 5) return "****";
        return s.substring(0, 2) + "***" + s.substring(s.length() - 2);
    }

    public String getDomain() {
        logger.trace("Entering getDomain()");
        if (email == null || !email.contains("@")) {
            // Утгатай контекст болон масклалт ашиглах
            logger.warn("Invalid email format for user {}: {}", name, mask(email));
            return "UNKNOWN";
        }
        String domain = email.substring(email.indexOf("@") + 1).toUpperCase();
        logger.info("Domain extracted: {}", domain);
        return domain;
    }
}