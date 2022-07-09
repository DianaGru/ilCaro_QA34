package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @BeforeTest
    public void preCondition(){
        if (app.getHelperUser().isLoggedRegistration()) {
            app.getHelperUser().logOutRegistration();
        }
    }



    @Test
    public void registrationSuccess(){
        int i = (int) System.currentTimeMillis()/1000;
        User user = new User().setName("Pink").setLastName("Show").setEmail("pink"+i+"@gmail.com").setPassword("Pp12345$");

        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().fillRegistrationForm(user);
        app.getHelperUser().checkPolicyXY();
        app.getHelperUser().submit();
        Assert.assertEquals(app.getMessage(),"Registered");
        app.getHelperUser().clickOk();

    }

    @Test
    public void registrationSuccess2() {
        int i = (int) System.currentTimeMillis() / 1000;
        User user = new User().setName("Pink").setLastName("Show").setEmail("pink" + i + "@gmail.com").setPassword("Pp12345$");

        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().fillRegistrationForm(user);
        app.getHelperUser().checkPolicyXY();
        app.getHelperUser().submit();
        Assert.assertEquals(app.getMessage(), "Registered");
        app.getHelperUser().clickOk();
    }
}
