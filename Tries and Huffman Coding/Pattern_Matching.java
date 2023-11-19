import java.util.ArrayList;

class TrieNode {
  char data;
  boolean isTerminating;
  TrieNode children[];
  int childCount;

  public TrieNode(char data) {
    this.data = data;
    isTerminating = false;
    children = new TrieNode[26];
    childCount = 0;
  }
}

public class Pattern_Matching {

  private TrieNode root;
  public int count;

  public Pattern_Matching() {
    root = new TrieNode('\0');
  }

  public boolean search(String word) {
    return search(root, word);
  }

  private boolean search(TrieNode root, String word) {
    if (word.length() == 0) {
      return true;
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      return false;
    }
    return search(child, word.substring(1));
  }

  public boolean patternMatching(ArrayList<String> words, String pattern) {
    Trie trie = new Trie();
    for (String word : words) {
      trie.insertWord(word);
    }
    return trie.search(pattern);
  }

  private void insertWord(String word) {
    insertWord(root, word);
  }

  private void insertWord(TrieNode root, String word) {
    if (word.length() == 0) {
      return;
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      child = new TrieNode(word.charAt(0));
      root.children[childIndex] = child;
      root.childCount++;
    }
    insertWord(child, word.substring(1));
  }
}
