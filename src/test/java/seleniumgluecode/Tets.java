package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tets {

    private ChromeDriver driver;

    @Given("^se ingresa a la sección de empleos$")
    public void se_ingresa_a_la_sección_de_empleos() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.choucairtesting.com/empleos-testing/");


    }

    @When("^cuando doy click en ¿qué es ser choucair\\?$")
    public void cuando_doy_click_en_qué_es_ser_choucair() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement element = driver.findElement(By.partialLinkText("ser Choucair"));
        element.click();

    }

    @Then("^Te redirige a la seccion de ser choucair$")
    public void te_redirige_a_la_seccion_de_ser_choucair() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement elemento = driver.findElement(By.cssSelector("div#content div.elementor-element.elementor" +
                "-element-988dd1f.elementor-widget.elementor-widget-text-editor > div > div > p"));
        Assert.assertEquals(" Significa estar comprometido con la transformación digital de las " +
                "industrias y con probar que juntos podemos construir un mundo mejor a través de la " +
                "tecnología, la sostenibilidad y la innovación, cumpliendo a la vez nuestros propósitos " +
                "personales.",elemento.getText());
        driver.quit();

    }


    @When("cuando doy click en prepararse para aplicar")
    public void cuando_doy_click_en_prepararse_para_aplicar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement element = driver.findElement(By.partialLinkText("para aplicar"));
        element.click();

    }

    @Then("^Te redirige a la sección de prepararse para aplicar$")
    public void te_redirige_a_la_seccion_para_aplicar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement elemento = driver.findElement(By.cssSelector("div#content section:nth-child(10) > div " +
                "> div > div > div > div > div.elementor-element.elementor-widget.elementor-widget-text-editor > div > div > p"));
        Assert.assertEquals("Si quieres hacer parte de esta compañía extraordinaria te recomendamos " +
                "explorar los siguientes enlaces.",elemento.getText());
        driver.quit();

    }


    @When("cuando doy clic al botón ir al portal empleos")
    public void cuando_doy_click_en_portal_de_empleos() throws Throwable {
        // Write code here that turns the phrase above into concrete action
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,400)");
        WebElement element = driver.findElement(By.cssSelector("div#content section:nth-child(3) > div > div " +
                "> div:nth-child(2) > div > div > div > div > div > a"));
        element.click();

    }

    @Then("^Se visualiza el texto correspondiente en  el mensaje dialogo$")
    public void se_visualiza_el_mensaje() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement elemento = driver.findElement(By.cssSelector("div.elementor-element.elementor" +
                "-widget.elementor-widget-text-editor.animated.fadeIn > div > div > p:nth-child(1)"));
        Assert.assertEquals("Serás dirigido a nuestro portal Magneto para conocer nuestras ofertas, " +
                "registrar tu hoja de vida y conocer el estado de tu postulación,",elemento.getText());
        driver.quit();

    }



}
