package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSourceTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techproeducation.com/");

        String expectedData= "Automation";
        String actualPageSource= driver.getPageSource();
        //System.out.println("actualPageSource="+ actualPageSource);

        if(actualPageSource.contains(expectedData)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED!!!");
            System.out.println("ActualPageSource does not contain "+expectedData);
        }

        driver.quit();
    }
}
