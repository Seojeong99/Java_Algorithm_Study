package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13702_이상한술집 {

	static int N,K;
	static int map[];
	static int max=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());//주전자의 갯수
		K=Integer.parseInt(st.nextToken());//친구 수
		
		map=new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			map[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, map[i]);//최댓값 구하기
		}
		if(N>1) {
			find();	
		}
		else {
			System.out.println(max);
		}
		
	}
	
	static void find() {
		int start=0;
		int end=max;
		int count=0;
		int mid=0;
		
		while(start<=end) {
			mid=(start+end)/2;//중간값 구하기
//			System.out.println("start"+start);
//			System.out.println("end"+end);
//			System.out.println("mid"+mid);
			count=0;
			for(int i=0; i<N; i++) {
				count=count+(map[i]/mid); //사람 수 세기
			}
			
			if(count>=K) { //사람수가 넘치면
				start=mid+1;//용량 늘리기
			}
			else{ //사람수가 적으면
				end=mid-1;//용량 줄이기
			}

		}
		System.out.println(end);
	}

}
