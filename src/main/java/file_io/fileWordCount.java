package file_io;

import properties.Config;

import java.io.*;
import java.util.ArrayList;

public class fileWordCount {

    public static void wordCounter(String fileLocation){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/nbc_parse.txt"));
            BufferedWriter bufferedWriterWords = new BufferedWriter(new FileWriter("src/main/resources/nbc_words.txt"));
            ArrayList<String> words = new ArrayList<>();
            words.add("");
            int count = 0;
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
                for (String word : line.split(" ")){
                    word = word.replaceAll("\\p{Punct}","").replace("“","").replace("”","").toLowerCase();
                    if (!words.contains(word)){
                        words.add(word);
                        bufferedWriterWords.write(word + "\n");
                        count++;
                    }
                }
            }
            bufferedWriter.write("" + count);
            bufferedWriter.close();
            bufferedWriterWords.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void realWordCounter(String fileLocation){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            BufferedReader bufferedReaderEnglish = new BufferedReader(new FileReader("src/main/resources/english.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/nbc_real_parse.txt"));
            BufferedWriter bufferedWriterWords = new BufferedWriter(new FileWriter("src/main/resources/nbc_fake_words.txt"));
            ArrayList<String> english = new ArrayList<>();
            for (String line = bufferedReaderEnglish.readLine(); line != null; line = bufferedReaderEnglish.readLine()){
                english.add(line.toLowerCase());
            }
            ArrayList<String> words = new ArrayList<>();
            words.add("");
            int count = 0;
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
                for (String word : line.split(" ")){
                    word = word.replaceAll("\\p{Punct}","");
                    word = word.replace("“","");
                    word = word.replace("”","");
                    word = word.toLowerCase();
                    if (!words.contains(word)){
                        if (!english.contains(word)){
                            bufferedWriterWords.write(word + "\n");
                        }else {
                            words.add(word);
                            count++;
                        }
                    }
                }
            }
            bufferedWriter.write("" + count);
            bufferedWriter.close();
            bufferedWriterWords.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        wordCounter(Config.fileLocation());
        realWordCounter(Config.fileLocation());
    }

}
