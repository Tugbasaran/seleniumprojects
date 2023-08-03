package com.myfirstproject.practices.practice05;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Q04_WebTables_RoofHeight extends TestBase {

    //We will make a roof of 5% of the height of the earliest built tower.
    //Find how many meters we will build.
     /*
    Given
        Go to https://www.techlistic.com/p/demo-selenium-practice.html
    When
        Put all built years into a list
    And
        Calculate min year
    And
        Put all heights into a list
    And
        Calculate the height to build
    Then
        Assert that build height is 25.45 meters
     */

    @Test
    public void webTables_RoofHeight() {
//        Go to https://www.techlistic.com/p/demo-selenium-practice.html
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

//        Put all built years into a list
        List<WebElement> builtYears = driver.findElements(By.xpath("(//tbody)[2]/tr/td[4]"));
        builtYears.forEach(t -> System.out.println(t.getText()));


//        Calculate min year
        int minYear = Integer.MAX_VALUE;
        for (WebElement w : builtYears) {
            if (Integer.parseInt(w.getText()) < minYear) {
                minYear = Integer.parseInt(w.getText());
            }
        }

        System.out.println("minYear = " + minYear);

        //Calculate the index of min year
        int idxOfMinYear = 0;
        for (int i = 0; i < builtYears.size(); i++) {
            if (Integer.parseInt(builtYears.get(i).getText()) == minYear) {
                idxOfMinYear = i;
            }
        }

        System.out.println("idxOfMinYear = " + idxOfMinYear);


//        Put all heights into a list
        List<WebElement> heights = driver.findElements(By.xpath("(//tbody)[2]/tr/td[3]"));
        String heightOfFirstBuiltTower = heights.get(idxOfMinYear).getText();
        System.out.println("heightOfFirstBuiltTower = " + heightOfFirstBuiltTower);

//        Calculate the height to build
        double heightOfRoof = Integer.parseInt(heightOfFirstBuiltTower.replaceAll("[^0-9]", "")) * 0.05;
        System.out.println("heightOfRoof = " + heightOfRoof);
        String formattedHeight = new DecimalFormat("0.00").format(heightOfRoof);
        System.out.println("formattedHeight = " + formattedHeight);

//        Assert that build height is 25.45 meters
        assertEquals("25.45", formattedHeight);

    }

}