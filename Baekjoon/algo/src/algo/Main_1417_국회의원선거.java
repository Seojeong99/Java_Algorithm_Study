package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main_1417_국회의원선거 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int dasom=Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
				
		for(int i=0; i<n-1; i++) {
			st = new StringTokenizer(br.readLine());
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		int count=0;
		if(n==1) {
			System.out.println(0);
		}
		else {
			
			while(true) {
				int temp=pq.poll();
				if(temp<dasom) {
					break;
				}
				//나온값보다 다솜이가 작거나 같다면
				count++;
				dasom=dasom+1;//다솜이 올려주기
				pq.add(temp-1);
				
			}
			
			System.out.println(count);
		}

	}

}
