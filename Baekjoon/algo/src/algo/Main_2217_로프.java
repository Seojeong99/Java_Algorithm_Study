package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main_2217_????{
	static int num[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int max=Integer.MIN_VALUE;
		
		int x=0;
		num=new int[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);

		int count=0;
		for(int i=n-1; i>=0; i--) {
			count++;
			max=Math.max(max, num[i]*count);
		}
		
		System.out.println(max);
	}
}
