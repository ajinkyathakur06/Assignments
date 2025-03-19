package assQuestion12;

public class EncryptionDemo {
	public static void main(String[] args) {
        // Test AES encryption and decryption
        Encryptable aes = new AES();
        String aesEncrypted = aes.encrypt("Hello, World!");
        System.out.println("AES Encrypted: " + aesEncrypted);
        System.out.println("AES Decrypted: " + aes.decrypt(aesEncrypted));

        // Test RSA encryption and decryption
        Encryptable rsa = new RSA();
        String rsaEncrypted = rsa.encrypt("Hello, World!");
        System.out.println("RSA Encrypted: " + rsaEncrypted);
        System.out.println("RSA Decrypted: " + rsa.decrypt(rsaEncrypted));
    }
}
