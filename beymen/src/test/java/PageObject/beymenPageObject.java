package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Util.ElementHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class beymenPageObject {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By selectProducts= By.className("m-productImageList__item");
    static By enterText = By.className("vue-simple-suggest o-header__search--wrapper");
    static By searchbutton = By.className("o-header__search--btn bmi-search");
    static By addedCart= By.id("addBasket");
    static By selectBodySize= By.className("m-variation__item -active");
    static By goToCart=By.linkText("#icon-cart-active-fw");
    static By increase= By.id("quantitySelect0-key-0");
    static By deleteCart=By.id("removeCartItemBtn0-key-0");




    public beymenPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, "10");
        this.elementHelper = new ElementHelper(driver);
        return;


    }

    public static void HomePage() {
    }

    public static void EnterText() {
        String text="şort";
        WebElement element_enter = driver.findElement(By.className("vue-simple-suggest o-header__search--wrapper"));
        element_enter.findElement(By.className("")).sendKeys("gömlek");

        element_enter.sendKeys(Keys.RETURN);
    }

    public static void DeleteText() {
        WebElement query = driver.findElement(By.id(enterText));
        query.sendKeys("şort");
        query.clear();
    }

    public static void ClickButton() {
        elementHelper.click(searchbutton);
    }

    public static void SelectProducts() {
        elementHelper.findElement(selectProducts);
    }

    public static void AddedCart() {
        elementHelper.findElement(addedCart).click();
    }

    public static void Increase() {
        driver.findElement(increase).click();
    }

    public static void DeleteCart() {
        driver.findElement(By.id("removeCartItemBtn0-key-0")).click();
    }

    public static void CheckEmptyCart() {
    }
}