package assQuestion12;

import java.util.Base64;

public class RSA implements Encryptable {

	@Override
    public String encrypt(String data) {
        // Simple mock RSA encryption (for illustration only, not actual RSA)
        return Base64.getEncoder().encodeToString(("RSA:" + data).getBytes());
    }

    @Override
    public String decrypt(String encryptedData) {
        // Simple mock RSA decryption
        String decoded = new String(Base64.getDecoder().decode(encryptedData));
        return decoded.replace("RSA:", "");
    }
}
