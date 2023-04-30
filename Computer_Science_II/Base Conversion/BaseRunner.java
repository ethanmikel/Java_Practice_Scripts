//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BaseRunner
{
        public static void main ( String[] args )
        {
                BaseConversion ob = new BaseConversion("10", 10);
                System.out.println(ob.getNum(2));
                BaseConversion ob1 = new BaseConversion("AB", 16);
                System.out.println(ob1.getNum(10));
                BaseConversion ob2 = new BaseConversion("345", 6);
                System.out.println(ob2.getNum(4)); 
                BaseConversion ob3 = new BaseConversion("25", 10);
                System.out.println(ob3.getNum(2));  
                BaseConversion ob4 = new BaseConversion("127", 10);
                System.out.println(ob4.getNum(16));  
                BaseConversion ob5 = new BaseConversion("1024", 7);
                System.out.println(ob5.getNum(16)); 
                BaseConversion ob6 = new BaseConversion("97342", 10);
                System.out.println(ob6.getNum(16)); 
                BaseConversion ob7 = new BaseConversion("1010010010001001", 2);
                System.out.println(ob7.getNum(16)); 
                
        }
}