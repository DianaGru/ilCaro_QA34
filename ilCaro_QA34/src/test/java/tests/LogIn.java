package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogIn extends TestBase {

    @BeforeMethod
    public void preCondition() {

        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logOut();
            logger.info("Test start with Log out");
        }
    }


    @Test
    public void logInSuccess() {
        logger.info("Test start with email: 'emmabr@gmail.com' & password 'E12345n$' ");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345n$");
        app.getHelperUser().submit();
        Assert.assertTrue(app.getHelperUser().isLogged(), "Logged in");
        logger.info("Test passed");


    }

    @Test
    public void logInSuccess2() {

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345n$");
        app.getHelperUser().submit();
        Assert.assertTrue(app.getHelperUser().isLogged(), "Logged in");

    }
    @AfterMethod
    public void postCondition(){
        app.getHelperUser().clickOk();
    }

//    @Test
//    public void logInUnsuccessful1() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabrgmail.com", "E12345n$");
//        // app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//      // Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful2() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmailcom", "E12345n$");
//        //app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful3() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmail.co", "E12345n$");
//        // app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful4() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345n");
//        //app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful5() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "e12345n$");
//        // app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful6() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E12345N$");
//        // app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful7() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "E54321n$");
//        //  app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
//    @Test
//    public void logInUnsuccessful8() {
//        app.getHelperUser().openLoginForm();
//        app.getHelperUser().fillLoginForm("emmabr@gmail.com", "Е12345n$");
//        // app.getHelperUser().submitLogin();
//        Assert.assertFalse(app.getHelperUser().isLogged());
//        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
//
//    }
//
}
