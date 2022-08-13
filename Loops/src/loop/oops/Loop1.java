package loop.oops;


public class Loop1 {
	public static void main(String[] args) {
		for (int i = 1; i <=50; i++) {
			if (i==5) {
				continue;
				
			}
			for(int j=1;j<=5;j++) {
				
				System.out.print(i);
				
			}
			System.out.println("\n");
		}
		
	}

}
