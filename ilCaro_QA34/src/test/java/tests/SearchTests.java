package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends TestBase{

    @Test
    public void searchCurrentMonth(){

        app.search().searchCurrentMonth("Holon", "7/25/2022", "7/24/2022");
        app.search().submit();
       // Assert.assertTrue(app.search().isListCarsPresents());
    }

    @Test
    public void searchCurrentYear(){
        app.search().searchCurrentYear("Holon", "8/10/2022", "10/20/2022");
        app.search().submit();
        // Assert.assertTrue(app.search().isListCarsPresents());
    }
}
