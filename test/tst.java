package calcl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import cc;
public class tst {
cc hh=new cc();
	@Test 
    void testadd_twoposnum()
    {
        int act=hh.addition(4, 9);
        assertTrue(act==13);
        
    }
    
    @Test
     void testadd_twonegnum()
     {
     int act = hh.addition(-1, -3);
             assertTrue(act==-4);
     }
     @Test
     void testadd_1neg1posnum()
     {
     int act = hh.addition(-1, 9);
             assertTrue(act==8);
     }
}
