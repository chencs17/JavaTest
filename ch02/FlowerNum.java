public class FlowerNum{
	public static void main(String args[]){
		for(int num = 100; num <= 1000; num++){
			int sum = 0;
			int temp = num;
			while(temp > 0){
				sum += (temp % 10) * (temp % 10) * (temp % 10);
				temp /= 10;
			}
			if(sum == num){
				System.out.println(num);
			}
		}
	}
}
