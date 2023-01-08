package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://amazon.com/ adresine gidin
        driver.get("https://amazon.com/");

        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        // 4- Sayfayi "refresh" yapin
        driver.navigate().refresh();

        // 5- Sayfa basliginin "Spend Less" ifadesi icerdegini test edin
        String expectedMetin = "Sayfa Basligi";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedMetin)){
            System.out.println("Sayfa Basligi PASSED");
        }
        else
            System.out.println("Sayfa Basligi FAILED");

        // 6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();

        // 7-Birtday butonuna basin
        driver.findElement(By.linkText("Birthday")).click();

        // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();

        // 9- Gift card details'den 25 $'i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        // 10- Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcret = driver.findElement(By.xpath("(//span[text()='$25.00'])[1]"));
        String expectedUcret = "$25.00";
        String actualUcret = urunUcret.getText();

        if (expectedUcret.equals(actualUcret)){
            System.out.println("Gift Card Ucret Testi PASSED");
        }
        else
            System.out.println("Gift Card Ucret Testi FAILED");


        // 11- Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();




















    }
}
