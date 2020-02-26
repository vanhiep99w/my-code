package chua_kiemtra;

public class Ex02 {

	static int temp=0;
	public static void main(String[] args) {
		
		int []input= {3,2,7,0,6,8,2};
		
		int []output=new int [temp];
		output=getSingleElement(input);
		
	}
	private static int[] getSingleElement(int[] input) {
		int[] output=new int[input.length];
		int count=0;
		for(int i=0;i<input.length;i++) {
			int item=input[i];
			if(!isExist(item,output)) {
				temp++;
				output[count++]=item;
				
			}
		}
		return output;
	}
	private static boolean isExist(int item, int[] output) {
		for(int i=0;i<output.length;i++) {
			if(item==output[i]) {
				return true;
			}
		}
		return false;
	}
	private static void printf(int[] input,ConExp exp) {
		for(int i=0;i<temp;i++) {
			if(exp.test(input[i]))
			System.out.println(input[i]); 
		}
	}
}
