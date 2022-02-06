package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    bioekdswebtest bioekdswebtest;
    By cartCountLocator = By.id("nav-cart-count");
    By cartContainerLocator = By.id("nav-cart-count-container");
    By acceptCookiesLocator = By.id("sp-cc-accept");

    public HomePage(WebDriver driver) {
        super(driver);
        bioekdswebtest = new bioekdswebtest(driver);
    }

    public bioekdswebtest bioekdswebtest(){
        return this.bioekdswebtest;
    }

    public boolean isProductCountUp() {

        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
