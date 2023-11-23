package website06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/");
        String webName =  driver.getTitle();
        System.out.println(webName);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        //driver.quit();

    }

}
