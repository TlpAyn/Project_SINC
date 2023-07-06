package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Objects extends Parent {

    public Objects(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "div[role='button']")
    private WebElement hamburgerMenu;
    @FindBy(linkText = "Karriere")
    private WebElement karriere;
    @FindBy(linkText = "Akzeptieren")
    public WebElement akzeptieren;
    @FindBy(linkText = "Akzeptieren")
    public WebElement akzeptieren2;
     @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[1]/a[1]")
    public WebElement cookieeee;


    @FindBy(xpath = "(//span[text()='Zu den offenen Stellen'])[1]")
    public WebElement offenenStellen;
    @FindBy(xpath = "(//span[text()='Remote'])[1]")
    public WebElement remote;
    @FindBy(xpath = "(//h3[text()='QA Test Analyst (m/w/d)'])[1]")
    public WebElement qaTestAqnalyst;
    @FindBy(xpath = "//h1[text()='QA Test Analyst (m/w/d)']")
    public WebElement qaTextHead;








    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "hamburgerMenu" : return hamburgerMenu;
            case "karriere" : return karriere;

        }

        return null;
    }



    public void deleteItem(String searchText){
        //sendKeysFunction(searchInput,searchText);
        //clickFunction(searchButton);

       /* wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);  */

    }


}
