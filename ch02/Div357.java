import java.util.*;
public class Div357{
	public static void main(String args[]){
		Scanner out = new Scanner(System.in);
		int num = out.nextInt();
		if(num % 3 == 0 && num % 5 == 0 && num % 7 == 0){
			System.out.println("可以同时被3, 5, 7整除！");
		}
		else{
			System.out.println("不可以同时被3, 5, 7整除！");
		}
	}
}
