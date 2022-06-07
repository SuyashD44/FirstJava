
public class Vowel {

	static boolean isVowel(char a)
	{
		boolean isVowel = false;
		switch (a) {
		case 'a':
			isVowel = true;	
			break;
		case 'e':
			isVowel = true;
			break;
		case 'i':
			isVowel = true;
			break;
		case 'o':
			isVowel = true;
			break;
		case 'u':
			isVowel = true;
		default:
			break;
		}
		return isVowel;
	}
	
	public static void main(String[] args) 
	{
		char a = 'u';
		System.out.println(isVowel(a) ? "Vowel" : "Consonant");
		
	}
}
