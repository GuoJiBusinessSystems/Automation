package stepDefs;

import io.cucumber.java.Status;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GuoJiBusinessSystemsSteps {
    WebDriver driver;



    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("I open GuoJiBusinessSystems home page")
    public void i_open_orange_hrm_home_page() {
        driver.get("http://dose-frontend.s3-website.us-east-2.amazonaws.com/");
    }
    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        driver.findElement(By.xpath("//*[@class='label']")).click();
    }

    @Then("Close browser")
    public void close_browser() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.quit();
    }


}
