//package Test;
//
//import jdk.jfr.Description;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.Login_testcases;
//
//public class Shopping extends TestPage{
//    Login_testcases loginpage= new Login_testcases(driver);
//
//    @Test(priority = 1)
//    @Description("Buy process")
//    public void Process() throws InterruptedException {
//        loginpage = new Login_testcases(driver);
//        loginpage.enterusername("standard_user");
//        loginpage.enterPass("secret_sauce");
//        loginpage.clickonLogin();
//        loginpage.clickon1item();
//        loginpage.clickon2item();
//        loginpage.clickoncart();
//        Assert.assertEquals("Your Cart","Your Cart");
//        loginpage.checkout();
//        Assert.assertEquals("Checkout: Your Information","Checkout: Your Information");
//        loginpage.enterFN("Mustafa");
//        loginpage.enterLN("Awaad");
//        loginpage.enterzip("12345");
//        loginpage.ctnbtn();
//        Assert.assertEquals("Checkout: Overview","Checkout: Overview");
//        loginpage.item();
//        String url= driver.getCurrentUrl();
//        Assert.assertEquals(url,"https://www.saucedemo.com/checkout-step-two.html");
//        loginpage.finish();
//        Assert.assertEquals("Thank you for your order!","Thank you for your order!");
//        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!","Your order has been dispatched, and will arrive just as fast as the pony can get there!");
//
//
//    }
//}
