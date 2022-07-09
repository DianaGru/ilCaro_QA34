package tests;

import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @Test
    public void registrationSuccess(){
        User user = new User().setName("Pink").setLastName("Show").setEmail("pink@gmail.com").setPassword("Pp12345$");



    }
}
