package Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ElementHelper {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(WebDriver driver){
        this.driver=driver;
        this.actions=new Actions(driver);

    }
    private WebElement presenceElement(By key) {
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key){

        WebElement element= presenceElement(key);
        return element;

    }
    public void click(By key){
        findElement(key).click();

    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }



}
