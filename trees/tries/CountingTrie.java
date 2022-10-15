package trees.tries;

import java.util.* ;
import java.io.*; 

public class CountingTrie {
    CountingTrie [] next;
    int prefix;
    int end;
    
    public CountingTrie() {
        next = new CountingTrie [26];
        prefix = 0;
        end = 0;
    }
    
    public boolean containsKey(char c) {
        return next[c-'a'] != null;
    }
    
    public CountingTrie get(char c) {
        return next[c-'a'];
    }
    
    public void put(char c, CountingTrie node) {
        next[c-'a'] = node;
    }
    
    public void insert(String word) {
        CountingTrie temp = this;
        for (char c: word.toCharArray()) {
            if (!temp.containsKey(c)) 
                temp.put(c, new CountingTrie()); 
            temp = temp.get(c);
            temp.prefix++;
        }
        temp.end++;
    }

    public int countWordsEqualTo(String word) {
        CountingTrie temp = this;
        for (char c: word.toCharArray()) {
            if (!temp.containsKey(c))
                return 0;
            temp = temp.get(c);
            if (temp.prefix==0) return 0;
        }
        return temp.end;
    }

    public int countWordsStartingWith(String word) {
        CountingTrie temp = this;
        for (char c: word.toCharArray()) {
            if (!temp.containsKey(c))
                return 0;
            temp = temp.get(c);
            if (temp.prefix==0) return 0;
        }
        return temp.prefix;
    }

    public void erase(String word) {
        CountingTrie temp = this;
        for (char c: word.toCharArray()) {
            if (!temp.containsKey(c))
                return;
            temp = temp.get(c);
            temp.prefix--;
        }
        temp.end--;
    }

}