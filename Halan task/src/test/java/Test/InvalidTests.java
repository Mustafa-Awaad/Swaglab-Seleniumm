//package Test;
//
//import jdk.jfr.Description;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import pages.Login_testcases;
//
//public class InvalidTests extends TestPage{
//    //public WebDriver driver;
//    Login_testcases loginpage= new Login_testcases(driver);
//
//    @Test(priority = 4, dataProvider ="getData")
//    @Parameters("browser")
//    @Description("invalid email with invalid password ")
//    public void CompleteTheProcess(String Username, String Password) throws InterruptedException {
//        Thread.sleep(1000);
//        loginpage.enterusername(Username);
//        loginpage.enterPass(Password);
//        loginpage.clickonLogin();
//        loginpage.Printmsg();
//
//    }
//}
