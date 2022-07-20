package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {

    @Test
    public void searchCurrentMonth() {

        app.search().searchCurrentMonth("Holon", "7/25/2022", "7/24/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListCarsPresents());
    }

    @Test
    public void searchCurrentYear() {
        app.search().searchCurrentYear("Tel Aviv", "8/10/2022", "10/20/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListCarsPresents());
        Assert.assertTrue(app.search().isPageResultAppeareared());
    }

    @Test
    public void searchPeriodPast(){

    }

    @Test
    public void searchCurrentYearLocalDate(){
        app.search().searchCurrentYearLocalDate("Tel Aviv", "8/10/2022", "10/2/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListCarsPresents());

    }

    @Test
    public void searchAnyPeriod(){
        app.search().searchAnyPeriodLocalDate("Haifa", "8/10/2022", "3/20/2023");
        app.search().submit();
        Assert.assertTrue(app.search().isListCarsPresents());

    }

    @Test
    public void searchCurrentYear2() {
        app.search().searchCurrentYear("Haifa", "8/10/2022", "10/20/2022");
        app.search().submit();
        Assert.assertTrue(app.search().isListCarsPresents());
        Assert.assertTrue(app.search().isPageResultAppeareared());
    }

    @AfterMethod
    public void returnToHome(){
        app.search().returnToHome();
    }
}
