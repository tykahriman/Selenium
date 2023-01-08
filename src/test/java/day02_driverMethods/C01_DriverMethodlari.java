package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // Biz browser'lari olusturdugumuz driver sayesinde otomate edebiliyoruz.
        // Bunun icin her testin basında driver objesi olusturacagiz
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        // acilan sayfanin basliginin amazon icerdigini test et

        String expectedKelime = "amazon";
        String actualResult = driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }
        else {
            System.out.println("Title amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        // gittigimiz sayfanın url'sinin https://www.amazon.com/ oldugunu tedst et

        String expectedURL = "https://www.amazon.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.contains(actualURL)){
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("URL istediginiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }



        Thread.sleep(5000);

        driver.close();




    }
}
