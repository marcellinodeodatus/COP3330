
public class Tester {

    public static void main(String[] args) {
        Encrypter myEncrypter = new Encrypter();
        String encryptedValue = myEncrypter.encrypt("1234");

        Decrypter myDecrypter = new Decrypter();
        String decryptedValue = myDecrypter.decrypt("0189");

    }
}
