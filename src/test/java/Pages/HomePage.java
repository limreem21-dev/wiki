package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import Helper.configjava;

public class HomePage {
	@FindBy(id="brxe-c1f04a")
	WebElement nosProduits;
	
	@FindBy(xpath="/html/body/header/section[3]/div/nav/ul/li[1]/ul/li/div/span")
	List <WebElement> menus;
	
	
	@FindBy(xpath="/html/body/header/section[3]/div/nav/ul/li[1]/ul/li[2]/ul/li[1]/div/div/a")
	List<WebElement> submenus;
	
public HomePage() {
	PageFactory.initElements(configjava.driver, this);

}

public void mouseHoverAndClick(String menuTitle, String submenuTitle) throws InterruptedException {
	Thread.sleep(3000);
	configjava.attente(10);
	System.out.println(nosProduits.getText());
	Actions actions = new Actions(configjava.driver);
	actions.moveToElement(nosProduits,10,10).perform();
	
	 try {
		 
		 for (WebElement menu:menus){
	      if(menu.getText().contains(menuTitle)) {
	    	  configjava.attente(5);
	    	  actions.moveToElement(menu).perform();
	    	  
	    for(WebElement submenu:submenus) {
	    	if(submenu.getText().contains(submenuTitle)) {
	    		submenu.click();
	    	    }
	           }
	          }
		 }
	 }
	    
	      
       catch (Exception e) {
		// TODO: handle exception
	}
	    }

}
