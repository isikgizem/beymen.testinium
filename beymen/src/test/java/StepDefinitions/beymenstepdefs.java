package StepDefinitions;
import PageObject.beymenPageObject;
import Util.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
public class beymenstepdefs {

WebDriver driver= DriverFactory.getDriver();
beymenPageObject beymenPageObject= new beymenPageObject(driver);
    @Given("I open the {string} website")
    public void ıOpenTheWebsite(String arg0) {
        PageObject.beymenPageObject.HomePage();

    }

    @And("Enter the word {string} in the search box")
    public void enterTheWordInTheSearchBox(String arg0) {
        PageObject.beymenPageObject.EnterText();
    }

    @And("The word “shorts” entered in the search box is deleted")
    public void theWordShortsEnteredInTheSearchBoxIsDeleted() {
        PageObject.beymenPageObject.DeleteText();
    }

    @When("I click {string} button")
    public void ıClickButton(String arg0) {
        PageObject.beymenPageObject.ClickButton();
    }

    @And("A random product is selected from the products")
    public void aRandomProductIsSelectedFromTheProducts() {
        PageObject.beymenPageObject.SelectProducts();

    }

    @And("The selected product is added to the cart.")
    public void theSelectedProductIsAddedToTheCart() {
        PageObject.beymenPageObject.AddedCart();

    }

    @And("I increase the number of products and make two")
    public void ıIncreaseTheNumberOfProductsAndMakeTwo() {
        PageObject.beymenPageObject.Increase();

    }

    @And("I delete the items in the cart")
    public void ıDeleteTheItemsInTheCart() {
        PageObject.beymenPageObject.DeleteCart();
    }

    @Then("I check that the basket is empty")
    public void ıCheckThatTheBasketIsEmpty() {
        PageObject.beymenPageObject.CheckEmptyCart();
    }
}
