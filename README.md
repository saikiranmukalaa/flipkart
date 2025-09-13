This repository contains an automation testing framework built with Selenium WebDriver, Java and TestNG.  
It is designed for end-to-end testing of web applications 
Features
- Built with Java + Selenium WebDriver
- Supports TestNG for test execution and reporting
- Page Object Model (POM) for better code maintainability
- browser testing (Chrome)
- Integration with Maven for build and dependency management
- Screenshots captured on test failures
  
Project Structure
AutomationPayments/
│── src/main/java/  base class, POM class
│── src/test/java/ # Test scripts
│── src/test/resources/ # Test data
│── reports/ # Test reports
│── pom.xml # Maven dependencies
│── README.md # Project documentation

Prerequisites
Before running the tests, ensure you have the following installed:
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)  
- [Git](https://github.com)  
- IDE (Eclipse)  

Installation & Setup
1. Clone the repository:
   git clone https://github.com/saikiranmukala/flipkart.git
   
2.Install dependencies:
Copy and Paste the dependencies in pom.xml file
<dependencies>
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.34.0</version>
</dependency>

<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.10.2</version>
</dependency>

<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi-ooxml</artifactId>
<version>5.4.0</version>
</dependency>
</dependencies>

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.5.3</version>

<configuration>
<suiteXmlFiles>
<suiteXmlFile>testng.xml</suiteXmlFile>
</suiteXmlFiles>
</configuration>

</plugin>
</plugins>
</build>



