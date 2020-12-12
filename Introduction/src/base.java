import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub

		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();

		if (device.equals("real")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Devices");
		} else if (device.equals("emulator")){
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AhmedEmulator");
			
		}

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;

		// Connecting real Android device with you PC
		// 1. Download "apk info app" for windows and install on your machine. this will
		// help you to know build information of your apk file. most importantly...
		// activity details
		// 2. Enable developer mode on your phone my tapping 7 times in the build
		// version.
		// 3. Once enabled turn ON USB debugging from developer options.
		// 4. Plug your device with USB to your computer. Once connected verify that
		// your device is connected through cmd command adb devices. Your phone MAC add
		// should be listed here. this will confirm the list of devices attached to your
		// computer.

	}

}
