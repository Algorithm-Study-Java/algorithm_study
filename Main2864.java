import java.util.Scanner;

// 2864번
public class Main2864 {
	
	public static int getMax(String s1, String s2) {
		
		char[] arr=null;
		int v1=0;
		int v2=0;
		
		if(s1.contains("5")) {
			arr = s1.toCharArray();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]=='5')
					arr[i]='6';
			}
			
			v1=Integer.parseInt(new String(arr));
		}else {
			v1=Integer.parseInt(s1);
		}
		
		if(s2.contains("5")) {
			arr = s2.toCharArray();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]=='5')
					arr[i]='6';
			}
			
			v2=Integer.parseInt(new String(arr));
		}else{
			v2=Integer.parseInt(s2);
		}
		
		return (v1+v2);
	}
	
	public static int getMin(String s1, String s2) {
		
		char[] arr=null;
		int v1=0;
		int v2=0;
		
		if(s1.contains("6")) {
			arr = s1.toCharArray();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]=='6')
					arr[i]='5';
			}
			
			v1=Integer.parseInt(new String(arr));
		}else {
			v1=Integer.parseInt(s1);
		}
		
		if(s2.contains("6")) {
			arr = s2.toCharArray();
			for(int i=0; i<arr.length; i++) {
				if(arr[i]=='6')
					arr[i]='5';
			}
			
			v2=Integer.parseInt(new String(arr));
		}else{
			v2=Integer.parseInt(s2);
		}
		
		return (v1+v2);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		String[] number = line.split(" ");
		
		int max, min;
		
		max = Main2864.getMax(number[0], number[1]);
		min = Main2864.getMin(number[0], number[1]);
		
		System.out.print(min+" "+max);

	}
}
