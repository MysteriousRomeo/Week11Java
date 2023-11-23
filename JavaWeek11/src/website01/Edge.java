package website01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        String webName = driver.getTitle();
        System.out.println(webName);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement button = driver.findElement(By.id("W0wltc"));
        button.click();

        //driver.quit();
    }
}
