package com.thetestingacademy.asserts;

import io.restassured.response.Response;

import java.util.Optional;

//import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class AssertActions {

    // Common Assertions - Which can be reused

    public void verifyResponseBody(String actual, String expected, String description){
        assertEquals(actual,expected,description);
    }

    public void verifyResponseBody(int actual, int expected, String description){
        assertEquals(actual, expected, description);
    }

    public void verifyStatusCode(Response response, Integer expected){
        assertEquals(response.getStatusCode(),expected);
    }

    public void verifyStringKey(String keyExpect,String KeyActual){
        // AssertJ
        assertThat(keyExpect).isNotNull();
        assertThat(keyExpect).isNotNull().isNotBlank();
        assertThat(keyExpect).isEqualTo(KeyActual);

    }

}
