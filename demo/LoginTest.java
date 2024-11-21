package demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(dataProvider = "testdata")
 public void testLogin(String username,String password) {
		 boolean isLogin = login(username, password);

	        if (username.equals("Devyani") && password.equals("123")) {
	            Assert.assertTrue(isLogin, "Login should be successful for valid credentials.");
	            System.out.println("Login successful for user: " + username);
	        } else {
	            Assert.assertFalse(isLogin, "Login should fail for invalid credentials.");
	            System.out.println("Login failed for user: " + username);
	        }
	}
	
	 @DataProvider(name = "testdata")
	    public Object[][] loginDataProvider() {
	        return new Object[][]{
	            {"Devyani", "123"}, 
	            {"Devraj", "123"}, 
	            {"Devyani", "1234"}, 
	            {"Devraj", "1234"} 
	        };
	    }
	 
	 private boolean login(String username, String password) {
	        // Assume "validUser" and "validPass" are correct credentials
	        return "Devyani".equals(username) && "123".equals(password);
	    }
}
