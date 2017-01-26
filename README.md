# WikipediaBrowsing
Web testing with Serenity-Maven
# Purpose
To test www.wikipedia.org and verify the language of the page
# Tools Used
i) JDK 1.8.0_65
ii) Eclipse Neon
iii) Maven 3.3.9
iv) JUnit 4.12
v) Serenity BDD 1.2.2
vi) Selenium 3.0.1
vii) Microsoft Windows 7
viii) Browser: Firefox (tested with version 46-51)
# How It Works
1. **Checklist**
Verify that Maven is already installed or install and configure Maven
2. **Initial Project Set up**
i) Go to the command prompt and type the directory you want to create the project
ii) Type the command: **mvn archetype:generate -Dfilter=serenity** 
iii) Select Serenity-junit archetype
iv) Select the latest version
v) Give a groupId and artifactId
These steps create a sample project in the directory you specified
3. **Importing Project**
i) Import the projects from the directory to Eclipse
ii) Import Navigator.java and Tester.java into the project
iii) Open pom.xml and update serenity.version to 1.2.2 (pom.xml file is uploaded as a reference)
iv) Add the following dependency to pom.xml (Please refer to the uploaded file) (Not needed if working in Firefox 47 and below)

/     <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-firefox-driver</artifactId>
        <version>3.0.1</version>
    </dependency>  
  
v) Import Selenium 3.0.1 (JAR files) into the project (Not needed if working in Firefox 47 and below)
vi) Run Navigation.java file
Test automation would start after this step
# Additional Comments
If the browser does not direct to the site, there might me a problem with the version of the Firefox along with the Selenium. This code is tested with the latest versions. For older versions, the user might have to download GeckoDriver and uncomment the instructed line in Tester.java and update the path. For Firefox verson 47+ there is a plugin-container issue which will be killed automatically with the commands provided in the code. Test report would be found in the target folder of the project.
# Future Improvements
More test cases could be added later on to verify the language of the page (ex: Presence of "In the news", "Did you know..." etc)
