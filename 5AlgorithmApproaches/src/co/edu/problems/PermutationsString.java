package co.edu.problems;

import java.util.ArrayList;

public class PermutationsString {

	public static ArrayList<String> permutations(String str) {
		return auxPermutations(str.charAt(0), String.copyValueOf(str.toCharArray(), 1, str.length()-1), new ArrayList<String>());
	}
	
	public static ArrayList<String> auxPermutations(char str, String strTail, ArrayList<String> ans){
		if(strTail.length() == 0)
			return ans;
		else {			
			ans.add(strTail);
			//Include the letter on every position in the array
			ans = merge(str, ans);
			return auxPermutations(strTail.charAt(0), 
					String.copyValueOf(strTail.toCharArray(), 1, strTail.length()-1), 
					ans);
		}
	}

	private static ArrayList<String> merge(char str,  ArrayList<String> current) {
		ArrayList<String> ans = new ArrayList<String>();
		String tempStr = "";
		String comp = "";
		for(String st: ans) {
			tempStr = st;
			for (int i = 0; i < tempStr.length(); i++) {
				comp = insertInString(tempStr, i, str);
				System.out.println(comp);
				ans.add(comp);
			}
		}
		return ans;
		
	}

	private static String insertInString(String tempStr, int i, char str) {
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < tempStr.length(); j++) {
			if(j == i) {
				sb.append(str);
				i = -1;
			}
			sb.append(tempStr.charAt(j));
		}
		return sb.toString();
	}

	public static String printArray(ArrayList<String> permutations) {
		StringBuffer sb = new StringBuffer();
		for(String str: permutations){
			sb.append(str + ", ");
		}
		return sb.toString();
	}

}
