package Parmeterization;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WifiSettings extends BaseSettings {
	
	//Connect the Test Annotation with DataProvider
	//BAsed on number of  columns defined in DataProvider, pass the number of parameters in test annotation method
	

	@Test(dataProvider = "Data")
	public  void WifiSettings(String dName, String udid, String wifiName) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = WifiSettings.InstallInvokeApk(dName, udid);

		// Implicit wait - dynamic wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// FIND THE ELEMENT AND PERFORM THE ACTION OF CLICK - PREFERENCE
		driver.findElement(By.xpath("//android.widget.TextView[@index = '8']")).click();

		// Static wait
		Thread.sleep(10000L);

		// Click on the PREFERENCE DEPENDENCIES
		driver.findElement(By.xpath("//android.widget.TextView[@text = '3. Preference dependencies']")).click();

		// To find how many elements in the WIFI page has the index value as 0
		List<AndroidElement> allElementsIndexValue = driver.findElements(By.xpath("//android.widget.CheckBox[@index = '0']"));
		int a = allElementsIndexValue.size();
		System.out.println("Number of elements with the same index number is " + a);

		// Check the checbox for WIFI with ID locating strategy as it is unique
		driver.findElementById("android:id/checkbox").click();

		// Find how many elements have the same class value = android.widget.ListView
		List<AndroidElement> allElementsClassValue = driver.findElements(By.xpath("//android.widget.TextView[@class = 'android.widget.TextView']"));
		int b = allElementsClassValue.size();
		System.out.println("Number of elements with the same class number is " + b);

		// Click on the WIFI SETTINGS
		driver.findElements(By.xpath("//android.widget.TextView[@class = 'android.widget.TextView']")).get(3).click();

		Thread.sleep(5000l);

		// Typing on the edix box
		driver.findElement(By.xpath("//android.widget.EditText[@class = 'android.widget.EditText']")).setValue(wifiName);

		// Click on OK button
		driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();

		// Navigate two time
		driver.navigate().back();
		driver.navigate().back();

		// Close the application
		driver.closeApp();

	}
	
	@DataProvider
	public Object[][] Data(){
		
		//Decide how may to run Test annotation method - 2 times; we need to define two rows
		//Decided to have three points in the script to be parameterised - device name, udid, wifi name - have three columns as the size
		Object[][] obj = new Object[2][3];
		
		//Data for the first Run - Emulator
		obj[0][0] = "Pixel2"; //Device Name
		obj[0][1] = "emulator-5554"; //UDID
		obj[0][2] = "Kaushik"; //WIFI NAME
		
		//Data for the Second Run - Real Time Device
		obj[1][0] = "Galaxy A7"; //Device Name
		obj[1][1] = "320012b24ac8c5fd"; //UDID
		obj[1][2] = "Sam"; //WIFI NAME
		
		
		return obj;
	}
	

}
