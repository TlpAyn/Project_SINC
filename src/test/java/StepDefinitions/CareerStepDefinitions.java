package StepDefinitions;

import Pages.Objects;
import Utilities.GWD;
import Utilities.GWD2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.Set;

public class CareerStepDefinitions {

    Objects obj = new Objects();
    Actions actions= new Actions(GWD.getDriver());

    Robot robot = new Robot();

//    public static void clickIfExists(WebDriver driver, By locator) {
//        WebElement element = driver.findElement(locator);
//        if (element != null && element.isDisplayed()) {
//            element.click();
//            System.out.println("Öğeye tıklandı.");
//        } else {
//            System.out.println("Öğe bulunamadı veya görüntülenmiyor.");
//        }
//    }

//    public void cookies(){
//        if(obj.akzeptieren2 != null ){
//            obj.clickFunction(obj.akzeptieren2);
//        }
//
//    }

    Alert alert = GWD.getDriver().switchTo().alert();

    public CareerStepDefinitions() throws AWTException {
    }

    @Given("Go to teh SINC Homepage")
    public void goToTehSINCHomepage() throws InterruptedException {

        GWD2.getDriver().get("https://www.sinc.de/");

        JavascriptExecutor js = (JavascriptExecutor) GWD2.getDriver();
        js.executeScript("arguments[0].click();",obj.akzeptieren2);





    }

    @When("Click to Burger Menü")
    public void clickToBurgerMenü() {
    }

    @And("Go to the Karriere")
    public void goToTheKarriere() {
    }

    @And("Click to Offenen Stellen")
    public void clickToOffenenStellen() {
    }

    @And("Click to Remote")
    public void clickToRemote() {
    }

    @And("Click to QA Test Analiyst")
    public void clickToQATestAnaliyst() {
    }

    @Then("approve job posting")
    public void approveJobPosting() {
    }


}
