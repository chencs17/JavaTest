public class ArrayDemo{
	public static void main(String args[]){
		int data[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
