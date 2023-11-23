package website10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.artstation.com");
        String webName = driver.getTitle();
        System.out.println(webName);
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        //driver.quit();
    }
}
