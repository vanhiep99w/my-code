package baitap;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào số hàng : ");
		int n=sc.nextInt();
		/*
		 * imageA(n);imageB(n);imageC(n);imageD(n);
		 * imageE(n);imageF(n);imageG(n);imageH(n);imageI(n);
		 * imageJ(n);imageK(n);imageL(n); imageM(n);imageN(n);imageO(n);imageP(n);
		 */
		imageK(n);
	}
	
	private static void imageA(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void imageB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void imageC(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<i;temp++) {
				System.out.print("  ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void imageD(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<n-i-1;temp++) {
				System.out.print("  ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	private static void prStraight(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("# ");
		}
		System.out.println("\n");
	}
	private static void imageE(int n) {
		prStraight(n);
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
		prStraight(n);
	}
	private static void imageF(int n) {
		prStraight(n);
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n;j++) {
				if(j==i+1) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
		prStraight(n);
	}
	private static void imageG(int n) {
		prStraight(n);
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-2-i) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
		prStraight(n);
	}
	private static void imageH(int n) {
		prStraight(n);
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-i-2||j==i+1) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
		prStraight(n);
		
	}
	private static void imageI(int n) {
		prStraight(n);
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-i-2||j==i+1||j==0||j==n-1) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
		prStraight(n);
		
	}
	private static void imageJ(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<i;temp++) {
				System.out.print("  ");
			}
			for(int j=0;j<((n-1)*2+1-2*i);j++) {
				System.out.print("# ");
			}
			System.out.println("\n");
		}
	}
	private static void imageK(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<n-i-1;temp++) {
				System.out.print("  ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("# ");
			}
			System.out.println("\n");
		}
	}
	private static void imageL(int n) {
		imageK(n);
		int m=n-1;
		for(int i=0;i<m;i++) {
			System.out.print("    ");
			for(int temp=0;temp<i;temp++) {
				System.out.print("  ");
			}
			for(int j=0;j<((m-1)*2+1-2*i);j++) {
				System.out.print("# ");
			}
			System.out.println("\n");
		}
	}
	private static void imageM(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
	private static void imageN(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<i;temp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
	private static void imageO(int n) {
		for(int i=0;i<n;i++) {
			for(int temp=0;temp<n-i-1;temp++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
	private static void imageP(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
}
