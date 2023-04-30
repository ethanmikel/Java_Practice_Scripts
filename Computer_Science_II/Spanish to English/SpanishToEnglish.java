//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpanishToEnglish {

    private final Map<String,String> pairs;

    public SpanishToEnglish() {
        pairs = new HashMap<>();
    }

    public void putEntry(String entry) {
        try {
            String[] list = entry.split(" ");
            pairs.put(list[0], list[1]);
        } catch (Exception e) {
            System.out.println("Invalid string format.");
        }

    }

        public void initSpanishToEnglishDataFile(File dataFile) {
        String fileIn = dataFile.getAbsolutePath();

        if (dataFile.exists()) {
            try
            {
                FileReader file = new FileReader(fileIn);
                BufferedReader fileStream = new BufferedReader(file);

                String line = fileStream.readLine();
                while (line != null) {
                    putEntry(line);
                    line = fileStream.readLine();
                }
                fileStream.close();

            }
            catch(Exception e)
            {
                System.out.println("No file was read");
            }
        }
        else {
            System.out.println("The file does not exist");
        }

    }
    public String translate(String sent) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner chop = new Scanner(sent);
        String temp = sent.replace("\n" ," ");
        String[] t = temp.split("");
        for (String word : t) {
            String translatedWord = this.pairs.get(word);
            if (translatedWord != null) {
                stringBuilder.append(" ").append(translatedWord);
            }else {
                stringBuilder.append(" ").append(word);
            }
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (String key : pairs.keySet()) {
            String item = pairs.get(key);
            stringBuilder.append(key).append("=").append(item).append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}