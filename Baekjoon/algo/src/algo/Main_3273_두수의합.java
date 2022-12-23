package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main_3273_두수의합 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int num[]=new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int fin=Integer.parseInt(st.nextToken());
		
		int a=0;
		int b=num.length-1;
		int count=0;
		int ans=0;
		Arrays.sort(num);

		
		while(true) {
//			System.out.println("a"+a);
//			System.out.println("b"+b);
			if(a>=b) {
				break;
			}
			ans=num[a]+num[b];
			if(ans<fin) {
				a++;
			}
			else if(ans>fin) {
				b--;
			}
			else if(ans==fin) {
				a++;
				b--;
//				System.out.println("!!!!!!!!!!!!!!");
				count++;
			}
		}
		
		System.out.println(count);

	}

}
