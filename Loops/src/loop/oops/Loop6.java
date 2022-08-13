package loop.oops;
//to add even numbers within 100
public class Loop6 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=100;i++) {
		if (i%2==0) {
			count=count+i;
		}
	}
	System.out.println(count);
}
}
