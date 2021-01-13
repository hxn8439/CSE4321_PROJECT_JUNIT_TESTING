package JUnit4Printtokens;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.MethodSorters;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
import java.util.List;

//import org.junit.Before;
//import org.junit.Test;
import java.io.BufferedReader;


public class handletokenTest 
{
    
   Printtokens tokens;
   BufferedReader buff = null;
   
   @Before
    public void setUp()
    {
        tokens = new Printtokens();
        
    }
    
    @Test
    public void openCharStreamWithFile() 
    {
        String fileName = "tokens.txt";
        buff = tokens.open_character_stream(fileName);
        assertNotNull(buff);
        buff = null;
    }

    @Test
    public void openCharStreamNoFile() 
    {
        String fileName = null;
        buff = tokens.open_character_stream(fileName);
        assertNotNull(buff);
        buff = null;
    }
    
    @Test
    public void getcharToken()
    {
        String fileName = "tokens.txt";
        buff = tokens.open_character_stream(fileName);
        int chi = 0;
        chi = tokens.get_char(buff);
        assertNotEquals(0, chi);
        buff = null;
        chi = 0;
        
    };  
    
    @Test
    public void ungetcharToken()
    {
        String fileName = "tokens.txt";
        buff = tokens.open_character_stream(fileName);
        int chi;
        int chireset;
        //chi = 0;
        
        chi = tokens.get_char(buff);
        chireset = tokens.unget_char(chi, buff);
        assertNotEquals(chi,chireset);
        buff = null;
    };  
    
    @Test
    public void opentokenStreamNotNull() 
    {
        String fileName = "tokens.txt";
        BufferedReader buff = tokens.open_token_stream(fileName);
        assertNotNull(buff);
        buff = null;
    }
    
    @Test
    public void gettokenString()
    {
        String caught = null;
        
        String fileName = "tokens.txt";
        BufferedReader buff = tokens.open_token_stream(fileName);
        
        caught = tokens.get_token(buff);
        assertNotNull(caught);
        buff = null;
    }        
    
    @Test
    public void tokentype()
    {
        String caught1 = null;
        String fileName = "tokens.txt";
        BufferedReader buff = tokens.open_token_stream(fileName);
        
        caught1 = tokens.get_token(buff);

        int tok = 0;
        tok = tokens.token_type(caught1);
        
        assertNotEquals( 0, tok);   
    }     
    
    
}
