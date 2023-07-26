package dto;

import java.util.ArrayList;
import java.util.TreeSet;


public class TreeSetPrefixSuffixSearch extends AbstractPrefixSuffixSearch{

	public TreeSetPrefixSuffixSearch() {
		this.words = new TreeSet<>();
	}
	
	@Override
	public String[] getWordsWithPrefix(String prefix) {
		if(prefix == null || prefix.isEmpty())
			return new String[0];
		String highBound = getNextString(prefix);
        return ((TreeSet<String>) words).subSet(prefix, highBound).toArray(new String[0]);
	}

	private String getNextString(String prefix) {
        int lastCharIndex = prefix.length() - 1;
        String nextPrefix = prefix.substring(0, lastCharIndex) + (char)(prefix.charAt(lastCharIndex) + 1);
        return nextPrefix;
    }

	@Override
	public String[] getWordsWithSuffix(String suffix) {
		if(suffix == null || suffix.isEmpty())
			return new String[0];
		ArrayList<String> res = new ArrayList<>();
		for(String word : words) {
			if(word.endsWith(suffix))
				res.add(word);
		}
		return res.toArray(new String[0]);
	}

}
