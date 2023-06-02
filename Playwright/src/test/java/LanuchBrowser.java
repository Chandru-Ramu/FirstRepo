import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LanuchBrowser {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions()
				.setHeadless(false)
				.setChannel("chrome")
				);
		Page page = browser.newPage();
		page.navigate("https://www.google.co.in/");
		System.out.println(page.title());
		System.out.println(page.url());
		
		page.close();
		browser.close();
		playwright.close();
		
	}

}
