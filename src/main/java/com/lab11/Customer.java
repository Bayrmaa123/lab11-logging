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
        logger.debug("Customer created: name={}, email={}", name, email);
    }

    public String getDomain() {
    logger.trace("Entering getDomain()");
    logger.debug("Current email value: {}", email);

    // ЗАСВАР: null эсвэл @ тэмдэг байхгүй үед шалгах
    if (email == null || !email.contains("@")) {
        logger.warn("Invalid or missing email for customer: {}. Returning 'UNKNOWN'", name);
        return "UNKNOWN";
    }

    String domain = email.substring(email.indexOf("@") + 1).toUpperCase();
    logger.info("Domain successfully extracted: {}", domain);
    logger.trace("Exiting getDomain()");
    return domain;
}
}