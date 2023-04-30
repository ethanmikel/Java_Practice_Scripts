
/**
 * Write a description of class d here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class d
{
    public static int checkString(String[] arr)
{
String [] fruits = {"apples", "bananas", "cherries", "dates"};  
for (int i = 1; i <= fruits.length; i++)
{
System.out.println(fruits[i - 1]);
}
return fruits["apples"];
}
}