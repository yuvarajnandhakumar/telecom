package org.stepdefinition;

import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import org.commonaction.CommonActions;
import org.junit.Assert;
import org.locators.telecompage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import cucumber.deps.difflib.InsertDelta;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;


public class teleconsteps extends CommonActions{

	telecompage tp = new telecompage();

	@Given("Launch chrome")
	public void launch_chrome() throws InterruptedException {


		submit(tp.getAddcustomer());
		waittime();
		waittime();
		ff(tp.getFframe());
		submit(tp.getClosebtn());
		waittime();
		driver.switchTo().defaultContent();
		waittime();
	}



	/*@Then("user enter firstname")
	public void user_enter_firstname(DataTable onelist) throws InterruptedException {
		List<String> oneD = onelist.asList();
		waittime();
		driver.findElement(By.id("fname")).sendKeys(oneD.get(2));
		waittime();

	}

	@Then("user enter email")
	public void user_enter_email(DataTable TwoDlist) throws InterruptedException {
		List<List<String>> twodimlist = TwoDlist.asLists();
		driver.findElement(By.id("email")).sendKeys(twodimlist.get(1).get(0));
		waittime();

	}*/


	@Then("user enter firstname")
	public void user_enter_firstname(DataTable onemap) throws InterruptedException {

		Map<String, String> asMap = onemap.asMap(String.class, String.class);
		instertext(tp.getFnme(), asMap.get("fname"));

		waittime();
		instertext(tp.getLnme(), asMap.get("lname"));
		waittime();

	}

	@Then("user enter email")
	public void user_enter_email(DataTable twodmap) throws InterruptedException {


		List<Map<String, String>> twodMaps = twodmap.asMaps(String.class, String.class);
		driver.findElement(By.id("email")).sendKeys(twodMaps.get(1).get("email"));
		waittime();
		driver.findElement(By.id("lname")).sendKeys(twodMaps.get(1).get("lname"));
		waittime();
	}

	@Then("user enter firstname {string}")
	public void user_enter_firstname(String fname) throws InterruptedException {
		driver.findElement(By.id("fname")).sendKeys(fname);
		waittime();

	}

	@Then("user enter lastname {string},{string}")
	public void user_enter_lastname(String lname, String email) throws InterruptedException {


		WebElement webelementname = driver.findElement(By.id("lname"));

		webelementname.sendKeys(lname);
		instertext(webelementname, lname);

		waittime();

		instertext(tp.getMail(), email);
		waittime();
	}




	@And("close chrome")
	public void close_chrome() throws InterruptedException {
		waittime();
		driver.close();
	}
}
