/**
 * 
 * @author Kevin
 *
 */
public class SubstitutionCipher implements MessageEncoder {
	
	int shift;
	
	public SubstitutionCipher(int shift) {
		this.shift = shift;
	}
	
	public String encode(String plainText) {
		String shiftedString="";
		for (int i=0;i<plainText.length();i++){
			shiftedString=shiftedString+shifter(plainText.charAt(i)); //adds chars to newString
		}
	return shiftedString; //implements messageEncoder
	}
	
	private char shifter(char letter) {
		return (char)(letter+this.shift); //this shifts char
	}
}