package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /**
            En temel haliyle otomasyon yapmak icin class'imiza otomasyon icin gerekli olan
         webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesi'nden System.setProperty()
         methodunun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalarız.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");





    }
}
