package com.bridgelabz.userRegistrationTest;
import com.bridgelabz.userRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {

    UserRegistration test=new UserRegistration();
    @Test
    public void givenUserFirstName_validThenTrue(){
        boolean firstName=test.checkName("SampleFirstName");
        Assert.assertTrue(firstName);
    }
    @Test
    public void givenUserFirstName_invalidThenFalse(){
        boolean firstName=test.checkName("samplefirstname");
        Assert.assertFalse(firstName);
    }
    @Test
    public void userLastName_ValidThenTrue() {
        boolean lastName = test.checkName("SampleLastName");
        Assert.assertTrue(lastName);
    }

    @Test
    public void userLastName_InvalidThenFalse() {
        boolean lastName = test.checkName("samplelastname");
        Assert.assertFalse(lastName);
    }

}