package shiftApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NewTest {
	AndroidDriver<WebElement> driver;
  @Test
  public void test() throws InterruptedException {
	  Set<String> s = driver.getContextHandles();
	  System.out.println(s);
	  driver.context("WEBVIEW_com.xjshift.android");
//	  driver.findElement(By.className("android.widget.Button")).click();
	  driver.findElement(By.cssSelector("div.go-to-hall")).click();
	  System.out.println(driver.getPageSource());
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.56.101:5555");
	  capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/git/shiftApp/app/xjshift.apk");
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	  capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
	  
	  capabilities.setCapability("appPackge","com.xjshift.android" );
	  capabilities.setCapability("appActivity", "com.kaiwangpu.ttz.act.MainActivity");
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @AfterClass
  public void afterClass() {
  }

}
