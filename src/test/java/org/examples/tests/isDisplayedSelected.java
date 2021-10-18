package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedSelected {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        if(driver.findElement(By.name("newsletter")).isDisplayed()){
            if(!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){ // only if not selected - will check and it will be selected
                driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
            }
        }
        if(driver.findElement(By.name("agree")).isEnabled()){
            driver.findElement(By.name("agree")).click();
        }
    }
}
