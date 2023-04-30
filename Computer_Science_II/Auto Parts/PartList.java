//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class PartList {
    private TreeMap<Part, Integer> partsMap;

    public PartList() {
        partsMap = new TreeMap<>();
    }

    public PartList(String fileName) {
        this();
        try {
            Scanner file = new Scanner(new File(fileName));
            while(file.hasNextLine()){
                String line = file.nextLine();
                Part part = new Part(line);
                partsMap.put(part, partsMap.getOrDefault(part, 0)+1);
            }
        } catch (Exception e) 
                {
            out.println(e);
        } finally {

        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for(Map.Entry<Part, Integer> entry : partsMap.entrySet()){
            output.append(entry.getKey().toString()).append(" - ").append(entry.getValue()).append("\n");
        }
        return output.toString().trim();
    }
}