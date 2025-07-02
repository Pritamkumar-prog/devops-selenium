package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Basicvalidation extends Basetest {

    @Test
    public void WelcomeMessageValidation() {
        String expectedResult = "Facebook helps you connect and share with the people in your life.";

        // ✅ Using driver from Basetest
        String actualResult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();

        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);

        if (actualResult.equals(expectedResult)) {
            System.out.println("✔ Validation Passed");
        } else {
            System.out.println("✘ Validation Failed");
        }
    }

//🔽 Email Placeholder Validation using XPath
@Test
public void emailPlaceholderValidation() {
String expectedPlaceholder = "Email address or phone number";

//Using the 'id' attribute is simple and reliable
String actualPlaceholder = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");

System.out.println("Expected Placeholder: " + expectedPlaceholder);
System.out.println("Actual Placeholder: " + actualPlaceholder);

if (actualPlaceholder.equals(expectedPlaceholder)) {
 System.out.println("✔ Email Placeholder Validation Passed");
} else {
 System.out.println("✘ Email Placeholder Validation Failed");
}
}

//✅ 3. Validate Password Placeholder
@Test
public void passPlaceholderValidation() {
String expectedPasswordPlaceholder = "Password";
String actualPasswordPlaceholder = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("placeholder");

System.out.println("Expected Password Placeholder: " + expectedPasswordPlaceholder);
System.out.println("Actual Password Placeholder: " + actualPasswordPlaceholder);

if (actualPasswordPlaceholder.equals(expectedPasswordPlaceholder)) {
    System.out.println("✔ Password Placeholder Validation Passed");
} else {
    System.out.println("✘ Password Placeholder Validation Failed");
}
}
}