package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if (app.getHelperUser().isLoggedRegistration()) {
            app.getHelperUser().logOutRegistration();
        }
    }

    @AfterMethod
    public void postCondition() {
        app.getHelperUser().clickOk();
    }


    @Test
    public void registrationSuccess(){
        int i = (int) System.currentTimeMillis()/1000;
        User user = new User().setName("Pink").setLastName("Show").setEmail("pink"+i+"@gmail.com").setPassword("Pp12345$");

        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().fillRegistrationForm(user);
        app.getHelperUser().checkPolicyXY();
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(),"Registered");


    }

    @Test
    public void registrationSuccess2() {
        int i = (int) System.currentTimeMillis() / 1000;
        User user = new User().setName("Pink").setLastName("Show").setEmail("pink" + i + "@gmail.com").setPassword("Pp12345$");

        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().fillRegistrationForm(user);
        app.getHelperUser().checkPolicyXY();
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(), "Registered");

    }

    @Test
    public void registrationWrongPasswordFormat(){
        User user = new User()
                .setName("Talia")
                .setLastName("Show")
                .setEmail("talia@gmail.com")
                .setPassword("Talia");

        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().fillRegistrationForm(user);
        app.getHelperUser().checkPolicyXY();
        Assert.assertTrue(app.getHelperUser().isErrorPasswordFormatDisplayed());
        Assert.assertTrue(app.getHelperUser().isErrorPasswordSizeDisplayed());
        Assert.assertTrue(app.getHelperUser().isYallaButtonActive());

    }

}
