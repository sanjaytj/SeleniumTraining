package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
        String text = driver.findElement(By.xpath("//span[@class='title']")).getText(); //<span class="title">Products</span>
        //To extract Text from a particular Element
        if(text.equals("PRODUCT")){
            System.out.println("Text is matching");
        }
        else{
            System.out.println("Text is not matching");
        }
        String tag = driver.findElement(By.id("item_4_img_link")).getTagName();
        if(tag.equals("a")){
            System.out.println("Tag name is correct");
        }
        else{
            System.out.println("Tag name is incorrect");
        }
    }
}
