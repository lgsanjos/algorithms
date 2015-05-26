package exercise.strings;

public class Compress {

	public String compress(String input) {
		StringBuffer output = new StringBuffer();
		int count = 0;
		char c = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (c == input.charAt(i)) {
				count++;
			} else {
				if ( c != 0) {
					output.append(c);
					output.append(count);
				}
				c = input.charAt(i);
				count = 1;
			}
			
			if (i == input.length() -1) {
				output.append(c);
				output.append(count);
			}
		}
		
		
		if (output.length() < input.length())
			return output.toString();
		
		return input;
	}
	

}
