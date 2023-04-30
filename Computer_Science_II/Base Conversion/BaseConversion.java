//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BaseConversion
{
        private String number;
        private int base;

        public BaseConversion(String num, int b)
        {
             this.number = num;
             this.base = b;
        }

        public void setNumBase(String num, int b)
        {
             this.number = num;
             this.base = b;
        }

        private int convertToTen()
        {
                int q=number.length();
                int base10=0;
                int power = 0;
                for (int i = q - 1; i >= 0; i--)
                {
                       int temp = (number.charAt(i)-48);     
                       
                       base10 = base10 + temp * (int)Math.pow(base, power);
                       power += 1;
                }
                return base10;
        }

        public String getNum(int newBase)
        {
                int base10 = convertToTen();
                String newNum="";

                while (base10 != 0)
                {
                        newNum = String.valueOf(base10 % newBase) + newNum;
                        base10 /= newBase;
                }
                return number+"-"+base+" == "+newNum+"-"+newBase;
        }

        public String toString()
        {
                return number+"-"+base;
        }
}