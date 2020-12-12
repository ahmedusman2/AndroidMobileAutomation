import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//syntax = attribute("value") //you need to provide quotes with a slash in java
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//how validate if all the options are click able 
		// you cannot do this by getting attributes. you will have to access "property"
		//syntax for getting a property = 		driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		int clickable_Elements = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println(clickable_Elements);
		
		

	
	}

}
