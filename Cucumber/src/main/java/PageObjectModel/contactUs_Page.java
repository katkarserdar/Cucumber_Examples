package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;

import java.sql.Driver;

public class contactUs_Page extends AbstractClass{

    WebDriver driver;

    public contactUs_Page(){

        driver = Drivers.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private  WebElement contactUsButton;

    public void clickContactUsButton(){

        clickFunction(contactUsButton);
    }

    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;

    public  void selectFromDropdown(){

        selectElementFromDropdown(subjectHeadingDropdown, "Webmaster");
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailTextArea;

    public void typeEmail(){

        sendKeysFunction(emailTextArea,"serdarkatkar123@gmail.com");
    }

    @FindBy(xpath = "//input[@name='id_order']")
    private WebElement order;

    public void typeOrderReference(){

        sendKeysFunction(order,"order123");
    }

    @FindBy(name = "message")
    private WebElement messageBox;

    public void typeMessage(){

        sendKeysFunction(messageBox, "Ürün kırık geldi...................");
    }

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickSendButton(){

        clickFunction(sendButton);
    }

    @FindBy(css = "p.alert.alert-success")
    private WebElement successMessage;

    public void assertMyMessage(){

        Assertion(successMessage,"Your message has been successfully sent to our team.");
    }


}
