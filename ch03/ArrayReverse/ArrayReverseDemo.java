public class ArrayReverseDemo{
	public static void main(String args[]){
		int data [] = new int[]{1,2,3,4,5,6,7,8};
		System.out.println("逆序前：");
		print(data); 

		reverse(data);		

		System.out.println("逆序后：");
		print(data);
		
	}

	public static void reverse(int arr[]){
		int i = 0;
		int j = arr.length-1;
		while(i < j){
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			++i;
			--j;
		}
	}

	public static void print(int temp[]){
		for(int x : temp){
			System.out.print(x + ",");
		}
		System.out.println();
	}

}
