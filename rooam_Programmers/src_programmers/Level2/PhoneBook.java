package Level2;

import java.util.HashMap;

public class PhoneBook {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] phone_book = { "11244", "1123" };

		int size = 20;
		int index = 0;

		boolean answer = true;

		for (int i = 0; i < phone_book.length; i++) {
			if (phone_book[i].length() < size) {
				size = phone_book[i].length();
				index = i;
			}
		}

		hm.put(phone_book[index], 1);
		phone_book[index] = null;

		for (int i = 0; i < phone_book.length; i++) {
			if (phone_book[i] != null) {
				for (int j = i; j < phone_book[i].length(); j++) {
					if (hm.containsKey(phone_book[i].substring(0, j))) {
						break;
					}
					if (j == phone_book[i].length() - 1) {
						hm.put(phone_book[i], 1);
					}
				}
			}
		}
		
		System.out.println(hm.size());
		
		if (hm.size() == phone_book.length) {
			answer = true;
		} else {
			answer = false;
		}

		System.out.println(answer);

	}
}
