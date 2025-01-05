package com.thetestingacademy.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    // Create A Booking, Create a token
    // Verify that Get booking
    // Update the booking
    // Delete the booking

    @Test(groups = "qa",priority = 1)
    @Owner("Pramod")
    @Description("TC#INT1 - Step 1 . Verify that the Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 2)
    @Owner("Pramod")
    @Description("TC#INT1 - Step 2 . Verify Update Booking By ID")
    public void testVerifyBookingID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 3)
    @Owner("Pramod")
    @Description("TC#INT1 - Step 3 . Verify that the Booking By ID")
    public void testUpdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 2)
    @Owner("Pramod")
    @Description("TC#INT1 - Step 4 . Delete the Booking By ID")
    public void testDeleteBookingByID(){
        Assert.assertTrue(true);
    }






}
