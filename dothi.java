package dothi;

public class Dothi {
	
	private int numberPoint;
	private static int matrix[][];
	
	public Dothi() {
	}
	
	public static void init() {
		for(int i = 0; i<6;i++) {
			for (int j =0; j<6;j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	public static void add_edge(int i, int j) {
		matrix[i][j] =1;
		matrix[j][i] =1;
	}
	
	public static void show() {
		for(int i =0; i<6;i++) {
			System.out.print(i+" ");
			for (int j = 0; j<6;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		matrix= new int [10][10];
		init();
		add_edge(2, 3);
		add_edge(2, 4);
		add_edge(3, 4);
		add_edge(4, 2);
		add_edge(4, 5);
		show();
	}

}
