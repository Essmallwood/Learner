package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        // Given
        String expectedName = "Emoni";
        long expectedID = 19292918;

        // When
        Person person = new Person (19292918, "Emoni");

        // Then
        String actualName = person.getName();
        long actualID= person.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedID, actualID,0.1);
    }

@Test
    public void testSetName(){
        // Given
        String expectedName = "Jimmy";


        // When
        Person person = new Person( 0, " "); //
        person.setName("Jimmy");

        // Then
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);


    }

}
