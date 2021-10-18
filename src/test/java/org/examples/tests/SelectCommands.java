package org.examples.tests;

//

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
        WebElement element = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        //we are storing this in a webElement - will be using this webElement in Select class
        Select select = new Select(element);
        //select.selectByValue("az");//for the options under select (opt 1)
        //select.selectByVisibleText("Name (Z to A)");//By HTML Text (opt 2)
        select.selectByIndex(3);//(opt 3) by index position
        //To select multiple values
        boolean multipleCheck = select.isMultiple();
        System.out.println(multipleCheck);
    }
}
