package someTask;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        wc.addWord("apple");
        wc.addWord("banana");
        wc.addWord("apple");

        System.out.println(wc.getWordCount("apple")) ;
        System.out.println(wc.getWordCount("banana") == 1);
        System.out.println(wc.getWordCount("cucumber") == 0);
    }

    /*
     * Implement this class.
     *
     */
    public static class WordCounter {

        private ArrayList<String> storage = new ArrayList<>();

        void addWord(String word) {
            //Code
        storage.add(word);

        }

        int getWordCount(String word) {
            //Code
            int count = 0;
            for (String s : storage) {
                if (word.equals(s))
                    count++;
            }

            return count;
        }
    }
}

