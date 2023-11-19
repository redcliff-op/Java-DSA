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

public class Trie {
  private TrieNode root;
  public int count;

  public Trie() {
    root = new TrieNode('\0');
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

  public void autoComplete(ArrayList<String> input, String word) {
    int i = 0;
    while (i < input.size()) {
      String a = input.get(i);
      add(root, a);
      i++;
    }
    if (root == null || root.childCount == 0) {
      return;
    }
    TrieNode a = findWord(root, word);
    String output = "";
    allWords(a, word, output);

  }

  public void allWords(TrieNode root, String word, String output) {
    if (root == null) {
      return;
    }

    if (root != null && root.childCount == 0) {
      if (output.length() > 0) {
        System.out.println(word + output);
      }
      return;
    }

    if (root != null && root.isTerminating == true) {
      System.out.println(word + output);
    }

    for (int i = 0; i < root.children.length; i++) {
      if (root.children[i] != null) {
        String ans = output + root.children[i].data;
        allWords(root.children[i], word, ans);
      }
    }
  }

  public TrieNode findWord(TrieNode root, String word) {
    if (word.length() == 0) {
      return root;
    }
    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if (child == null) {
      return null;
    }
    return findWord(child, word.substring(1));
  }
}
