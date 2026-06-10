package novelvox.common;

import java.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AESEncryption {
   private static final Logger logger = LogManager.getLogger(AESEncryption.class);
   private static final String ALGO = "AES";
   private static final String TRANSFORMATION = "AES/GCM/NoPadding";
   private static final int IV_SIZE = 12;
   private static final int TAG_SIZE = 128;

   private AESEncryption() {
   }

   public static String encrypt(String data) throws AESEncryptionException {
      try {
         Key key = generateKey();
         byte[] iv = new byte[12];
         SecureRandom random = new SecureRandom();
         random.nextBytes(iv);
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         GCMParameterSpec spec = new GCMParameterSpec(128, iv);
         cipher.init(1, key, spec);
         byte[] cipherText = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
         ByteBuffer buffer = ByteBuffer.allocate(iv.length + cipherText.length);
         buffer.put(iv);
         buffer.put(cipherText);
         return Base64.getEncoder().encodeToString(buffer.array());
      } catch (Exception e) {
         throw new AESEncryptionException("Encryption failed", e);
      }
   }

   public static String decrypt(String encryptedData) throws AESEncryptionException {
      try {
         byte[] decoded = Base64.getDecoder().decode(encryptedData);
         byte[] iv = new byte[12];
         byte[] cipherText = new byte[decoded.length - 12];
         System.arraycopy(decoded, 0, iv, 0, 12);
         System.arraycopy(decoded, 12, cipherText, 0, cipherText.length);
         Key key = generateKey();
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         GCMParameterSpec spec = new GCMParameterSpec(128, iv);
         cipher.init(2, key, spec);
         byte[] decryptedValue = cipher.doFinal(cipherText);
         return new String(decryptedValue, StandardCharsets.UTF_8);
      } catch (Exception e) {
         throw new AESEncryptionException("Decryption failed", e);
      }
   }

   public static boolean validateKeys(String key, String envVar) {
      return true;
   }

   private static Key generateKey() {
      String key = System.getenv("SymXKey");
      if (key != null && !key.isBlank()) {
         byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
         if (keyBytes.length != 16 && keyBytes.length != 24 && keyBytes.length != 32) {
            throw new IllegalArgumentException("Invalid AES key length: " + keyBytes.length);
         } else {
            return new SecretKeySpec(keyBytes, "AES");
         }
      } else {
         throw new IllegalArgumentException("Environment variable SymXKey is null or empty");
      }
   }

   public static class AESEncryptionException extends Exception {
      public AESEncryptionException(String message, Throwable cause) {
         super(message, cause);
      }
   }
}
