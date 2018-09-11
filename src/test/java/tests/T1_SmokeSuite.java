package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class T1_SmokeSuite extends BaseTest {
    String URL;
    { URL = System.getProperty("url");
    }

    @Test
        public void t11(){
        System.out.println("RESULT: t1-1, URL from prop: " + URL);
    }

    @Test
    public void t12(){
        System.out.println("RESULT: t1-2");
        Reporter.log("t1-1 test performed successfully");
    }

    @Test
    public void t13(){
        System.out.println("RESULT: t1-3");
        Reporter.log("t1-3 test performed successfully");
    }

    @Test
    public void a14(){
        System.out.println("RESULT: a1-4");
        Reporter.log("t1-4 test performed successfully");
    }



}
