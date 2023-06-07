package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewEmployeeList";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("53426A")) {
                System.out.println("The id is on row number " + (i + 1));
            }
        }
    }
}