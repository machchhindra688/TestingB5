package com.vamstar.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Care\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://prefeitura.pbh.gov.br/saude/licitacao/pregao-eletronico-151-2020");
		//PUBLICATION DATE: 10/30/2020:
			
			WebElement wb=driver.findElement(By.cssSelector("#block-views-block-view-noticia-pbh-block-5 > div > div > div > div > div > div.views-field.views-field-nothing > span > span:nth-child(1)"));
		//	OBJECT:
			
			WebElement wb1=driver.findElement(By.cssSelector("#block-views-block-view-noticia-pbh-block-5 > div > div > div > div > div > div.views-field.views-field-nothing > span > span:nth-child(4)"));
		//	BIDDING DATE:	
			
			WebElement wb2=driver.findElement(By.cssSelector("#block-views-block-view-noticia-pbh-block-5 > div > div > div > div > div > div.views-field.views-field-nothing > span > span:nth-child(19)"));
		//	SITUATION:
			
			WebElement wb3=driver.findElement(By.cssSelector("#block-views-block-view-noticia-pbh-block-5 > div > div > div > div > div > div.views-field.views-field-nothing > span > span:nth-child(16) > span > font > font"));
		//	MODALITY:
			
			WebElement wb4=driver.findElement(By.cssSelector("#block-views-block-view-noticia-pbh-block-5 > div > div > div > div > div > div.views-field.views-field-nothing > span > span:nth-child(13) > span > font > font"));
			
			driver.close();
			
			
		}

	
}
