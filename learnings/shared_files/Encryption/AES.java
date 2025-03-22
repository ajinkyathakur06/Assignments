package assQuestion12;

import java.util.Base64;

public class AES implements Encryptable {

	 @Override
	    public String encrypt(String data) {
	        // Simple mock AES encryption (for illustration only, not actual AES)
	        return Base64.getEncoder().encodeToString(("AES:" + data).getBytes());
	    }

	    @Override
	    public String decrypt(String encryptedData) {
	        // Simple mock AES decryption
	        String decoded = new String(Base64.getDecoder().decode(encryptedData));
	        return decoded.replace("AES:", "");
	    }

}
