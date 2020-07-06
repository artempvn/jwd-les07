package by.artempvn.les07.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class CustomLocale {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {

			String country = "";
			String language = "";
			switch (i) {
			case 0:
				System.out.println("английский:");
				country = "US";
				language = "EN";
				break;
			case 1:
				System.out.println("русский:");
				country = "RU";
				language = "RU";
				break;
			}
			Locale current = new Locale(language, country);
			ResourceBundle resourceBundle = ResourceBundle
					.getBundle("property.text", current);
			String s1 = resourceBundle.getString("str1");
			System.out.println(s1);
			String s2 = resourceBundle.getString("str2");
			System.out.println(s2);
		}
	}
}
