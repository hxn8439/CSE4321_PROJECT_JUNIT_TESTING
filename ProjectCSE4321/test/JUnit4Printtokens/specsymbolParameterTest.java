package JUnit4Printtokens;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class specsymbolParameterTest 
{
    private char specsymbol;

    public specsymbolParameterTest(char input) {
        this.specsymbol = input;
    }
    
    @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {'('},
                {')'},
                {'['},
                {']'},
                {'`'},
                {'\''},
        });
    }
    
    @Test
    public void is_special_symbol() 
    {
        boolean specsymbolbool = Printtokens.is_spec_symbol(specsymbol);
        Assert.assertTrue(specsymbolbool);
    }  
}
