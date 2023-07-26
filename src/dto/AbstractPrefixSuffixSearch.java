package dto;

import java.util.Set;

public abstract class AbstractPrefixSuffixSearch implements IPrefixSuffixSearch{
	
	protected Set<String> words;
	
	@Override
	public void addWords(String[] words) {
		if (words == null || words.length == 0)
	            return;
		for(String word : words)
			if(word != null && !word.isEmpty())
				this.words.add(word);
	}

	@Override
	public boolean containsWord(String word) {
		return (word == null || word.isEmpty()) ? 
				false : words.contains(word);
	}

}
