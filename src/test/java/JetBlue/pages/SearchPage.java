package JetBlue.pages;

import JetBlue.utils.BrowserUtils;
import JetBlue.utils.ConfigurationReader;
import JetBlue.utils.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class SearchPage {

    static WebDriverWait wait= new WebDriverWait(DriverFactory.getDriver(),15);




    //@FindBy(xpath = "(//a[@role='button' and @class='call'])")
    //private WebElement cookiesAcception;

    @FindBy(xpath = "//input[@id = 'jb-autocomplete-1-search']")
    private WebElement searchinput;
    @FindBy(xpath = "//a[@class='call']" )
            private WebElement header;
    @FindBy(xpath = "//iframe[@id='defaultpreferencemanager']")
     private WebElement frame;

    @FindBy(xpath = "(//span[ @class='ng-star-inserted'])[1]")
    private WebElement searchBtnInput;
    //(//span[ @class='ng-star-inserted'])[1]

    @FindBy(xpath= "//span[. = 'Please enter a valid city.']")
     private WebElement invalidcitymessage;




    @FindBy(id = "jb-autocomplete-0-search")
    private WebElement toCityInput;

    @FindBy(id = "jb-date-picker-input-id-1")
    private WebElement departDateInput;

    @FindBy(xpath = "(//button[@type = 'button'])[33]")
    private WebElement departDateValue;

    @FindBy(id = "jb-date-picker-input-id-2" )
    private WebElement returnDateInput;

    @FindBy(xpath = "(//button[@type = 'button'])[30]")
    private WebElement returnDateInValidValue;

    public SearchPage(){

        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public void navigateSearchPage() {
        DriverFactory.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    //public void setCookies(){DriverFactory.getDriver().switchTo().frame(2);
//        Alert alert = DriverFactory.getDriver().switchTo().alert();
//        alert.accept();
     //   cookiesAcception.click();
    //}

  //public void setCookies(){

      //  Alert alert = DriverFactory.getDriver().switchTo().alert();
       // alert.accept();
 // }

    public void setCity(){searchinput.sendKeys("New York, NY (JFK)");}


    public void setSearchFlights()
    {wait.until(ExpectedConditions.visibilityOf(searchBtnInput));


        try{
            DriverFactory.getDriver().switchTo().frame(frame);
            header.click();
            Thread.sleep(5000);
            DriverFactory.getDriver().manage().deleteAllCookies();
            Thread.sleep(2000);
            DriverFactory.getDriver().manage().deleteAllCookies();
            Thread.sleep(2000);
            DriverFactory.getDriver().manage().deleteAllCookies();
            Thread.sleep(2000);
            DriverFactory.getDriver().manage().deleteAllCookies();
            Thread.sleep(2000);
            DriverFactory.getDriver().manage().deleteAllCookies();
            Thread.sleep(2000);
            DriverFactory.getDriver().manage().deleteAllCookies();
            Thread.sleep(2000);
            DriverFactory.getDriver().manage().deleteAllCookies();

            searchBtnInput.click();
        }catch (Exception e){

        }
    }

    public void setCityMessage(){
        System.out.println(invalidcitymessage.getText());
    }


    public void setToCity(){toCityInput.sendKeys("San Jose, CA (SJC)");}

   public void setDepartDate(){departDateInput.click();
   wait.until(ExpectedConditions.visibilityOf(departDateValue));
   departDateValue.click();}

   public void setReturnDate(){returnDateInput.click();returnDateInValidValue.click();}



}




