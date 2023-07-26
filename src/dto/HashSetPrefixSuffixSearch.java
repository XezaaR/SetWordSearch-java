package dto;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPrefixSuffixSearch extends AbstractPrefixSuffixSearch{

	public HashSetPrefixSuffixSearch() {
		this.words = new HashSet<>();
	}
	
	@Override
	public String[] getWordsWithPrefix(String prefix) {
		if (prefix == null || prefix.isEmpty()) {
            return new String[0];
        }
		ArrayList<String> res = new ArrayList<>();
		for(String word : words) {
			if(word.startsWith(prefix))
				res.add(word);
		}
		return res.toArray(new String[0]);
	}

	@Override
	public String[] getWordsWithSuffix(String suffix) {
		if (suffix == null || suffix.isEmpty()) {
            return new String[0];
        }
		ArrayList<String> res = new ArrayList<>();
		for(String word : words) {
			if(word.endsWith(suffix))
				res.add(word);
		}
		return res.toArray(new String[0]);
	}

}



