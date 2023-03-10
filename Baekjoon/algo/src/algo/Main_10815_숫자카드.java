package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main_10815_숫자카드 {

	static int n;
	static int n2;
	static int[] a;
	static int[] b;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		StringBuilder sb= new StringBuilder();
		
		n=Integer.parseInt(st.nextToken());
		a=new int[n];
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		st= new StringTokenizer(br.readLine());
		n2=Integer.parseInt(st.nextToken());
		b=new int[n2];
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<n2; i++) {
			b[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		
		for(int i=0; i<n2; i++) {
			if(bin(i)) sb.append("1 ");
            // 이분 탐색을 해서 해당 숫자가 없는 경우
            else sb.append("0 ");
		}
		System.out.println(sb);

	}
	
	static boolean bin(int i) {
		int start=0;
		int end=n-1;
		while(start<=end) {
			int check=(start+end)/2;
			if(a[check]>b[i]) {
				end=check-1;
			}
			else if(a[check]<b[i]) {
				start=check+1;
			}
			else {
				return true;
			}
			
		}
		return false;
	}

}
