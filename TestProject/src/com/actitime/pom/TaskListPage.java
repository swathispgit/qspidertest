package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage {

	@FindBy(xpath="//a[text()='Open Tasks']")
	private WebElement clickTask;
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement creatTask;
	@FindBy(xpath="//option[text()='-- new customer --']")
	private WebElement customerselect;
	@FindBy(xpath="//input[@name='customerName']")
	private WebElement customername;
	@FindBy(xpath="//input[@name='projectName']")
	private WebElement Projectname;
	@FindBy(xpath="//input[@class='text staticPosition']")
	private WebElement taskname;
	@FindBy(xpath="//input[@name='task[0].budgetedTimeStr']")
	private WebElement estimate;
	////option[text()='Non-Billable']
	
	
	
	

}
