package browserContext;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextEx {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.chromium();
		LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);
		Browser launch = browserType.launch(headless);
		BrowserContext newContext = launch.newContext();
		Page newPage = newContext.newPage();
		
		newPage.navigate("https://www.linkedin.com/feed/");
		
		
		Page newPage2 = newContext.newPage();
		newPage2.bringToFront();
		newPage2.navigate("https://in.indeed.com/?from=gnav-homepage");
		newPage2.locator("//div[@class='yosegi-EmbeddedLabelInput yosegi-InlineWhatWhere-what']//div//div[@class='icl-TextInput']").type("Test Engineer");
		newPage2.locator("button[type='submit']").click();
		
		BrowserContext newContext2 = launch.newContext();
		Page page = newContext2.newPage();
		page.navigate("https://www.naukri.com/mnjuser/homepage");
		
		
		playwright.close();
		
	}

}
