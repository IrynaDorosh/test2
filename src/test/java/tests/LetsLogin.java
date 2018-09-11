package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LetsLogin extends BaseTest {

    ExcelUtils excelUtils = new ExcelUtils();

    @Test
    public void test() throws Exception {

        String qUsername = ExcelUtils.getCellData(1, 1);
        String qPass = ExcelUtils.getCellData(1, 2);
        System.out.println("Data from excell: " + qUsername +  qPass);



    }




}
