package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2003_��������3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int num[]=new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
	
		int sum=0;
		int start=0;
		int end=0;
		int count=0;
		
		 while(true){
	            if(sum>=M){
					sum=sum-num[start++];
//					start++;
	            }
	            else if(end==N){
	                break;
	            }else{
					sum=sum+num[end++];
//					end++;
	            }

	            if(sum==M){
	                count++;
	            }
	        }
		 
//		while(true) {
//			System.out.println(1);
//			if(end==N) {
//				System.out.println(1);
//				break;
//			}
//			else if(sum>=M) {
//				start++;
//				sum=sum-num[start];
//			}
//			else if(sum<M) {
//				end++;
//				sum=sum+num[end];
//			}
//			
//			if(sum==M) {
//				count++;
//			}
//		}
		
		System.out.println(count);
			
	}
}
