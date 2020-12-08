package keywords;

import com.google.inject.Inject;
import io.appium.java_client.AppiumDriver;

public class Device {

	@Inject
	AppiumDriver driver;

	@Inject
	public Device(AppiumDriver driver) {
		this.driver = driver;
	}

	public String getPlatformName() {
		return driver.getPlatformName();
	}

	public boolean isAndroid() {
		return driver.getCapabilities().getCapability("platformName")
				.toString().equalsIgnoreCase("android");
	}

	public boolean isIOS() {
		return driver.getCapabilities().getCapability("platformName")
				.toString().equalsIgnoreCase("iOS");
	}

}
