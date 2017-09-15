package shiftApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class blibli {

	public static void main(String[] args) throws MalformedURLException {
		  AppiumDriver driver;
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.56.101:5555");
		  capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/Documents/App/bili.apk");
		  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		  capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		  
		  capabilities.setCapability("appPackage","tv.danmaku.bili" );
		  capabilities.setCapability("appActivity", "tv.danmaku.bili.MainActivity");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		  driver.closeApp();
	}

}
