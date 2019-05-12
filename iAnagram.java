
public class iAnagram (String word, String anagram)
{
	char[] charWord = word.toCharArray();
	char[] charFromAnagram = anagram.toCharArray();
	Array.sort(charWord);
	Array.sort(charFromAnagram);
	
	return Arrays.equals(charWord , charFromAnagram)
}
