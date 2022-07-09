package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogIn extends TestBase {

    @BeforeMethod
    public void preCondition() {

        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logOut();
        }
    }


    @Test
    public void logInSuccess() {

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345n$");
        app.getHelperUser().submit();
        Assert.assertTrue(app.getHelperUser().isLogged());

    }

    @Test
    public void logInUnsuccessful1() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabrgmail.com", "E12345n$");
        // app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
      // Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful2() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmailcom", "E12345n$");
        //app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful3() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.co", "E12345n$");
        // app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful4() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345n");
        //app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful5() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "e12345n$");
        // app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful6() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345N$");
        // app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful7() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E54321n$");
        //  app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

    @Test
    public void logInUnsuccessful8() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "Е12345n$");
        // app.getHelperUser().submitLogin();
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());

    }

}
