//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//write the Number class
//use the handout and
//sample runner code
//to guide you
public class Number {
    private Integer number;

    public Number() {
        number = 0;
    }
    public Number(int num) {
        this.number = num;
    }
    public void setNumber(int num) {
        this.number = num;
    }
    public int getNumber() {
        return number;
    }
    public boolean isOdd() {
        return number % 2 == 1;
    }
    public boolean isPerfect() {
        int sum = 0;
        for(int i = 1; i < number; ++i) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    public String toString() {
        return String.valueOf(number);
    }
}