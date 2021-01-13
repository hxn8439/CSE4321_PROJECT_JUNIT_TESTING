package JUnit4Printtokens;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
//import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class KeywordParameterTest {

    private String keyword;

    public KeywordParameterTest(String input)
    {
        this.keyword = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]
        {
            {"lambda"},
            {"and"},
            {"or"},
            {"if"},
            {"xor"},
            {"=>"}
        }
        );
    }

    @Test
    public void KeywordParameterTest(){
        boolean Keywordbool = Printtokens.is_keyword(keyword);
        assertTrue(Keywordbool);
    }

}
