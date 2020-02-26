package stringutils;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		String sinput="1345234976";
		String output="";
		char[] input=sinput.toCharArray();
		for(char i:input) {
			if(!output.contains(String.valueOf(i))) {
				output=output+i;
			}
		}
		char[] coutput=output.toCharArray();
		Arrays.sort(coutput);
		output=String.valueOf(coutput);
		System.out.println(output);
		
	}
}
