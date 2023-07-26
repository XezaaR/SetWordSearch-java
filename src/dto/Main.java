package dto;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "wheatgrass", "elderberry", "fig", "grape", "watermelon"};

        IPrefixSuffixSearch hashSetSearch = new HashSetPrefixSuffixSearch();
        IPrefixSuffixSearch treeSetSearch = new TreeSetPrefixSuffixSearch();

        hashSetSearch.addWords(words);
        treeSetSearch.addWords(words);

        String prefix = "w";
        String suffix = "e";

        System.out.println("Words with prefix '" + prefix + "' in HashSet:");
        for (String word : hashSetSearch.getWordsWithPrefix(prefix)) {
            System.out.println("- " + word);
        }

        System.out.println("Words with prefix '" + prefix + "' in TreeSet:");
        for (String word : treeSetSearch.getWordsWithPrefix(prefix)) {
            System.out.println("- " +word);
        }

        System.out.println("Words with suffix '" + suffix + "' in HashSet:");
        for (String word : hashSetSearch.getWordsWithSuffix(suffix)) {
            System.out.println("- " +word);
        }

        System.out.println("Words with suffix '" + suffix + "' in TreeSet:");
        for (String word : treeSetSearch.getWordsWithSuffix(suffix)) {
            System.out.println("- " +word);
        }
        

        
        hashSetSearch.addWords(new String[]{null});
        treeSetSearch.addWords(new String[]{null});

        System.out.println("After adding null:");
        System.out.println("Words in HashSet:");
        for (String word : hashSetSearch.getWordsWithPrefix("")) {
			System.out.println(word);
		}

		System.out.println("Words in TreeSet:");
		for (String word : treeSetSearch.getWordsWithPrefix("")) {
			System.out.println(word);
		}
    }
}
