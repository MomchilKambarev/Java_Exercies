package Lecture12webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class FindAndClickLogin {
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://training.skillo-bg.com:4200/posts/all");


        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
        driver.quit();
    }
}