package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_testcases extends BasePage {
    public Login_testcases(WebDriver driver) {
        super(driver);
    }

    By username = By.id("user-name");
    //WebElement email= driver.findElement(Email);
    By Password = By.id("password");
    WebElement pass;
    By Lognbtn = By.id("login-button");
    By errormessage = By.xpath("//div[@class = 'error-message-container error']");
    By Addtocart1= By.id("add-to-cart-sauce-labs-fleece-jacket");
    By Addtocart2= By.id("add-to-cart-sauce-labs-backpack");
    By Cartbtn= By.cssSelector(".shopping_cart_link");
    By yourcartsyntax =By.cssSelector("title");
    By checkoutbtn =By.id("checkout");
    By Fname= By.id("first-name");
    By Lname =By.id("last-name");
    By zip = By.id("postal-code");
    By Contbtn = By.cssSelector("#continue");
    By itemprice = By.xpath("//div[@class='summary_subtotal_label']");

    By fnshbtn= By.id("finish");


    public void enterusername(String text) throws InterruptedException {
        driver.findElement(this.username).clear();
        driver.findElement(this.username).sendKeys(text);

    }
    public void enterPass (String Text) throws InterruptedException {
        driver.findElement(this.Password).clear();
        driver.findElement(this.Password).sendKeys(Text);

    }
    public void clickonLogin() throws InterruptedException {
       click(Lognbtn);
    }
    public void Printmsg()  {
       WebElement errmsg = driver.findElement(errormessage);
       errmsg.getText();
       System.out.println(errmsg.getText());
    }
    public void clickon1item() throws InterruptedException {
        click(Addtocart1);
    }
    public void clickon2item() throws InterruptedException {
        click(Addtocart2);
        click(Cartbtn);
    }
    public void clickoncart() throws InterruptedException {
        click(Cartbtn);
    }
    public void checkout() throws InterruptedException {
        click(checkoutbtn);
    }
    public void enterFN (String text)  {
        driver.findElement(this.Fname).sendKeys(text);
    }
    public void enterLN (String text)  {
        driver.findElement(this.Lname).sendKeys(text);
    }
    public void enterzip (String text)  {
        driver.findElement(this.zip).sendKeys(text);
    }
    public void ctnbtn() throws InterruptedException {
        click(Contbtn);
    }
    public void item(){
        WebElement Itemprice= driver.findElement(itemprice);
        Itemprice.getText();
        System.out.println(Itemprice.getText());
    }
    public void finish() throws InterruptedException{
        click(fnshbtn);
    }

}
