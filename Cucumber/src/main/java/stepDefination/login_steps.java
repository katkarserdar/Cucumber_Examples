package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {


    @Given("^Amazon sitesine git$")
    public void amazon_sitesine_git() throws Throwable {
        System.out.println("Siteye gidildi.");
    }

    @Given("^login butonuna tikla$")
    public void login_butonuna_tikla() throws Throwable {
        System.out.println("Login butonuna tıklandı.");
    }

    @Given("^isim gir$")
    public void isim_gir() throws Throwable {
        System.out.println("İsim girildi.");
    }

    @Given("^sifre gir$")
    public void sifre_gir() throws Throwable {
        System.out.println("Sifre girildi.");
    }

    @When("^submit butonuna tikladigimda$")
    public void submit_butonuna_tikladigimda() throws Throwable {
        System.out.println("Submit butonuna tıklandı.");
    }

    @Then("^success mesajıni verify et$")
    public void success_mesajıni_verify_et() throws Throwable {
        System.out.println("Login işlemi başarı ile tamamlandı.");
    }



}