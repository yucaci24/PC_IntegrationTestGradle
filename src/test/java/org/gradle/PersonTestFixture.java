package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;


public class PersonTestFixture {
    public static Person create(String name) {
        assertNotNull(name);
        return new Person(name);
    }

    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
