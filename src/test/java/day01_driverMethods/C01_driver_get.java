package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);

        driver.close();

        /*
            Selenium jar dosyalarının ve chtomedriverini
            manuel olarak sisteme tanitmis olduk.

            ChromeDriver constructor kullanarak bir obje olusurduk
             bu objeyi kullanmasak bile
             bu satirdan dolayi bos bir browser acilir.

             driver.get(url) driver'i yazdigimiz url'e goturur
             url yazarken www yazmasak calisir
             fakat https:// yazmassak method calismaz
         */




































    }
}
