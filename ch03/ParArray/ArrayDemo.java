public class ArrayDemo{
	public static void main(String args[]){
		int data[] = new int[]{1, 2, 3};//开辟数组
		change(data);//引用传递，等价于：int temp[] = data;
	
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + ",");
		}
		System.out.println();
	}

	/**
	*将数组的每个元素乘以2
	*/
	public static void change(int temp[]){
		for(int i = 0; i < temp.length; i++){
			temp[i] *= 2;
		}
	}
}
