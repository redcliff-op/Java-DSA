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

public class Search_Word_in_Trie {

  private TrieNode root;
  public int count;

  public Search_Word_in_Trie() {
    root = new TrieNode('\0');
  }

  public boolean search(String word) {
    return search(root, word);
  }

  private boolean search(TrieNode node, String word) {
    if (word.length() == 0) {
      return node.isTerminating;
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = node.children[childIndex];
    if (child == null) {
      return false;
    }
    return search(child, word.substring(1));
  }

  private void add(TrieNode root, String word) {
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
    add(child, word.substring(1));
  }

  public void add(String word) {
    add(root, word);
  }
}
