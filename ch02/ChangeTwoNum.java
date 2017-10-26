public class ChangeTwoNum{
	public static void main(String args[]){
		//方法一引用第三方变量
		int x = 10;
		int y = 20;
		int temp = x;
		System.out.println("x = "+ x + ", y = " + y );
		x = y;
		y = temp;
		System.out.println("changed: x = "+ x + ", y = " + y );

		//方法二，数学方法
		int a = 10;
		int b = 20;
		a += b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + ", b = " + b);
	}
}
