package JavaProgramForSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Afroz\\Desktop\\New folder\\Chrome Driver\\chromedriver_win32 (1).zip\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://selenium.dev");
	}

}
