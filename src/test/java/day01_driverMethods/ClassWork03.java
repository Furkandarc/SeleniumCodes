package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //-Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //-Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi = " + driver.getTitle());

        //-Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title test PASSED");
        }else System.out.println("Title test FAILED");

        //-Sayfa adresini(url) yazdirin
        System.out.println("Sayfa URL'si = " + driver.getCurrentUrl());

        //-Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("Url testi PASSED");
        }else
            System.out.println("Url testi FAILED");

        //-Sayfa handle degerini yazdirin
        System.out.println("Window handle degeri = " + driver.getWindowHandle());

        //-Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Test PASSED");
        }else System.out.println("Source Code Test FAILED");

        //-Sayfayi kapatin.
        driver.close(); // Sayfayi kapatmak icin close() methodunu kullaniriz.
    }
}
