import java.util.TreeMap;

/*Gives frequency of words in a list/ how often is a word in the list?*/

public class WordFrequencyMap {
    public static void main(String[] args) {

        //wordlist
        String[] wordlist = {"Hello", "Hi", "hello", "Salut", "Hello"};

        //creates treemap with word as key and occurrence as value
        TreeMap<String, Integer> countWords = new TreeMap<>();

        for (int i = 0; i < wordlist.length; i++) {
            //word is present in treemap -> count occurrence
            if(countWords.containsKey(wordlist[i])) {
                int count = countWords.get(wordlist[i]);
                countWords.put(wordlist[i], count+1);
            } else {
                countWords.put(wordlist[i], 1);
            }
        }

        //display final result
        System.out.println(countWords);
    }
}
