/**
 * 
 * @author Kevin
 *
 */
public class MessageEncoderTest {

	public static void main(String[] args) {
		SubstitutionCipher aSub = new SubstitutionCipher(3);
		ShuffleCipher aShuffle = new ShuffleCipher(1); 
		System.out.println(aSub.encode("abcdefghi"));
		System.out.println(aShuffle.encode("abcdefghi"));
	}

}