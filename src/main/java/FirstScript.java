import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    public static void main(String[] args) {

       System.setProperty("webdriver.com.driver","src/test/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver(); //opens a chromeDriver instance
       driver.get("https://google.com");
       driver.manage().window().maximize();
       String title = driver.getTitle(); //method will return the title of the current page
       if(title.equals("Google")){
           System.out.println(driver.getTitle());
       }
       else {
           System.out.println("Title is incorect");
       }
       //driver.quit();
    }
}
