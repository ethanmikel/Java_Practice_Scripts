//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Part implements Comparable<Part> {
    private String make, mode;
    private int year;

    public Part(String line) {
        String[] list = line.split(" ");
        StringBuilder data1 = new StringBuilder();
        int i = 0;
        while(!Character.isDigit(list[i].charAt(0))){
            data1.append(list[i++]).append(" ");
        }
        data1.append(list[i++]).append(" ");
        make = data1.toString().trim();
        data1.setLength(0);
        while(!Character.isDigit(list[i].charAt(0))){
            data1.append(list[i++]).append(" ");
        }
        mode = data1.toString().trim();
        year = Integer.parseInt(list[i]);
    }
    public int compareTo(Part rhs) {
        int comp = this.mode.compareTo(rhs.mode);
        if(comp != 0){
            return comp;
        }
        comp = this.make.compareTo(rhs.make);
        if(comp != 0){
            return comp;
        }
        return Integer.compare(this.year, rhs.year);
    }

    @Override
    public String toString() {
        return mode+" " + year +"  " + make;
    }
}