import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homeworkLecture12 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myFirstTest(driver);

    }
    public static void myFirstTest(ChromeDriver driver) {
        driver.get("http://training.skillo-bg.com:4200/posts/all");
        WebElement loginButton = driver.findElement(By.xpath("//a[@id='nav-link-login']"));
        loginButton.click();
        driver.findElement(By.cssSelector("body > app-root > div.container-fluid > app-login > div > div > form > p:nth-child(6) > a")).click();
        WebElement userNameInput = driver.findElement(By.xpath("//input[@name = 'username']"));
        userNameInput.sendKeys("username1");
        WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
        emailInput.sendKeys("firstseleniumtest@abv.bg");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        password.sendKeys("passwordInput");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name = 'verify-password']"));
        confirmPassword.sendKeys("passwordInput");
        WebElement signInButton = driver.findElement(By.xpath("//button[@id = 'sign-in-button']"));
        signInButton.click();
    }
}
