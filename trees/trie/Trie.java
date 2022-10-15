package trees.trie;

public class Trie {
    Trie [] next;
    boolean flat;
    
    public Trie() {
        next = new Trie[26];
        flat = false;
    }
    
    public void insert(String word) {
        Trie temp = this;
        for (char c: word.toCharArray()) {
            if (temp.next[c-'a'] == null) 
                temp.next[c-'a'] = new Trie(); 
            temp = temp.next[c-'a'];
        }
        temp.flat = true;
    }
    
    public boolean search(String word) {
        Trie temp = this;
        for (char c: word.toCharArray()) {
            if (temp.next[c-'a'] == null)
                return false;
            temp = temp.next[c-'a'];
        }
        return temp.flat;
    }
    
    public boolean startsWith(String prefix) {
        Trie temp = this;
        for (char c: prefix.toCharArray()) {
            if (temp.next[c-'a'] == null)
                return false;
            temp = temp.next[c-'a'];
        }
        return true;
    }
}
