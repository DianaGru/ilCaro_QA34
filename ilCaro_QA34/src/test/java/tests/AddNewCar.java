package tests;

import models.Car;
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewCar extends TestBase{

    @BeforeMethod
    public void preCondition(){
        //logged?
        if(!app.getHelperUser().isLogged()){
            app.getHelperUser().login(new User().setEmail("emmabr@gmail.com").setPassword("E12345n$"));
        }

    }

    @Test
    public void addNewCarSuccess(){
        Random random = new Random();
        int i = random.nextInt(1000)+1000;

        Car car = Car.builder()
                .address("Holon, Israel")
                .make("KIA")
                .model("Picanto")
                .year("2020")
                .engine("1.4")
                .fuel("Petrol")
                .gear("AT")
                .wD("AWD")
                .doors("5")
                .seats("5")
                .clasS("C")
                .fuelConsumption("5.5")
                .carRegNumber("111-22"+i)
                .price("65")
                .distanceIncluded("800")
                .features("type of features")
                .about("very nice car")
                .build();

        app.car().openCarForm();
        app.car().fillCarForm(car);
        app.car().attachPhoto("C:\\Users\\Diana\\QA34 Automatization\\ilCaro_QA34\\car.pick.jpg");
        app.car().submit();
        Assert.assertEquals(app.car().getMessage(),"Car added");
    }

    @AfterMethod
    public void postCondition(){
        app.car().returnHome();
    }
}
