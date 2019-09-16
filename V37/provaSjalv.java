public class provaSjalv {

	public static void main(String[] args) {

		byte tal1 = 127; // initierar variabel
		System.out.println(tal1); // skriver ut variabel
		tal1 = (byte) (tal1 + 1); // omvandlar siffran 1 från int till byte

		System.out.println(tal1);

		int tal2 = 2147483647;
		System.out.println(tal2);
		tal2 = tal2 + 1;

		System.out.println(tal2);
	}

}
