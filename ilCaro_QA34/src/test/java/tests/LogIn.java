package tests;

import org.testng.annotations.Test;

import java.time.Duration;

public class LogIn extends TestBase{


    @Test
    public void logInSuccess(){

       openLoginForm();
       fillLoginForm("emmabr@gmail.com", "E12345n$");
       submitLogin();
       logOut();

    }

    @Test
    public void logInUnsuccessful1(){
        openLoginForm();
        fillLoginForm("emmabrgmail.com", "E12345n$");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful2(){
        openLoginForm();
        fillLoginForm("emmabr@gmailcom", "E12345n$");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful3(){
        openLoginForm();
        fillLoginForm("emmabr@gmail.co", "E12345n$");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful4(){
        openLoginForm();
        fillLoginForm("emmabr@gmail.com", "E12345n");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful5(){
        openLoginForm();
        fillLoginForm("emmabr@gmail.com", "e12345n$");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful6(){
        openLoginForm();
        fillLoginForm("emmabr@gmail.com", "E12345N$");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful7(){
        openLoginForm();
        fillLoginForm("emmabr@gmail.com", "E54321n$");
        submitLogin();
        logOut();

    }

    @Test
    public void logInUnsuccessful8(){
        openLoginForm();
        fillLoginForm("emmabr@gmail.com", "Е12345n$");
        submitLogin();
        logOut();

    }

}
