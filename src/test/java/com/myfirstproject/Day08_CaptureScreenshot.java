package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertTrue;

public class Day08_CaptureScreenshot extends TestBase {


    @Test
    public void CaptureScreenshot() throws IOException, InterruptedException {

        //        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");

//        When user type "uni" in the search box
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        captureScreenshotEntirePage();

//        And select the 'United Kingdom' from the suggestions
        driver.findElement(By.xpath("//div[.='United Kingdom']")).click();
        Thread.sleep(1000);  // eger Thread.sleep koymazsak ayni anda cekilen screenshotlari dosyada goremeyiz.
        captureScreenshotEntirePage();

//        And click on submit button
        driver.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(1000);
        captureScreenshotEntirePage();

//        Then verify the result contains 'United Kingdom'
        String resultText = driver.findElement(By.cssSelector("#result")).getText();
        assertTrue(resultText.contains("United Kingdom"));
        Thread.sleep(1000);
        captureScreenshotEntirePage();



    }
}
