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

public class Palindrome_Pair {

  private TrieNode root;
  public int count;

  public Palindrome_Pair() {
    root = new TrieNode('\0');
  }

  private void insert(TrieNode root, String word) {
    if (word.length() == 0) {
      root.isTerminating = true;
      return;
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      child = new TrieNode(word.charAt(0));
      root.children[childIndex] = child;
      root.childCount++;
    }

    insert(child, word.substring(1));
  }

  public void insert(String word) {
    insert(root, word);
  }

  private boolean search(TrieNode root, String word) {
    if (word.length() == 0) {
      return root.isTerminating;
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      return false;
    }
    return search(child, word.substring(1));
  }

  public boolean search(String word) {
    return search(root, word);
  }

  public String reverse(String word) {
    StringBuilder reversed = new StringBuilder();
    for (int i = word.length() - 1; i >= 0; i--) {
      reversed.append(word.charAt(i));
    }
    return reversed.toString();
  }

  public boolean isPalindromePair(ArrayList<String> words) {
    for (String originalWord : words) {
      String reversedWord = reverse(originalWord);
      Trie suffixTrie = new Trie();
      for (int j = 0; j < reversedWord.length(); j++) {
        suffixTrie.insert(reversedWord.substring(j));
      }
      for (String word : words) {
        if (suffixTrie.search(word)) {
          return true;
        }
      }
    }
    return false;
  }
}
