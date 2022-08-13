package loop.oops;
//to add odd number <100
public class Loop5 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if (i%2==1) {
				count+=i;
			}
		}
		System.out.println(count);
	}

}
