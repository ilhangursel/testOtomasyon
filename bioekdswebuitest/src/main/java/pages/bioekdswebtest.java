package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bioekdswebtest extends BasePage{

    By searchBoxLocator = By.id("login");
    By searchBoxLocatorSifre = By.id("password");

    By submitButtonLocator =  By.xpath("//button[@class='btn btn-info fadeIn fourth']");

    By submitButtonLocatorGuven = By.id("details-button");
    By submitButtonLocatorGuven1 = By.id("proceed-link");

    By submitButtonLocatorGuven2 = By.className("card-body");
    By submitButtonLocatorGuven3 = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/ul/li[2]/a");
    By submitButtonLocatorGuven4 = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/div[1]/div[1]/button\n");
    By submitButtonLocatoryazdirma1 = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div/input");
    By submitButtonLocatoryazdirma2 = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/textarea");
    By submitButtonLocatortikla = By.xpath("//*[@id=\"vueapp\"]/div[2]/div/div[1]/div[2]/button[2]");
    public bioekdswebtest(WebDriver driver) {

        super(driver);
    }

    /*public void search(String yazdırma1,String yazdırma2) {
        click(submitButtonLocatorGuven);
        click(submitButtonLocatorGuven1);

        type(submitButtonLocatoryazdirma1 , yazdırma1);
        type(submitButtonLocatoryazdirma2, yazdırma2);
        click(submitButtonLocatortikla);
*/


    public void login(String userName,String password) {
        type(searchBoxLocator , userName);
        type(searchBoxLocatorSifre, password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(submitButtonLocator);
    }


    public void startLoginPage() {
        click(submitButtonLocatorGuven);
        click(submitButtonLocatorGuven1);

    }
    public void birinciIslem() {
        click(submitButtonLocatorGuven2);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(submitButtonLocatorGuven3);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(submitButtonLocatorGuven4);
    }
        public void cihazEkleme(String yazi1, String test12) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            type(submitButtonLocatoryazdirma1, yazi1);
            type(submitButtonLocatoryazdirma2, test12);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            click(submitButtonLocatortikla);
        }
    }

