package JUnit4Printtokens;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.MethodSorters;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
import java.util.List;
import java.io.BufferedReader;

public class printoutTokenTest 
{
    Printtokens tokens;
   BufferedReader buff = null;
   
   @Before
    public void setUp()
    {
        tokens = new Printtokens();
        
    }
    
    @Test
    public void printoutTokenActual()
    {
        String caught1 = null;
        String fileName = "tokens.txt";
        BufferedReader buff = tokens.open_token_stream(fileName);
        caught1 = tokens.get_token(buff);
        int tok = 0;
        tokens.print_token(caught1);
        
        System.out.println("\n ***testing printout 1 for above statement**.");
        System.out.println("\n");
    } 
    
    @Test
    public void unget_errorprintactual()
    {
        String fileName = "tokens.txt";
        BufferedReader buff = tokens.open_token_stream(fileName);
        tokens.unget_error(buff);
        System.out.println("\n ***testing printout 2 for above statement**.");
        System.out.println("\n");
    } 
    
    @Test
    public void printspecsymbolactual1()
    {
        String str = "{";
        tokens.print_spec_symbol(str);
        System.out.println("\n ***testing printout 3 for above statement**.");
        System.out.println("\n");    
    } 
    
    @Test
    public void printspecsymbolactual2()
    {
        String str = ")";
        tokens.print_spec_symbol(str);
        System.out.println("\n ***testing printout 4 for above statement**.");
        System.out.println("\n");    
    }
    
    @Test
    public void printspecsymbolactual3()
    {
        String str = "[";
        tokens.print_spec_symbol(str);
        System.out.println("\n ***testing printout 5 for above statement**.");
        System.out.println("\n");    
    }
    
    @Test
    public void printspecsymbolactual4()
    {
        String str = "]";
        tokens.print_spec_symbol(str);
        System.out.println("\n ***testing printout 6 for above statement**.");
        System.out.println("\n");    
    }
    
    @Test
    public void printspecsymbolactual5()
    {
        String str = "'";
        tokens.print_spec_symbol(str);
        System.out.println("\n ***testing printout 7 for above statement**.");
        System.out.println("\n");    
    }
    
    @Test
    public void printspecsymbolactual6()
    {
        String str = "`";
        tokens.print_spec_symbol(str);
        System.out.println("\n ***testing printout 8 for above statement**.");
        System.out.println("\n");    
    }
    
    @Test
    public void istokenendActual1()
    {
        int res = -1;
        int str_com_id = 0;
        
        boolean bool = tokens.is_token_end(str_com_id, res);
        
        assertTrue(bool);
    }        
    
    @Test
    public void istokenendActual2()
    {
        int res = 0;
        int str_com_id = 1;
        char ch;
        
        boolean bool = tokens.is_token_end(str_com_id, res);
        
        assertFalse(bool);
    }
    
    @Test
    public void istokenendActual3()
    {
        int res = -1;
        int str_com_id = 1;
        boolean bool = tokens.is_token_end(str_com_id, res);
        assertTrue(bool);
        
    }
    
    @Test
    public void istokenendActual4()
    {
        int res = 0;
        int str_com_id = 2;
        boolean bool = tokens.is_token_end(str_com_id, res);
        assertFalse(bool);
        
    }
    
    @Test
    public void istokenendActual5()
    {
        int res = -1;
        int str_com_id = 2;
        boolean bool = tokens.is_token_end(str_com_id, res);
        assertTrue(bool);
    }
    
    
}
