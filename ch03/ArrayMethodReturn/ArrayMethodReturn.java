public class ArrayMethodReturn{
	public static void main(String args[]){
		int data[] = init();
		print(data);
		System.out.println("数组长度为：" + init().length);
	}

	public static int[] init(){
		return new int[]{1,2,3};
	}

	public static void print(int temp[]){
		for(int i = 0; i < temp.length; i++){
			System.out.print(temp[i] + "，");
		}
		System.out.println();
	}
}
