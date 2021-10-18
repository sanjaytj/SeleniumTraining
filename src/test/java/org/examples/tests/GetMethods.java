package org.examples.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String source = driver.getPageSource();
        System.out.println(url +" "+title+" "+source);

        if(source.contains("en-IN")) //to Validate if this string is contained in page source
        {
            System.out.println("Contains Text");
        }
        else
        {
            System.out.println("Point blank no");
        }
        //driver.close();
        driver.get("https://naukri.com");
        //driver.quit();
    }
}
