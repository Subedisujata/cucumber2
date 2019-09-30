package page;

import java.awt.Color;
import java.util.StringTokenizer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NssPage {

	WebDriver driver;

	public void Nsspage(WebDriver driver) {
		this.driver = driver;
	}

	// element library
	@FindBy(how = How.XPATH, using = "//button[@onclick=\'myFunctionSky()\']")
	WebElement bluebackgroundbutton;

	public void clickButton() {
		bluebackgroundbutton.click();
	}

	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement colorofbackground;

	public String getcolor() {

		String bgColor = colorofbackground.getCssValue("background-color");
		String colorintostring = bgColor.substring(4);
		String color = colorintostring.replace('(', ' ');
		StringTokenizer st = new StringTokenizer(color);
		int r = Integer.parseInt(st.nextToken(",").trim());
		int g = Integer.parseInt(st.nextToken(",").trim());
		int b = Integer.parseInt(st.nextToken(",").trim());
		Color c = new Color(r, g, b);
		String Actualhexcolorcode = "#" + Integer.toHexString(c.getRGB()).substring(2);
		System.out.println(Actualhexcolorcode);
		System.out.println(bgColor);
		return Actualhexcolorcode;

	}
}
	// @FindBy(how= How.XPATH, using("//div[@class='controls']/descendant::a"))
	// WebElement tootlebutton;

