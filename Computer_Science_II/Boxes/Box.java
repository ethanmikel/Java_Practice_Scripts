9//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Box {

    private String let;
    private int size;

    public Box() {
    }

    public Box(String let, int size) {
        this.let = let;
        this.size = size;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                output += let;
            }
            output += "\n";
        }
        return output + "\n";
    }
}