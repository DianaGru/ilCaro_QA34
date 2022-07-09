package tests;

import models.Car;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCar extends TestBase{

    @BeforeMethod
    public void preCondition(){
        //logged?

    }

    @Test
    public void addNewCarSuccess(){

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
                .carRegNumber("111-22-334")
                .price("65")
                .distanceIncluded("800")
                .features("type of features")
                .about("very nice car")
                .build();

        app.car().openCarForm();
        app.car().fillCarForm(car);
        app.car().attachPhoto("");
        app.car().submit();
    }
}
