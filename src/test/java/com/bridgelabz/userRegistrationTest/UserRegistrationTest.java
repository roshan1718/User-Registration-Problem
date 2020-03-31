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

}