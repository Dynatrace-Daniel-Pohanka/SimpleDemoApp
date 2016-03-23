package DemoPrinter;
// This class prints the given message on console.

public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message;
	  if (message.equals(""))
		  throw new IllegalArgumentException("Name has no content.");
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
} 