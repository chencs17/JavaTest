public class ArrayOpt{
	public static void main(String arg[]){
		/*
		*实现数组复制
		*/
		int dataA[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};//定义数组
		int dataB[] = new int[]{11, 22, 33, 44, 55, 66, 77, 88};
		System.arraycopy(dataA, 4, dataB, 2, 3);
		//数组复制,将dataA从第4个元素开始，复制3个元素到dataB的第2个元素，
		//即：将dataA的4,5，6号元素，覆盖dataB的2, 3, 4号元素
		print(dataB);


		/*
		*实现排序，使用java.util.Arrays.sort()
		*/
		int dataSort[] = new int[]{3,6,1,2,8,0};
		java.util.Arrays.sort(dataSort);//进行排序
		print(dataSort);
		
	}

	public static void print(int temp[]){
		for(int i = 0 ; i < temp.length; i++){
			System.out.print(temp[i] + ",");
		}
		System.out.println();
	}
}
