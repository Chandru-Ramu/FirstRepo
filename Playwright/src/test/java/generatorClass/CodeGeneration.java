package generatorClass;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class CodeGeneration {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://www.google.com/?gws_rd=ssl");
      page.frameLocator("iframe[name=\"callout\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("No thanks")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("messi images");
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).press("Enter");
      page.locator(".xte2qe > div > div > div:nth-child(7) > div").first().click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("messi images ");
     
    }
  }
}