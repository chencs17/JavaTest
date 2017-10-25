public class TestDemoType{
	public static void main(String args[]){
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max+1L);
		System.out.println(min-(long)1);
		System.out.println((long)min-2);
		int num = 130;
		byte x = (byte)num;//byte的范围是-128到127
		System.out.println(x);
		byte y = 100;
		System.out.println(y);
	}
}
