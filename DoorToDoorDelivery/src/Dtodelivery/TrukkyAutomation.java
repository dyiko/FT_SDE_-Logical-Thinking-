package Dtodelivery;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
public class TrukkyAutomation {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\selenium webdriver\\\\chromeDriver\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.trukky.com/door-to-door-goods-delivery");
        assert driver.getTitle().contains("Door to Door Goods Delivery");
        
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        
        WebElement pickupCityInput = driver.findElement(By.id("pickup_city"));
        pickupCityInput.sendKeys("Hyderabad");
        
        Select pickupCityDropdown = new Select(driver.findElement(By.id("pickup_city_dropdown")));
        pickupCityDropdown.selectByVisibleText("Hyderabad, Telangana, India");
        WebElement dropCityInput = driver.findElement(By.id("drop_city"));
        dropCityInput.sendKeys("Delhi");
        
        Select dropCityDropdown = new Select(driver.findElement(By.id("drop_city_dropdown")));
        dropCityDropdown.selectByVisibleText("New Delhi, Delhi, India");
        
        WebElement checkPriceButton = driver.findElement(By.id("check_price_button"));
        checkPriceButton.click();
        
        WebElement servicesTypePersonal = driver.findElement(By.id("services_type_personal"));
        servicesTypePersonal.click();
        
        WebElement loadServiceInput = driver.findElement(By.id("load_service"));
        loadServiceInput.sendKeys("Few packed items (1 - 5)");
        WebElement addMaterialButton = driver.findElement(By.id("add_material_button"));
        addMaterialButton.click();
        
        Select chooseMaterialDropdown = new Select(driver.findElement(By.id("choose_material")));
        chooseMaterialDropdown.selectByVisibleText("Window AC");
        WebElement noItemsInput = driver.findElement(By.id("no_items"));
        noItemsInput.sendKeys("2");
        WebElement forwardButton = driver.findElement(By.id("forward_button"));
        forwardButton.click();
        
        WebElement nextButton = driver.findElement(By.id("next_button"));
        nextButton.click();        
        WebElement choosePickupDateInput = driver.findElement(By.id("choose_pickup_date"));
        choosePickupDateInput.sendKeys("28 April");
        nextButton.click();
        
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your@email.com");
        WebElement numberInput = driver.findElement(By.id("number"));
        numberInput.sendKeys("1234567890");
        WebElement companyNameInput = driver.findElement(By.id("company_name"));
        companyNameInput.sendKeys("Your Company");
        WebElement getPriceButton = driver.findElement(By.id("get_price_button"));
        getPriceButton.click();   
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();

	}

}
