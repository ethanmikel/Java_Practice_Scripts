//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTen {
	private String binary;

    public TwoToTen(){
        binary = "0";
    }

    public TwoToTen(String bin){
        binary = bin;
    }

    public void setTwo(String bin){
        binary = bin;
    }

    public long getBaseTen( ){
        long ten=0;
        for (int i = 0; i < binary.length(); ++i) {
            ten *= 2;
            ten += (binary.charAt(i) - '0');
        }
        return ten;
    }

    public String toString() {
        return binary + " == " + getBaseTen();
    }
}