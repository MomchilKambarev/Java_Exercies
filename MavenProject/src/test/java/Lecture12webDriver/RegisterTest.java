package Lecture12webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//1.Open site
//2.Check URL
//3.Click Login button
//4.Click Register button
//5.Check "Sign Up" is there
//6.Add username
//7.Add email
//8.Add password
//9.Confirm password
//10.Click "Sign In" button
//11.Logout
//12.Close/quit


public class RegisterTest {
    @Test
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromiumdriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().getImplicitWaitTimeout();

        //1.Open site
        driver.get("http://training.skillo-bg.com:4300/posts/all");
        driver.manage().window().maximize();
        String currentUrl = "http://training.skillo-bg.com:4300/posts/all";
        driver.getCurrentUrl();
        if (currentUrl == driver.getCurrentUrl()) {
            System.out.println("All is fine");
        }

        WebElement input = driver.findElement(By.id("nav-link-login"));
        input.click();

        driver.quit();


    }
}
