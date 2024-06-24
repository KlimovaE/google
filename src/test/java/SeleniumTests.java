import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTests {
    @Test
    public void googleSearch() {
        // Укажите путь к драйверу Chrome
       //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Инициализация объекта WebDriver
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = new EdgeDriver();

        // Открытие веб-страницы
        driver.get("https://www.google.com");

        // Поиск элемента по его id
        WebElement elementById = driver.findElement(By.name("q"));

        // Теперь вы можете выполнять различные действия с найденным элементом
        // Например, вы можете ввести текст в поле ввода:
        elementById.sendKeys("Selenium");
        elementById.submit();

        // Закрытие браузера
        driver.quit();
    }
}