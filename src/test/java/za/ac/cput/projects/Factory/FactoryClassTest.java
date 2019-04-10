package za.ac.cput.projects.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.Chaprone;

import static org.junit.Assert.*;

public class FactoryClassTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createChaprone() {
        Chaprone c = FactoryClass.createChaprone("Gary","082654");
        Assert.assertEquals(c.getChapName(),c.getChapName());
    }
}