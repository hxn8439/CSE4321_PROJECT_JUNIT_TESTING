package JUnit4Printtokens;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
//import java.util.Collection;
import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class identifierParameterTest 
{
    private String identify;
    
    public identifierParameterTest(String input) 
    {
        this.identify = input;
    }
    
  @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() 
    {
        return Arrays.asList(new Object[][]
        {
            {"a"},
            {"ab"},
            {"ac"},
            {"lay"}
        }
        );
    }
    
    @Test
    public void identifierParameterTestActual() 
    {
        boolean Identifybool = Printtokens.is_identifier(identify);
        assertTrue(Identifybool);
    }
    
}
