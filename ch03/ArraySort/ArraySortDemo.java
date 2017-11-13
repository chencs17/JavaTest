public class ArraySortDemo{
	public static void main(String args[]){
		int data[] = new int[] {2, 1, 9, 0, 5, 3, 7, 6, 8};
		sort(data);
		print(data);
	}

	public static void sort(int arr[]){//此方法负责排序
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}

	public static void print(int temp[]) {
		for(int x : temp){
			System.out.print(x + ",");
		}
		System.out.println();
	}
}
