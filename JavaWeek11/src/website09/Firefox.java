package website09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com");
        String webName =  driver.getTitle();
        System.out.println(webName);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        //driver.quit();
    }
}
