package senla.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsUtilits {
	static int getWordCount(String text, String word) throws IllegalArgumentException {
		if (word.equals("") || text.equals(""))
			throw new IllegalArgumentException("Invalid input");

		text = text.toLowerCase();
		word = word.toLowerCase();

		int wordCount = 0;
		Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

		while (matcher.find()) {
			wordCount++;
		}
		return wordCount;
	}
}
