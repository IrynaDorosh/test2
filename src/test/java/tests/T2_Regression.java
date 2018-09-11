package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T2_Regression extends BaseTest {

    String globalLogin;
    String  globalPass;

    @BeforeTest
    @Parameters({"pLoginQA"})
    public void setParameters(String pLoginQA){
        this.globalLogin = pLoginQA;
//        this.globalPass = pPassQA;
    }


@Test
    public void t21(){
        System.out.println("RESULT: t21, data  from parameters: "+ globalLogin   );
    }

@Test (enabled = false)
    public void t22(){
        System.out.println("RESULT: t22");
    }
}
