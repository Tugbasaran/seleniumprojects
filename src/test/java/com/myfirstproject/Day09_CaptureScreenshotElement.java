package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class Day09_CaptureScreenshotElement extends TestBase {

    @Test
    public void captureScreenshotElement() throws IOException {
        driver.get("https://techproeducation.com/");
        captureScreenshotEntirePage();

        WebElement logo = driver.findElement(By.xpath("(//img[@alt='TechPro Education'])[1]"));
        assertTrue(logo.isDisplayed());
        captureScreenshotElement(logo);






    }

}