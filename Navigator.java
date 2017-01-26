package serenity.wiki.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class Navigator {
	
	@Steps
	Tester user;
	
	@Test
public void Navigating() throws InterruptedException{
		
		
		user.browsing();  // Navigating Wikipedia homepage
		
		user.click();  // Select English and redirect to the page
		
		user.display();  // Check if current page is in English or not
		
		user.Quit();  // Quit Browser
	
}
}
