package com.myfirstproject.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TestCase01 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //OR

//        WebDriver driver;
//
//        @Before
//        public void setUp() {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//            driver.manage().window().maximize();
//        }


/*
Navigate to Go to https://www.facebook.com/
Click on Create new account
Enter first name
Enter last name
Enter mobile number or email
Enter new password
Enter birthday
Enter gender
Click Sign Up
 */
        // Navigate to Go to https://www.facebook.com/
        driver.get("https://www.facebook.com/");

        driver.findElement(By.partialLinkText("Create new account")).click();
        assertTrue(driver.findElement(By.id("u_3_b_MV")).isDisplayed());

        driver.findElement(By.name("firstname")).sendKeys("John");






























    }
}
