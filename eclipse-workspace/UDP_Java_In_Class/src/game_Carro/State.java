package game_Carro;

public class State {
	// 0 chua danh , 1: x , 2: o
	int d[][] = new int [3][3];
	public State(int d[][]) {
		for (int i =0 ; i <3 ; i++) {
			for(int j = 0; j<3 ; j++)
				this.d[i][j] = d[i][j];
		}
	}
	
	public void Print() {
		for (int i =0 ; i <3 ; i++) {
			for(int j = 0; j<3 ; j++)
			{
				if(d[i][j] == 0) System.out.print("_ ");
				else if(d[i][j] == 1) System.out.print("x ");
				else System.out.print("o ");
			}
			System.out.println("");
		}
		
	}
}

