package Test;

import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Login_testcases;
import java.io.IOException;
import java.time.Duration;

public class TestPage {
    static WebDriver driver;
    Login_testcases loginpage;


    @BeforeTest
    public void setup() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window();
        loginpage =new Login_testcases(driver);
        driver.get("https://www.saucedemo.com/");
        driver.manage().deleteAllCookies();

    }

    @DataProvider(name ="getData")

    public Object[][] Login() throws IOException {
        ExcelRead ER= new ExcelRead();
        return ER.getExcelData();
    }

    @Test(priority = 0, enabled = true, dataProvider ="getData")
    @Description("invalid email with valid password ")
    public void CompleteTheProcess(String Username, String Password) throws InterruptedException {
        loginpage = new Login_testcases(driver);
        loginpage.enterusername(Username);
        loginpage.enterPass(Password);
        loginpage.clickonLogin();
        loginpage.Printmsg();

    }
    @Test(priority = 1, enabled = true)
    @Description("Buy process")
    public void Process() throws InterruptedException {
        loginpage = new Login_testcases(driver);
        loginpage.enterusername("standard_user");
        loginpage.enterPass("secret_sauce");
        loginpage.clickonLogin();
        loginpage.clickon1item();
        loginpage.clickon2item();
        loginpage.clickoncart();
        Assert.assertEquals("Your Cart","Your Cart");
        loginpage.checkout();
        Assert.assertEquals("Checkout: Your Information","Checkout: Your Information");
        loginpage.enterFN("Mustafa");
        loginpage.enterLN("Awaad");
        loginpage.enterzip("12345");
        loginpage.ctnbtn();
        Assert.assertEquals("Checkout: Overview","Checkout: Overview");
        loginpage.item();
        String url= driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.saucedemo.com/checkout-step-two.html");
        loginpage.finish();
        Assert.assertEquals("Thank you for your order!","Thank you for your order!");
        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!","Your order has been dispatched, and will arrive just as fast as the pony can get there!");


    }

    @AfterTest
        public void close () throws InterruptedException {
            driver.quit();
        }
    }

