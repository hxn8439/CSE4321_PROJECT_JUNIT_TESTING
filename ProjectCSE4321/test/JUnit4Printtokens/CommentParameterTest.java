package JUnit4Printtokens;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
//import java.util.Collection;
import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class CommentParameterTest 
{
    private String comment;
     
    public CommentParameterTest(String input)
    {
        this.comment = input;
    }

     @Parameterized.Parameters(name = "{index}: {0}")
     public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]
        {
            {";hello"},
            {";Cat"},
            {";Can"},
            {";You"},
            {";Dance"},
        }
        );
    }

@Test
public void CommentParameterTestActual()
{
    boolean CommentBool = Printtokens.is_comment(comment);
    assertTrue(CommentBool);
}
     
}
