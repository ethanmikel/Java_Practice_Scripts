public class ChallengeReplace
{
  public static void main(String[] args)
  {
     String message = "I love dogs! I have a dog named Coco. My dog's very smart!";

     System.out.println("Starter Message: " + message);
    
      int index = 0;
      int count = 0; 
     // Write a loop here that replaces every occurrence of "cat" in the message with "dog" (also add a counter)
     while (message.indexOf("dogs") >= 0)
     {
        count++;
         index = message.indexOf("dogs");
        String firstpart = message.substring(0,index);
        String lastpart = message.substring(index+ 12);
        message = firstpart + "dogs and cats" + lastpart;     
     }
     System.out.println("\nSecond Loop Message: " + message);
     System.out.println("Number of Instances of Dogs in the Sentence: " + count);

     
    
  }
}

