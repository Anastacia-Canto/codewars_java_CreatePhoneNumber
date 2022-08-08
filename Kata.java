public class Kata {

	public static String createPhoneNumber (int[] numbers) {
		
		StringBuilder input = new StringBuilder();
		
//		for (int i = 0; i < numbers.length; i++) {
//			input.append(numbers[i]);
//		}
		
		for (int i : numbers) {
			input.append(i);
		}
		
		input.insert(0, "(").insert(4, ")").insert(5, " ").insert(9, "-");
		
		return input.toString();
	}
}
