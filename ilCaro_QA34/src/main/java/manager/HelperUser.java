package manager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {

        WebElement logInTab = wd.findElement(By.xpath("//*[contains(@href, '/login')]"));
        logInTab.click();
    }

    public void fillLoginForm(String email, String password) {
        type(By.cssSelector("#email"), email);
        type(By.cssSelector("#password"), password);
    }


    public void submitLogin() {
        wd.findElement(By.cssSelector("button[type='submit']")).click();
        wd.findElement(By.cssSelector(".positive-button")).click();
    }

    public boolean isLogged() {
        List<WebElement> list = wd.findElements(By.xpath("//*[contains(@href, '/logout')]"));
        return list.size() > 0;

    }

    public void logOut() {
        click(By.xpath("//*[contains(@href, '/logout')]"));

    }

    public boolean isAlertDisplayed() {
        Alert alert = new WebDriverWait(wd, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            return true;
        }
    }
}
