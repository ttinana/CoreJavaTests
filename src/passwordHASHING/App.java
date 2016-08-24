/**
 * 
 */
package passwordHASHING;

import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/**
 * @author tijana.pavicic
 *
 */
public class App {
	private static String algorithm = new String("SHA1PRNG");

	public static void main(String[] args) {
		try {
			// this one actually is not that random as I would like
			System.out.println(genPassword(7, "goran"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] in = { 1, 6, 8, 4 };
		try {
			System.out.println(encrypt(in, "goran"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void secureRandomNumber() {

		try {

			// Create a secure random number generator using the SHA1PRNG
			// algorithm

			SecureRandom secureRandomGenerator = SecureRandom.getInstance(algorithm);

			// Get 128 random bytes
			byte[] randomBytes = new byte[128];

			secureRandomGenerator.nextBytes(randomBytes);

			// Create two secure number generators with the same seed
			int seedByteCount = 5;

			byte[] seed = secureRandomGenerator.generateSeed(seedByteCount);
			SecureRandom secureRandom1 = SecureRandom.getInstance(algorithm);
			secureRandom1.setSeed(seed);

			SecureRandom secureRandom2 = SecureRandom.getInstance(algorithm);
			secureRandom2.setSeed(seed);

		} catch (NoSuchAlgorithmException e) {

		}

	}

	/**
	 * 
	 * @param length
	 * @param pass
	 * @return
	 * @throws NoSuchAlgorithmException
	 */

	private static String genPassword(int length, String pass) throws NoSuchAlgorithmException {

		StringBuffer buffer = new StringBuffer();
		String str = pass;
		char[] characterMap = str.toCharArray();

		// SecureRandom secure = new SecureRandom();
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");

		for (int i = 0; i <= length; i++) {
			byte[] bytes = new byte[512];
			secureRandom.nextBytes(bytes);
			double number = secureRandom.nextDouble();
			int b = ((int) (number * characterMap.length));
			buffer.append(characterMap[b]);
		}
		return buffer.toString();
	}

	/**
	 * 
	 * @param input
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static byte[] encrypt(byte[] input, String str) throws Exception {
		char[] password = str.toCharArray();

		final int SALT_LENGTH = 12;
		final int ITERATION_COUNT = 3;

		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

		byte[] salt = new byte[SALT_LENGTH];
		sr.nextBytes(salt);

		PBEKeySpec keyspec = new PBEKeySpec(password, salt, ITERATION_COUNT);

		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		SecretKey key = skf.generateSecret(keyspec);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		PBEParameterSpec paramspec = new PBEParameterSpec(salt, ITERATION_COUNT);
		Cipher cipher = Cipher.getInstance("charlie88kisa");
		cipher.init(Cipher.ENCRYPT_MODE, key, paramspec, sr);

		baos.write(salt);
		baos.write(cipher.doFinal(input));

		keyspec.clearPassword();
		return baos.toByteArray();
	}

}
