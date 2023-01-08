package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        // 2- Add Element Butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        Thread.sleep(2000);

        // 3- Delete BUTONUN GORUNUR OLDUGUNU TEST EDİN
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete Button Test Passed");
        }
        else
            System.out.println("Delete Button Test Failed");

        // 4- Delete tusuna basin
        deleteButton.click();
        Thread.sleep(2000);

        // 5- Add/Remove Elements yazisinin gorunur oldugunu test edin
        WebElement addRemoveText = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveText.isDisplayed()){
            System.out.println("Add/Remove Elements Test Passed");
        }
        else
            System.out.println("Add/Remove Elements Test Failed");



        Thread.sleep(3000);
        driver.close();







































    }
}
