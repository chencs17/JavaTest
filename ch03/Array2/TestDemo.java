public class TestDemo{
	public static void main(String args[]){
		//int data[] = new int[3];
		int data [] = null;//分步实现数组操作
		data = new int[3];
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		for(int d : data){
			System.out.print(d + "、");
		}
	}
}	
