//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Number
{
        private int theValue;
        
        public Number(int value)
        {
            theValue = value;
        }       
        
        public int getValue()
        {
                return theValue;
        }
        
        public boolean equals(Object obj)
        {
            if (obj instanceof Number) {
                Number n = (Number) obj;
                return (theValue == n.getValue());
            }
            return false;
        } 
        
        public int hashCode()
        {
                return (theValue % 10);
        }
        public String toString()
        {
                return String.valueOf (theValue);
        }       
}