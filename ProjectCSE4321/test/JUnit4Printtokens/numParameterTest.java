package JUnit4Printtokens;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
//import java.util.Collection;
import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class numParameterTest 
{
    private String Strnum;
    
    public numParameterTest(String input) 
    {
        this.Strnum = input;
    }
    
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]
        {
            {"0"},
            {"02"},
            {"987"},
            {"4567"},
        }
        );
    }
    
    //double check this test
     @Test
    public void numParameterTestActual() 
    {
        boolean numbool = Printtokens.is_num_constant(Strnum);
        assertTrue(numbool);
    }
    
    
}
