//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PQTestRunner 
{
    public static void main ( String[] args ) 
    {
        PQTester test1 = new PQTester("one two three four five six seven"); 
        PQTester test2 = new PQTester("1 2 3 4 5 one two three four five"); 
        PQTester test3 = new PQTester("a p h j e f m c i d k l g n o b"); 

        System.out.println("toString() - " + test1.toString()); 
        System.out.println("getMin() - " + test1.getMin()); 
        System.out.println("getNaturalOrder() - " + test1.getNaturalOrder()+"\n"); 

        System.out.println("toString() - " + test2.toString()); 
        System.out.println("getMin() - " + test2.getMin()); 
        System.out.println("getNaturalOrder() - " + test2.getNaturalOrder()+"\n"); 

        System.out.println("toString() - " + test3.toString()); 
        System.out.println("getMin() - " + test3.getMin()); 
        System.out.println("getNaturalOrder() - " + test3.getNaturalOrder()+"\n"); 
    }
}