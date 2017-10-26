public class LoopTest{
	public static void main(String args[]){
		int sum = 0;
		int num = 100;
		while(num <= 200){
			sum += num;
			num++;
		}
		System.out.println("while: sum = " + sum);
		
		sum = 0;
		num = 100;
		do{
			sum += num;
			num++;
		}while(num <= 200);
		System.out.println("do while: sum = " + sum);

		sum = 0;
		for(int i = 100; i <= 200; i++){
			sum += i;
		}
		System.out.println("for: sum = " + sum);
	}
}
