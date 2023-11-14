package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class Com_Utimateqa {
    static String baseUrl = "https://courses.ultimateqa.com/";
    static String homePage = "https://courses.ultimateqa.com/collections";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        // Step 1: Setup browser

        if (browser.trim().equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.trim().equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.trim().equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser");
        }

        // Step 2 : Open the URL into Browser
        driver.get(baseUrl);

        //  Step 3 : Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Step 4 : print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 5 : Print the page source.
        System.out.println(driver.getPageSource());

        // Step 6 : Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();

        // Step 7 : Print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 8 : Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("prgajera123@gmail.com");

        // Step 9 : Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("Priya123");

        // Step 10: Click on Sign in Button.
        WebElement loginButton = driver.findElement(By.cssSelector(".button"));
        loginButton.click();

        //  Step 11 : Navigate to baseUrl
        driver.navigate().to(baseUrl);

        // Step 12 : Navigate forward to Homepage.
        driver.navigate().to(homePage);

        // Step 13 : Navigate back to baseUrl.
        driver.navigate().back();

        // Step 14 :  Refresh the page.
        driver.navigate().refresh();

        //  Step 15 : Close the browser.
        driver.quit();

    }

}
