package JUnit4Printtokens;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class stringParameterTest 
{
    private String str;
    
    public stringParameterTest(String input) 
    {
        this.str = input;
    }
    
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() 
    {
        return Arrays.asList(new Object[][]
        {
            {"\"kitty\""},
            {"\"cat\""},
            {"\"walking\""},
            {"\"silently\""}
        }
        );
    }
    
    @Test
    public void stringParameterTestActual() 
    {
        boolean strconstbool = Printtokens.is_str_constant(str);
        assertTrue(strconstbool);
    }
    
}
