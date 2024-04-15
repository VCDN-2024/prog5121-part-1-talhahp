
package prog.assignment.part.pkg1.st10456550;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

        
   /**
 *
 * @author Talhah
 */
public class LoginManagerTest {
    
    public LoginManagerTest() {
    }

    
    LoginManager loginManager = new LoginManager();
    @Test
    public void testCheckUserNameCorrectlyFormatted() {
        boolean actual = loginManager.checkUserName("Tp_1");
        assertTrue(actual);
    }

    @Test
    public void testCheckUserNameIncorrectlyFormatted() {
        boolean actual = loginManager.checkUserName("moh");
        assertFalse(actual);
    }
    
    @Test
    public void testCheckPasswordCorrectlyFormatted() {
        boolean actual = loginManager.checkPasswordComplexity("Qwerty123@");
        assertTrue(actual);
    }
   
    @Test
    public void testCheckPasswordIncorrectlyFormatted() {
        boolean actual = loginManager.checkPasswordComplexity("Password");
        assertFalse(actual);
    }

    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testLoginUser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }
    
}
