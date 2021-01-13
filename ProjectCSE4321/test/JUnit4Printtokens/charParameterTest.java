package JUnit4Printtokens;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
//import java.util.Collection;
import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)

public class charParameterTest 
{
    private String stringChar;
    
    public charParameterTest(String input) 
    {
        this.stringChar = input;
    }
    
    @Parameterized.Parameters(name = "{index}: {0}")
    //Collection 
    public static Iterable<Object[]> data() 
     {
        return Arrays.asList(new Object[][]
        {
            {"#e"},
            {"#g"},
            {"#z"},
            {"#j"},
        }
        );
    }
     
    @Test
    public void charParameterTestActual() 
    {
        boolean CharConstantbool = Printtokens.is_char_constant(stringChar);
        assertTrue(CharConstantbool);
    } 
    
}
