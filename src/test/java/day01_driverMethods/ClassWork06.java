package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClassWork06 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //Bu method sayfadaki her bir web elementi icin max bekleme suresi belirler.

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("facebook")){
            System.out.println("Title Test PASSED");
        }else System.out.println("Title Test FAILED");
        System.out.println("Title Test FAILED : " + actualTitle);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("facebook")){
            System.out.println("Url Test PASSED");
        }else System.out.println("Url Test FAILED : " + actualUrl);

        //https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.Walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle = driver.getTitle();
        String exceptedWalmartTitle = "Walmart.com";
        if(actualWalmartTitle.contains(exceptedWalmartTitle)){
            System.out.println("Title Test PASSED");
        }else System.out.println("Title Test FAILED");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser’i kapatin
        driver.close();
    }
}
