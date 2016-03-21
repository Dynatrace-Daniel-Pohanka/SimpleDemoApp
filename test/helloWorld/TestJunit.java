package helloWorld;
import org.junit.Test;

import DemoPrinter.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {	  
      assertEquals(message,messageUtil.printMessage());
   }
   
   @Test
   public void testPrintEmptyMessage() {
	  message ="";
	  messageUtil = new MessageUtil(message);
      assertEquals(message,messageUtil.printMessage());
   }
}