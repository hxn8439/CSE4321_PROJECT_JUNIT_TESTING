package JUnit4Printtokens;

//import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Suite;
//import org.junit.runner.notification.Failure;
//import java.util.List;

@RunWith(Suite.class)
@Suite.SuiteClasses 
({
   CommentParameterTest.class, 
   KeywordParameterTest.class,
   charParameterTest.class,
   identifierParameterTest.class,
   numParameterTest.class,
   specsymbolParameterTest.class,
   stringParameterTest.class,
   handletokenTest.class,
   printoutTokenTest.class,
   
})


public class SuiteTestExecution
{
    
}
