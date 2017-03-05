import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ashraf {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashif\\workspace\\drivers\\chromedriver.exe");
		WebDriver chdriver = new ChromeDriver();
		chdriver.get("http://www.facebook.com");
	}

}
