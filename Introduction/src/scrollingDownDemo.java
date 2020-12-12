import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingDownDemo extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open views
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		// we will be using Android Api 
		
		
		driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		//syntax = tag("value")
		//Scrolling will be done via calling android code in findElementsByAndroidUIAutomator
		Thread.sleep(2000);
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
	}

}
