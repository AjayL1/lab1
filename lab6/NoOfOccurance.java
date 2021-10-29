package lab6;

import java.util.*;
import java.lang.*;

public class NoOfOccurance {
	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str) {

		int count[] = new int[MAX_CHAR]; // Create an array size

		int len = str.length();

		for (int i = 0; i < len; i++) // Initialize count array index
			count[str.charAt(i)]++;

		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
		String str = "ayazahammed";
		getOccuringChar(str);

	}

}
