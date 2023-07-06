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
import org.testng.Assert;

import java.awt.*;
import java.util.Set;

public class CareerStepDefinitions {

    Objects obj = new Objects();



    @Given("Go to the SINC Homepage")
    public void goToTheSINCHomepage() {
        GWD2.getDriver().get("https://www.sinc.de");
    }

    @When("Click to Hamburger Menu")
    public void clickToHamburgerMenu() {
        obj.getWebElement("HamburgerMenu").click();


    }

    @And("Click to Karriere")
    public void clickToKarriere() {
        obj.getWebElement("karriere").click();
    }

    @And("Go to the Offenen Stellen")
    public void goToTheOffenenStellen() {
        obj.clickFunction(obj.offenenStellen);
    }

    @And("Click to Remote")
    public void clickToRemote() {
        obj.clickFunction(obj.remote);
    }

    @And("Go to the QA Analyst")
    public void goToTheQAAnalyst() {
        obj.clickFunction(obj.qaTestAqnalyst);
    }

    @Then("Verify the name of QA Section")
    public void verifyTheNameOfQASection() {

      obj.verifyContainsTextFunction(obj.qaTextHead,"QA");
    }



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



    }


