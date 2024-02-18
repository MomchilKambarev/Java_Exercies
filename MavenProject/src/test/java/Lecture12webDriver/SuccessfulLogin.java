package Lecture12webDriver;

// Test - successful login
// 1. Navigate to Home page
// 2. Navigate to Login page by clicking Login tab button
// 3. Validate that the url is correct
// 4. Validate that the 'Sign in' text is visible
// 5. Enter correct username
// 6. Enter correct password
// 7. Click sign in button
// 8. Validate that the url is correct ( Home page expected )
// 9. Validate that there is a Profile tab button visible
// 10. Validate that there is a New post tab button visible
// 11. Click Profile button
// 12. Validate that the correct username is displayed.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class SuccessfulLogin {

    ChromeDriver driver;


    @Test
    public void testLogin() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("http://training.skillo-bg.com:4200/posts/all");

    }
}

