package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sherl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.amazon.ca/";
		
		String expectedTitle = "amazon";
        String actualTitle = "";
		
        // launch chrome and direct it to the Base URL
        driver.get("https://www.amazon.ca");
		
	
        // get the actual value of the title
        actualTitle = driver.getTitle();
       

         WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
           searchBox.sendKeys("mobile");
  //searchBox.submit();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle === expectedTitle){
            System.out.println("Test case Passed!");
        } else {
            System.out.println("Test case Failed");
        }
       
        //close Fire fox
        driver.quit();
       
    }


	}


