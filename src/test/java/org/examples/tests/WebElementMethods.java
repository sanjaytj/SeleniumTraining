package org.examples.tests;

import org.openqa.selenium.By; //imported for By
import org.openqa.selenium.Keys; //Imported for Keys
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).clear(); //clear
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER); //can use any of the username or pwd here

    }
}
//+++++++++++++++++++++++++++++++++++++//
//To login to the Website Swaglabs
//+++++++++++++++++++++++++++++++++++++//