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

    //Tests that balance equation correctly subtracts check amount from current balance.
    @Test
    public void testBalance(){
       Checkbook testCheckbook = new Checkbook();
       Check testCheck = new Check(500.0);    
       testCheckbook.addCheck(testCheck);
       double balance = testCheckbook.getBalance();
       assertEquals(4500.0, balance, 0.0); 
    }
    
    //Tests that get.Amount method is correctly passing check amount value
    @Test
    public void testAmount() {
        Check testCheck = new Check(200.0);
        assertEquals(200.0, testCheck.getAmount(), 0.0);
    }
    
    //Tests that get.Amount is correctly passing check amount value with a negative test
    @Test
    public void testForIncorrectAmount() {
        Check testCheck = new Check(200.0);
        assertFalse(testCheck.getAmount() != 200.0);
    }
    
    //Tests that testCheckListSize method correctly accounts for the number of check objects
    //in checkbook
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
