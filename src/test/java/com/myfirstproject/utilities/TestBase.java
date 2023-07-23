package com.myfirstproject.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {
    //This class is used to run @Before and @After methods automatically in the child class
    protected static WebDriver driver;

    @Before//This will run before @Test methods
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //       driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

// eger bi sikinti cikarsa driver larda bunlari kullanabiliriz

//        WebDriverManager.firefoxdriver().setup();
//        driver=new FirefoxDriver();
    }

    @After//This will run after @Test methods
    public void tearDown(){
        driver.quit();
    }


}