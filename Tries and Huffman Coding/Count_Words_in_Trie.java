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

public class Count_Words_in_Trie {

  private TrieNode root;
  private int numWords;

  public Count_Words_in_Trie() {
    root = new TrieNode('\0');
    numWords = 0;
  }

  public void remove(String word) {
    if (remove(root, word)) {
      numWords--;
    }
  }

  private boolean remove(TrieNode root, String word) {
    if (word.length() == 0) {
      if (root.isTerminating) {
        root.isTerminating = false;
        return true;
      } else {
        return false;
      }
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      return false;
    }
    boolean ans = remove(child, word.substring(1));
    if (!child.isTerminating && child.childCount == 0) {
      root.children[childIndex] = null;
      child = null;
      root.childCount--;
    }
    return ans;
  }

  private boolean add(TrieNode root, String word) {
    if (word.length() == 0) {
      if (root.isTerminating) {
        return false;
      } else {
        root.isTerminating = true;
        return true;
      }
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      child = new TrieNode(word.charAt(0));
      root.children[childIndex] = child;
      root.childCount++;
    }
    return add(child, word.substring(1));
  }

  public void add(String word) {
    if (add(root, word)) {
      numWords++;
    }
  }

  public int countWords() {
    return numWords;
  }
}
