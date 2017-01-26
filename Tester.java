package serenity.wiki.features.search;


import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester  {


  WebDriver driver;
  
	@Step ("Wikipedia homepage")
	public void browsing() {
		
	//[The following line of code is needed if the browser does not open the wikipedia link. Gecko driver needs to be installed and path should be modified]
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\aimam\\Desktop\\geckodriver.exe");  
		driver=new FirefoxDriver();
	    driver.get("http://www.wikipedia.org");
	}
	
	@Step ("Select English")
	public void click() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get(driver.findElement(By.id("js-link-box-en")).getAttribute("href"));	
	}

	@Step ("Verify the page is in English or not")
	public void display()  {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String text1 = "Welcome to";
		driver.findElement(By.xpath("//div[contains(text(), '" + text1 + "')]//following-sibling::a[@title='Wikipedia']"));
	}

	
	public void Quit()  {
		
		try {
			Thread.sleep(1000);
			driver.quit();
		    Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");  // This line is needed for Firfox version 48+;
			Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");   // This line is needed for Firfox version 48+;
	} catch (Exception e) {}
 	
	}
}
