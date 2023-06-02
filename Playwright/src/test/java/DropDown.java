
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DropDown {

	
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(
				new BrowserType.LaunchOptions()
				.setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://testsheepnz.github.io/BasicCalculator.html");
		
		page.locator("#number1Field").type("2041");
		page.locator("#number2Field").type("687");
		page.selectOption("#selectOperationDropdown", "2");
		page.locator("#calculateButton").click();
		
		Locator pageLocString = page.locator("#numberAnswerField");
		String textContent = pageLocString.textContent();
		System.out.println(textContent);
		
		Thread.sleep(3000);
		
		playwright.close();
	}
	
}
