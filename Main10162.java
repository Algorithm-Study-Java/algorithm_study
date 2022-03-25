import java.util.Scanner;
// 백준 10162
public class Main10162 {

	public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	
	int T=scanner.nextInt();
	int[] times= {300, 60, 10};
	
	int a=0, b=0, c=0;
	
	int n=0;
	
	if(T % 10 !=0) {
		System.out.println("-1");
			
	}else {
		while(T>0) {
			if(T >= times[0]) {
				n=T/times[0];
				T= T-(times[0]*n);
				a+=n;
			}
			else {
				if(T>=times[1]) {
					n=T/times[1];
					T=T-(times[1]*n);
					b+=n;
				}else {
					if(T>=10) {
						n=T/times[2];
						T=T-(times[2]*n);
						c+=n;
					}
						
				}
			}
		}
		
		System.out.println(a+" "+ b+" "+ c);
	
	}
	
	scanner.close();
	}

}
