package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Bos bir browser actik
        driver.get("https://www.amazon.com");  // Ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayda başlığı = " + driver.getTitle());
        System.out.println("Sayfa Url'si = " + driver.getCurrentUrl());
        //System.out.println("Kaynak kodlarini verir(HTML) = " + driver.getPageSource());
        System.out.println(" Sayfa veya tab'lerin handle degerleri = " + driver.getWindowHandle()); // Bize o window'a ait hash degerini verir.
                                                                                                    // Biz bu hash degerlerini bir string'e atayip
                                                                                                    // pencereler arasi gecis yapabiliriz.

    }
}
