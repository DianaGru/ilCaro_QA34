package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {

        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-1578153671498.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void openLoginForm() {

       WebElement logInTab = wd.findElement(By.xpath("//*[contains(@href, '/login')]"));
       logInTab.click();
    }

    public void fillLoginForm(String email, String password) {
        type(By.cssSelector("#email"), email);
        type(By.cssSelector("#password"), password);
    }

    public void type(By locator, String text) {
        if (text != null) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }

    }

    public void submitLogin() {
        wd.findElement(By.cssSelector("button[type='submit']")).click();
        wd.findElement(By.cssSelector(".positive-button")).click();
    }

    public void logOut(){
        WebElement logOutButton = wd.findElement(By.xpath("//*[contains(@href, '/logout')]"));
        logOutButton.click();
    }

    @AfterMethod
    public void exit(){

        wd.quit();
    }
}
