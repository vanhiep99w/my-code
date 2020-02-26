package homeworks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int n,m;
		Random rd=new Random();
		String path="readme.txt";
		BufferedWriter bw=null;
		Scanner sc=new Scanner( System.in);
		System.out.print("Nhập vào n :");
		n=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập vào m :");
		m=Integer.parseInt(sc.nextLine());
		int[][] matrix=new int[n][m];
		try {
			bw=Files.newBufferedWriter(Paths.get(path));
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j]=rd.nextInt(10);
					bw.write(matrix[i][j]+" ");
				}
				bw.newLine();
			}
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
