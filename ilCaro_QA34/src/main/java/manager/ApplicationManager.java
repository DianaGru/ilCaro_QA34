package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplicationManager {

    WebDriver wd;
    HelperUser helperUser;


    public void init(){

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.navigate().to("https://ilcarro-1578153671498.web.app/");
        helperUser = new HelperUser(wd);
    }

    public void stop(){

        wd.quit();

    }

    public HelperUser getHelperUser() {
        return helperUser;
    }


}
