package game_16_so;

public class State {
	int g=0,h=0;
	State Cha;
	Operator Me;
	SearchA S;
	int d[][] = new int[S.size][S.size];
	public State(int d[][]){
		for (int i=0; i < S.size; i++)
			for (int j=0; j < S.size; j++)
				this.d[i][j]=d[i][j];
	}
	public String Key(){
		String s="";
		for (int i=0; i < S.size; i++){
			for (int j=0; j < S.size; j++)
				s+=d[i][j];
		}
		return s;
	}
	public void Print(){
		for (int i=0; i < S.size; i++){
			for (int j=0; j < S.size; j++)
				if(d[i][j] < 10) System.out.print(" "+d[i][j]+"  ");
				else System.out.print(d[i][j]+"  ");
			System.out.println();
		}
		System.out.println("--------------");
	}
}

