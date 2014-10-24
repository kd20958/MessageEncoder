/**
 * 
 * @author Kevin
 *
 */
public class ShuffleCipher implements MessageEncoder {
	
	int numberOfShuffle;
	
	public ShuffleCipher(int numberOfShuffle) {
		this.numberOfShuffle = numberOfShuffle;
	}
	
	public String encode(String plainText) { //implements messageEncode
		String newString=plainText;
		for (int i=0;i<numberOfShuffle;i++){
		newString=shuffler(newString);
		}
	return newString;
	}
	
	public String shuffler(String message) {
		String h1;
		String h2;
		StringBuilder builder = new StringBuilder();
		int halfLength;
		Boolean odd = message.length()%2 != 0;
		
		if (odd) { // finding lengths of both halves
			halfLength=(message.length()+1)/2; //when odd, we can't use message.length()/2 = it would be lower half, while we want upper half
		}
		
		else { //find length of both halves
			halfLength=message.length()/2; //split msg from start to half point
		}
		h1=message.substring(0,halfLength); //split msg from half point to end
		h2=message.substring(halfLength, message.length()); //when odd, can't append last letter = no more letters in half2 when i=halfLength-1
		if (odd) { 
			for (int i=0;i<(halfLength-1);i++) {
				builder=builder.append(h1.charAt(i)); // adds char to string
				builder=builder.append(h2.charAt(i));
			}
		builder=builder.append(h1.charAt(halfLength-1)); 
		}
		
		else {
			for (int i=0;i<halfLength;i++) {
				builder=builder.append(h1.charAt(i));
				builder=builder.append(h2.charAt(i));
			}
		}
		return builder.toString();
	}

}