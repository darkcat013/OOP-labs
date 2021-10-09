package lab3;

import java.util.*;

public class TextInfo
{
    private String text;
    public TextInfo(String text)
    {
        this.text = text;
    }
    public int getNrOfWords()
    {
        return getWords().length;
    }
    public int getNrOfSentences()
    {
        String[] sentences = text.split("[!?. \\n]{2}");
        return sentences.length+1;
    }
    public int getNrOfLetters()
    {
        int k = 0;
        for(int i=0;i<text.length();i++)
        {
            k+=Character.isLetter(text.charAt(i)) ? 1 : 0;
        }
        return k;
    }
    public int getNrOfVowels()
    {
        int k = 0;
        for(int i=0;i<text.length();i++)
        {
            k+=isVowel(text.charAt(i)) ? 1 : 0;
        }
        return k;
    }
    public int getNrOfConsonants()
    {
        return  getNrOfLetters()-getNrOfVowels();
    }
    public Map<String, Integer> getTopWords(int nrOfWords)
    {
        Map<String,Integer> wordCount = new HashMap<>();

        String[] words = getWords();
        for (String s: words)
        {
            if(!wordCount.containsKey(s))
            {
                wordCount.put(s,0);
            }
            wordCount.put(s,wordCount.get(s)+1);
        }
        LinkedHashMap<String, Integer> descendingSortedWordCount = new LinkedHashMap<>();

        wordCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> descendingSortedWordCount.put(x.getKey(),x.getValue()));

        Set<String> keys = descendingSortedWordCount.keySet();
        LinkedHashMap<String, Integer> topWords = new LinkedHashMap<>();
        int k=0;
        for(String key : keys)
        {
            if(k==nrOfWords) break;
            topWords.put(key, descendingSortedWordCount.get(key));
            k++;
        }
        return topWords;
    }

    public String getLongestWord()
    {
        String[] words = getWords();
        String longest = "";
        for (String s:words)
        {
            if(longest.length()<s.length()) longest = s;
        }
        return longest;
    }

    public boolean isVowel(char a)
    {
        boolean upper = a == 'A' || (a == 'E' || (a == 'I' || (a == 'O' || (a == 'U'))));
        boolean lower = a == 'a' || (a == 'e' || (a == 'i' || (a == 'o' || (a == 'u'))));
        return upper || lower;
    }

    public String[] getWords()
    {
        return text.split("\\s+");
    }
}
