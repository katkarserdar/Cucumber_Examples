package stepDefination;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Drivers;

import java.util.concurrent.TimeUnit;

public class contactUs_steps {

    private WebDriver driver;

    contactUs_Page contactUs_page = new contactUs_Page();
    @Given("navigate to Website")
    public void navigate_to_website() {
        driver= Drivers.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Web sitesine gidildi.");
    }

    @Given("click on contact us button")
    public void click_on_contact_us_button() {

        contactUs_page.clickContactUsButton();
        System.out.println("Contact us butonuna tıklandı.");
    }

    @Given("select Subject Heading")
    public void select_subject_heading() {

        contactUs_page.selectFromDropdown();
        System.out.println("Konu başlığı seçildi.");
    }

    @Given("type Email")
    public void type_email() {

        contactUs_page.typeEmail();
        System.out.println("E-posta yazıldı.");
    }

    @Given("type Order reference {string}")
    public void type_order_reference(String string) {

        contactUs_page.typeOrderReference();
        System.out.println("Sipariş referansı yazıldı.");
    }

    @Given("type a message")
    public void type_a_message() {

        contactUs_page.typeMessage();
        System.out.println("Mesaj yazıldı.");
    }

    @When("click on send button")
    public void click_on_send_button() {

        contactUs_page.clickSendButton();
        System.out.println("Gönder butonuna tıklandı.");
    }

    @Then("verify success message")
    public void verify_success_message() {
        contactUs_page.assertMyMessage();
        System.out.println("işlem başarı ile gerçekleştirildi.");
    }


}