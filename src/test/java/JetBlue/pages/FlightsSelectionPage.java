package JetBlue.pages;

import JetBlue.utils.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FlightsSelectionPage {

    static WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),15);


    //scenario 3


    @FindBy(id = "jb-date-picker-input-id-2" )
    private WebElement returnDateInput;

    @FindBy(xpath = "(//button[@type = 'button'])[61]")
     private WebElement returnDateNew;

    @FindBy(xpath = "(//span[ @class='ng-star-inserted'])[1]")
    private WebElement searchBtnInput;

    @FindBy(xpath = "//div[@class='colPrice']/label")
    private List<WebElement> lowestPriceInput;


 public FlightsSelectionPage(){
     PageFactory.initElements(DriverFactory.getDriver(),this);
 }



    public void setReturnValue(){returnDateInput.click();
    wait.until(ExpectedConditions.visibilityOf(returnDateNew));
    returnDateNew.click();
 }

    public void setSearchFlightsNew(){searchBtnInput.click();
 }

   public void flightSelectionTitle(){
       String flightTitle = DriverFactory.getDriver().getTitle();
       String expectedTitle = "Flight Selection";

       Assert.assertEquals("The title is not Flight Selection",flightTitle,expectedTitle);
 }

   public void lowestPrice(){

//        for(int i =0; i < lowestPriceInput.size(); i ++){
//
//            if (lowestPriceInput.get(i) > lowestPriceInput.get(i +1))
//        }
   }




}
