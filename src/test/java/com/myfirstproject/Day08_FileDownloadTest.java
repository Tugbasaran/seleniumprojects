package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Day08_FileDownloadTest extends TestBase {
    @Test
    public void downloadTest() throws InterruptedException {

        //  Go to  https://testcenter.techproeducation.com/index.php?page=filedownload
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //        Download b10 all test cases, code.docx file
        driver.findElement(By.partialLinkText("b10 all")).click();
        Thread.sleep(3000);//waiting for the file download

        // Then verify if the file downloaded successfully
        String filePath = System.getProperty("user.home")+"/Downloads/b10 all test cases, code.docx";//MAC

//        String filePath = System.getProperty("user.home")+"\\Downloads\\testFile.txt";//WINDOWS

        boolean isFileDownloaded = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isFileDownloaded);
    }
}