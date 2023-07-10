package com.amol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA {

	public static void main(String[] args) {
		System.out.println("code from git repo");
		System.out.println("Hello world123");
		System.out.println("Hello world");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

	}

}
