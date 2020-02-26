package game_Carro;

import java.util.Scanner;

public class GameTicTacToe {
	public static void main(String[] args) {
		State start = new State(new int[3][3]);
		Scanner sc = new Scanner(System.in);
		while(true) {
//			start.Print();
			do {
				System.out.println("Input position: ");
				int i = sc.nextInt();
				int j = sc.nextInt();
				if(i <0 || i >=3) continue;
				if(j <0 || j >=3) continue;
				if(start.d[i][j] !=0) continue;
				start.d[i][j] = 1;
				break;
			} while (true); 			
			MyValue r = Minimax(start,7,true);
			start= r.s;
			start.Print();
			if(EndNode(start)) {
				System.out.println("end");
				break;
			}
		}
	}

	static MyValue Minimax(State start, int d, boolean mP) {
		if(EndNode(start) || d == 0) return Value(start);
		if(mP) {
			MyValue M = new MyValue(Integer.MIN_VALUE, null);
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0 ; j <3 ; j++) {
					if(start.d[i][j] == 0 ) {
						State child = new State(start.d);
						
						child.d[i][j] = 2;
						MyValue r = Minimax(child, d-1, !mP);
						r.s = child;
						if(r.score > M.score) M = r;
					}
				}
			}
			return M;
		}
		else {
			MyValue M = new MyValue(Integer.MAX_VALUE, null);
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0 ; j <3 ; j++) {
					if(start.d[i][j] == 0 ) {
						State child = new State(start.d);
						child.d[i][j] = 1;
						MyValue r = Minimax(child, d-1, !mP);
						r.s = child;
						if(r.score < M.score) M = r;
					}
				}
			}
			return M;
		}
	}

	private static MyValue Value(State s) {
		int score = 0;
		for (int i =0; i<=2;i++) {
			if(s.d[0][0] == 2 && s.d[0][1] ==2 && s.d[0][2] ==2) score= 1;
			if(s.d[1][0] == 2 && s.d[1][1] ==2 && s.d[1][2] ==2) score= 1;
			if(s.d[2][0] == 2 && s.d[2][1] ==2 && s.d[2][2] ==2) score= 1;
			
			if(s.d[0][0] == 2 && s.d[1][0] ==2 && s.d[2][0] ==2) score= 1;
			if(s.d[0][1] == 2 && s.d[1][1] ==2 && s.d[2][1] ==2) score= 1;
			if(s.d[0][2] == 2 && s.d[1][2] ==2 && s.d[2][2] ==2) score= 1;
			
			if(s.d[0][0] == 2 && s.d[1][1] ==2 && s.d[2][2] ==2) score= 1;
			if(s.d[0][2] == 2 && s.d[1][1] ==2 && s.d[2][0] ==2) score= 1;
		
			if(s.d[0][0] == 1 && s.d[0][1] ==1 && s.d[0][2] ==1) score= -1;
			if(s.d[1][0] == 1 && s.d[1][1] ==1 && s.d[1][2] ==1) score= -1;
			if(s.d[2][0] == 1 && s.d[2][1] ==1 && s.d[2][2] ==1) score= -1;
			
			if(s.d[0][0] == 1 && s.d[1][0] ==1 && s.d[2][0] ==1) score= -1;
			if(s.d[0][1] == 1 && s.d[1][1] ==1 && s.d[2][1] ==1) score= -1;
			if(s.d[0][2] == 1 && s.d[1][2] ==1 && s.d[2][2] ==1) score= -1;
			
			if(s.d[0][0] == 1 && s.d[1][1] ==1 && s.d[2][2] ==1) score= -1;
			if(s.d[0][2] == 1 && s.d[1][1] ==1 && s.d[2][0] ==1) score= -1;
		}
		return new MyValue(score, s);
	}

	private static boolean EndNode(State s) {
		for (int i =0; i<=2;i++) {
			if(s.d[0][0] == 1 && s.d[0][1] ==1 && s.d[0][2] ==1) return true;
			if(s.d[1][0] == 1 && s.d[1][1] ==1 && s.d[1][2] ==1) return true;
			if(s.d[2][0] == 1 && s.d[2][1] ==1 && s.d[2][2] ==1) return true;
			
			if(s.d[0][0] == 1 && s.d[1][0] ==1 && s.d[2][0] ==1) return true;
			if(s.d[0][1] == 1 && s.d[1][1] ==1 && s.d[2][1] ==1) return true;
			if(s.d[0][2] == 1 && s.d[1][2] ==1 && s.d[2][2] ==1) return true;
			
			if(s.d[0][0] == 1 && s.d[1][1] ==1 && s.d[2][2] ==1) return true;
			if(s.d[0][2] == 1 && s.d[1][1] ==1 && s.d[2][0] ==1) return true;
		}
		for(int i =0; i<=2; i++) {
			for(int j = 0 ; j<=2; j++) {
				if(s.d[i][j] == 0 ) return false;
			}
		}
		return true;
	}
}

class MyValue{
	int score = 0;
	State s;
	public MyValue (int score,State s) {
		this.score = score;
		this.s = s;
	}
}
