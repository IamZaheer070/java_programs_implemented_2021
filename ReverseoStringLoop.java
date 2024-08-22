public class ReverseoStringLoop{

	public static void main(String[] args) {
		
		String str = reverse("Hamza");
		System.out.println(str);
	}
	
	public static String reverse(String s) {
		char[] arr = new char[s.length()];
		
		int index = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			arr[index] = s.charAt(i);
			index++;
		}
		
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			reverse = reverse + arr[i];
		}
		
		return reverse;
	}

}