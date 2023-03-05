package step_definitions;

import org.junit.After;
import org.junit.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void init(){
        System.out.println("This is running before every step definitions");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
