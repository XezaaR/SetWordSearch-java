package dto;

public interface IPrefixSuffixSearch {
    void addWords(String[] words);
    String[] getWordsWithPrefix(String prefix);
    String[] getWordsWithSuffix(String suffix);
    boolean containsWord(String word);
}

