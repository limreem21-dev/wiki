package TestSuites;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import Helper.configjava;

public class HomePageTestSuite {
	
	@Test
	
	public void mouseHover() throws InterruptedException {
		configjava.driver = new ChromeDriver();
		
		configjava.maximizeWindow();
		
		String url = "https://wiki.tn/";
				
	    configjava.driver.get(url);
		
		HomePage page = new HomePage();
		page.mouseHoverAndClick("Informatique", "PC Portable");
		
	}
}