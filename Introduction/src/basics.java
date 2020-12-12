import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		
		
		//ways to identify elements in appium 
		//xpath  //tagName[@attribute='value']
		//your className is your tag name
		// for demo.apk --> preferences link --> class name = android.widget.TextView
		String wifiSettings= "12345";
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElementByClassName("android.widget.EditText").sendKeys(wifiSettings);
		driver.findElementsByClassName("android.widget.Button").get(1).click();

		
	}

}
