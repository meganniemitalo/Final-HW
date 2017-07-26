import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Assertions
 *
 * Megan Niemitalo
 */
public class testCheckbook
{
    private double balance;

    /**
     * Constructor for objects of class testCheckbook
     */
    public testCheckbook()
    {
        balance = 5000.00;
    }

    @Test
    public void testBalance(){
       Checkbook testCheckbook = new Checkbook();
       Check testCheck = new Check(500.0);    
       testCheckbook.addCheck(testCheck);
       double balance = testCheckbook.getBalance();
       assertEquals(4500.0, balance, 0.0); 
    }
    
    @Test
    public void testAmount() {
        Check testCheck = new Check(200.0);
        assertEquals(200.0, testCheck.getAmount(), 0.0);
    }
    
    @Test
    public void testForIncorrectAmount() {
        Check testCheck = new Check(200.0);
        assertFalse(testCheck.getAmount() != 200.0);
    }
    
    @Test
    public void testCheckListSize() {
        Checkbook testCheckbook = new Checkbook();
        Check testCheck = new Check(10.0);
        testCheckbook.addCheck(testCheck);
        Check testCheck2 = new Check(20.0);
        testCheckbook.addCheck(testCheck);
        assertEquals(testCheckbook.getNumberOfCheckList(), 2, 0);
        
    }
}
