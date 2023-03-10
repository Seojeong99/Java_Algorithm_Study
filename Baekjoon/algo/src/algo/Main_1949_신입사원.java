package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1949_???Ի??? {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t=Integer.parseInt(st.nextToken());
		for(int test=0; test<t; test++) {
			st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int num[][]=new int[n][2];
			
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				num[i][0]=Integer.parseInt(st.nextToken());
				num[i][1]=Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num,(o1,o2)->{
				return o1[0]-o2[0];
			});
			
			int min=Integer.MAX_VALUE;
			long count=0L;
			for(int i=0; i<n; i++) {
				if(min>num[i][1]) {
					count++;
					min=num[i][1];
				}
			}
			
			System.out.println(count);
			
		}
	}

}
