public class FlowerNumMethod{
	public static void main(String args[]){
		for(int num = 100; num <= 1000; num++){
			if(isFowerNum(num)){
				System.out.println(num);
			}	
		}
	}
	
	public static boolean isFowerNum(int num){
		int sum = 0;
		int temp = num;
                while(temp > 0){
                	sum += (temp % 10) * (temp % 10) * (temp % 10);
                        temp /= 10;
                }
                if(sum == num){
                	return true;
                }
		
		return false;
	}
}
