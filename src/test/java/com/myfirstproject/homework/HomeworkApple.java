package com.myfirstproject.homework;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeworkApple extends TestBase{

    @Test
    public void appleScript() {


                // Navigate to the jQuery UI Autocomplete page
                driver.get("https://jqueryui.com/autocomplete/");

                // Switch to the iframe containing the autocomplete example
                driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

                // Find the autocomplete input field and type "Apple"
                WebElement autocompleteInput = driver.findElement(By.id("tags"));
                autocompleteInput.sendKeys("Apple");

                // Wait for the suggestions to appear and select "Applescript"
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
                WebElement applescriptOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.ui-autocomplete li.ui-menu-item")));
                applescriptOption.click();

                // Use JavaScript to get the text of the selected input
                String selectedText = (String) ((ChromeDriver) driver).executeScript("return arguments[0].value;", autocompleteInput);

                // Check if "Applescript" is selected
                if ("Applescript".equals(selectedText)) {
                    System.out.println("Applescript is selected!");
                } else {
                    System.out.println("Applescript is not selected!");
                }

                // Close the browser
                driver.quit();
            }
        }



