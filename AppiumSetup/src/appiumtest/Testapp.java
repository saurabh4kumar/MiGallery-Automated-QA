package appiumtest;

//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumDriver;


import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testapp {

//Application Launch
	AndroidDriver driver;
	//WebDriver driver;
	@BeforeSuite 

    public	void	testApp()	throws	MalformedURLException,InterruptedException
    {
         
        //set up appium
       
        File app = new File("F:\\EXE Files\\Mobile Testing\\Apk\\MiGallery_1.0.17.715_production.apk");
       
                
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","A05510");
        capabilities.setCapability("platformVersion", "5.0.2");
        capabilities.setCapability("app",app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.mimedia.gallery");
        capabilities.setCapability("appActivity", "com.mimedia.gallery.GalleryStartupActivity_");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
      
        
        
        
    }
@AfterSuite
public void quit()
	 {
		  driver.quit();//Quit driver at end. 
	 } 
	 
	//######## Check Login functionality/ throws InterruptedException###########################
@Test
public void A_login() {//navigation();sreens();more();sharing(); throws InterruptedException
		  
		 		 
				  driver.findElement(By.xpath("//android.widget.Button[@text='MiMedia Login']")).click();
					  
				  //driver.findElement(By.name("Email address")).sendKeys("saurav04kumar@gmail.com");
				  //.sendKeyEvent(47);driver.sendKeyEvent(29);driver.sendKeyEvent(49);driver.sendKeyEvent(46);driver.sendKeyEvent(29);driver.sendKeyEvent(50);driver.sendKeyEvent(7);driver.sendKeyEvent(11);driver.sendKeyEvent(39);driver.sendKeyEvent(49);driver.sendKeyEvent(41);driver.sendKeyEvent(29);driver.sendKeyEvent(46);driver.sendKeyEvent(77);driver.sendKeyEvent(35);driver.sendKeyEvent(41);driver.sendKeyEvent(29);driver.sendKeyEvent(37);driver.sendKeyEvent(40);driver.sendKeyEvent(56);driver.sendKeyEvent(31);driver.sendKeyEvent(43);driver.sendKeyEvent(41);
				  //driver.findElement(By.id("com.mimedia.gallery:id/login_password")).click();
				  //driver.sendKeyEvent(41);driver.sendKeyEvent(29);driver.sendKeyEvent(42);driver.sendKeyEvent(38);driver.sendKeyEvent(49);driver.sendKeyEvent(38);driver.sendKeyEvent(36);driver.sendKeyEvent(29);driver.sendKeyEvent(77);driver.sendKeyEvent(8);
				  driver.findElement(By.name("LOG IN")).click();
				  driver.findElement(By.name("COOL!")).click();
				  driver.findElement(By.name("OK!")).click();
				  
				  				 
	      }
				  
//######## Opening of the screen after successful login/Gallery tab is dispalyed as Home screen ###########################
//########Navigation/Switching to Side bar/Closing side bar###########################
	 /*@Test
	  public void swiperight() throws InterruptedException{
				  //driver.findElement(By.id("com.mimedia.gallery:id/gallery_activity_action_bar_nav_icon")).click();
		TouchAction tActionn=new TouchAction(driver);
		tActionn.press(2,0).moveTo(699,0).release().perform(); 

				  //driver.swipe(13, 640, 699, 640, 3000);
                 //TouchAction tActionn=new TouchAction(driver);
		         //tActionn.press(716,0).moveTo(64,0).release().perform();				  
				  
				   //driver.swipe(startX, startY, endX, endY, duration);
				  //driver.swipe(SwipeElementDirection.LEFT 2000);
		//driver.swipe(164, generateY(drive.scrollTo(contactName).getLocation()), 990, generateY(drive.scrollTo(contactName).getLocation()),3000);
				   
				  	 }*/
	
	  
	

//########Navigation/Switching to menu/Camera/Test case NO: ################

@Test 
public void B_navigation(){ 
		 		          	          
				  driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
				  driver.findElement(By.name("Photos")).click();
				  driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
				  driver.findElement(By.name("Videos")).click();
				  driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
				  driver.findElement(By.name("Gallery")).click();
				  driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
				  driver.findElement(By.name("Favorites")).click();
				  
				  driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
				  driver.findElement(By.name("Settings")).click();
				  
				  driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
				  driver.findElement(By.name("Gallery")).click();
				  
				  				  			  
	            }
	//####UI & Layout/Check all sreens/Camera/Upload status indicator/Test case NO: ####
@Test
public void C_sreens(){
			 
					  
					  driver.findElement(By.name("Collections")).click();
					  driver.findElement(By.name("COOL!")).click();
					  driver.findElement(By.name("MiDrive")).click();
					  driver.findElement(By.name("COOL!")).click();
					  driver.findElement(By.name("Collections")).click();
					  //driver.findElement(By.name("Gallery")).click();
					  //driver.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();
					  //List<WebElement> editBox=driver.findElements(By.className("android.widget.TextView")); 
				      //editBox.get(4).click();
					  							  
					  
		            }
@Test
public void D_camera(){
	 	 
	     //driver.findElement(By.name("Gallery")).click();
	      
	    
		 driver.findElementByAccessibilityId("Camera").click();
		 WebDriver augmentedDriver = new Augmenter().augment(driver);        //Landscape orientation
		 ((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);  //Landscape orientation
		
		  driver.findElement(By.id("com.android.camera2:id/second_shutter_button")).click();
		  	 
		  driver.findElement(By.id("com.android.camera2:id/third_shutter_button")).click();
		  driver.findElement(By.id("com.android.camera2:id/third_shutter_button")).click(); 
			 
		  
	     WebDriver augmentedDriver1 = new Augmenter().augment(driver);        //Landscape orientation
	     ((Rotatable)augmentedDriver1).rotate(ScreenOrientation.PORTRAIT);
			   {
			     driver.findElement(By.id("com.android.camera2:id/second_shutter_button")).click();
			   }
	     driver.findElement(By.id("com.android.camera2:id/third_shutter_button")).click(); 
	     driver.findElement(By.id("com.android.camera2:id/third_shutter_button")).click(); 
		 driver.navigate().back();
			 		 		 		  
	            }
@Test
public void E_collectionscreen() {
	
	     
		 driver.findElement(By.name("Collections")).click();
		 WebElement plus = driver.findElement(By.id("com.mimedia.gallery:id/merged_collection_list_create"));
		 plus.click();
		 driver.findElement(By.name("New collection")).sendKeys("Simone");
	 	 driver.findElement(By.name("Create")).click();
	 	 driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
	 	 List<WebElement> editBox=driver.findElements(By.className("android.view.View")); //select collections folder
	 	 editBox.get(6).click();
	 	 driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
	 	 	 		 			  
	            }
@Test
public void F_more() {
	
	     //List<WebElement> editBox=driver.findElements(By.className("android.widget.TextView")); 
 	     //editBox.get(3).click();
	    
	     //driver.findElement(By.name("Collections")).click();
	   
	    // driver.findElement(By.name("COOL!")).click();
	     
	     
	      List<WebElement> collection1=driver.findElements(By.className("android.view.View")); //Taping on Collection folder
	      collection1.get(5).click();
	        
	     TouchAction tActionn=new TouchAction(driver); //Tap function
         tActionn.tap(150,301).release().perform(); 
	     	     
	 	 //driver.findElement(By.xpath("//*[@class='android.view.View' and @index='5']")).click();
	 	
		 driver.findElementByAccessibilityId("More").click();
		 driver.findElementByName("Info").click();
		 driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
		 
		 driver.findElementByAccessibilityId("More").click();
		 driver.findElementByName("Add to Collection").click();
		 driver.findElement(By.id("com.mimedia.gallery:id/merged_collection_cover")).click();
		 driver.findElementByName("Add to Collection").click();
		
		 
		 driver.findElementByAccessibilityId("More").click();
		 
		 driver.findElementByName("Add to MiDrive").click();
		 List<WebElement> midrive=driver.findElements(By.className("android.widget.FrameLayout")); 
		 midrive.get(0).click();
		 //driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and @index='0']")).click();
		 driver.findElementByName("Add to MiDrive").click();
		 
		 driver.findElementByAccessibilityId("More").click();
		 driver.findElementByName("Delete").click();
		 driver.findElementByName("Cancel").click();
		 
		 driver.findElementByAccessibilityId("More").click();
		 driver.findElementByName("Delete").click();
		 driver.findElementByName("Delete").click();
		 driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
		 
		 		 
		 TouchAction tActionn1=new TouchAction(driver); //Tap function
	     tActionn1.tap(150,301).release().perform();
		 WebDriver augmentedDriver = new Augmenter().augment(driver);        //Landscape orientation
		 ((Rotatable)augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);  //Landscape orientation
		 WebDriver augmentedDriver1 = new Augmenter().augment(driver);        //Landscape orientation
		 ((Rotatable)augmentedDriver1).rotate(ScreenOrientation.PORTRAIT);
		 for(int i=0;i<=0;i++){
		 driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click(); //Back key twice
		 }
	 }

@Test
public void G_sharing(){
	     //driver.findElement(By.name("Gallery")).click();
	     //List<WebElement> editBox=driver.findElements(By.className("android.widget.TextView")); 
         //editBox.get(3).click();
         List<WebElement> collection1=driver.findElements(By.className("android.view.View")); //Taping on Collection folder
	     collection1.get(5).click();
		 driver.findElement(By.xpath("//*[@class='android.view.View' and @index='2']")).click();
		 
	        
	     //TouchAction tActionn=new TouchAction(driver); //Tap function
        //tActionn.tap(150,301).release().perform(); 
		 driver.findElementByAccessibilityId("Share").click();		
	     driver.navigate().back();
	     driver.findElement(By.id("com.mimedia.gallery:id/gallery_action_bar_nav_icon")).click();
	 			
	            }
@Test
public void H_swipe() {
		 driver.findElement(By.xpath("//*[@class='android.view.View' and @index='0']")).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    HashMap<String, Double> swipeObject = new HashMap<String, Double>();
	    swipeObject.put("startX", 2.00);
	    swipeObject.put("startY", 272.00);
	    swipeObject.put("endX", 670.00);
	    swipeObject.put("endY", 272.00);
	    swipeObject.put("duration", 2.0);
	    js.executeScript("mobile: swipe", swipeObject);
	
	 }
	 
		//####Gallery screen-Photo viewer/Tap on images/Info/Add to collection/Add to Midrive/Delete ####

	//########sharing/Test case NO: ###########################




		 

}				

				  			
				  			   		 
				            

