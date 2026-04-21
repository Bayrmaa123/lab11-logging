package com.lab11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    // Logger-ийг тодорхойлж байна
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        // Янз бүрийн түвшний лог бичиж үзэх
        logger.info("Программ амжилттай ажиллаж эхэллээ.");
        logger.warn("Энэ бол анхааруулга лог.");
        logger.error("Энэ бол алдааны лог.");
        
        System.out.println("Консол дээрх энгийн текст.");
    }
}