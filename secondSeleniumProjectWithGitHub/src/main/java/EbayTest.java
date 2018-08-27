import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayTest {
        ChromeDriver driver;

        @Test
        public void setUp(){

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            OpenEbay();
            NewUser();
            fillFirstNameForm();
            fillLastNameForm();
            fillEmail();
            fillPassword();
            clickOnButtonSubReg();

            driver.quit();



        }

    public void OpenEbay() {
        driver.get("https://www.ebay.com/");
    }

    public void NewUser() {
        driver.findElementByLinkText("register").click();
    }

    public void clickOnButtonSubReg() {
        driver.findElementById("ppaFormSbtBtn").click();
    }

    public void fillPassword() {
        driver.findElementById("PASSWORD").click();
        driver.findElementById("PASSWORD").clear();
        driver.findElementById("PASSWORD").sendKeys("telran55");
    }

    public void fillEmail() {
        driver.findElementById("email").click();
        driver.findElementById("email").clear();
        driver.findElementById("email").sendKeys("testMickaelQA+" + TimeUnit.SECONDS +"@hotmail.com");
    }

    public void fillLastNameForm() {
        driver.findElementByName("lastname").click();
        driver.findElementByName("lastname").clear();
        driver.findElementByName("lastname").sendKeys("Test");
    }

    public void fillFirstNameForm() {
        driver.findElementByName("firstname").click();
        driver.findElementByName("firstname").clear();
        driver.findElementByName("firstname").sendKeys("Mickael");
    }


}
