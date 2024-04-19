package Trie;

public class TrieUse {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("and");
		t.add("anda");
		System.out.println(t.search("and"));
		t.remove("and");
		System.out.println(t.search("and"));
		System.out.println(t.search("anda"));
	}

}
