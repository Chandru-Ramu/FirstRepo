import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class InputTexts {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions()
				.setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.lambdatest.com/selenium-playground/simple-form-demo");
		
		page.locator("//input[@id='user-message']").type("Chandrasekar");
		page.locator("//input[@id=\"user-message\"]/following::button[@id]").click();
		String textContent = page.textContent("#message");
		System.out.println(textContent);
		
		page.locator("//input[@id='sum1']").fill("2458");
		page.locator("//input[@id='sum2']").type("325644");
		page.locator("//button[normalize-space()='Get values']").click();
		Locator pageLocator = page.locator("#addmessage");
		String textString = pageLocator.textContent();
		System.out.println(textString);
//		page.close();
//		browser.close();
//		playwright.close();

	}

}
