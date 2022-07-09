package manager;

import models.User;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
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

    public void openRegistrationForm() {
        click(By.xpath("//a[text()=' Sign up ']"));
    }

    public void fillRegistrationForm(User user) {
        type(By.id("name"), user.getName());
        type(By.id("lastName"), user.getLastName());
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());

    }

    public void checkPolicy() {
        //click(By.id("terms-of-use"));
        click(By.cssSelector("label[for='terms-of-use']"));
    }

    public void checkPolicyXY() {

        WebElement label = wd.findElement(By.cssSelector("label[for='terms-of-use']"));
        Rectangle rect = label.getRect();
        int xOffSet=rect.getWidth()/2;
        int yOffSet = rect.getHeight()/2;

        Actions actions = new Actions(wd);
        actions.moveToElement(label,-xOffSet,0).click().release().perform();

    }

    public void clickOk() {
        click(By.xpath("//button[text()='Ok']"));
    }

    public boolean isLoggedRegistration() {
        List<WebElement> list = wd.findElements(By.cssSelector("div[class='header'] a:nth-child(5)"));
        return list.size() > 0;
    }

    public void logOutRegistration() {
        click(By.cssSelector("div[class='header'] a:nth-child(5)"));
    }
}
