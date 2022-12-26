package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2003_��������2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int num[]=new int[N];
		st = new StringTokenizer(br.readLine());
		int fullnum=0;
		for(int i=0; i<N; i++) {
			num[i]=Integer.parseInt(st.nextToken());
			fullnum=fullnum+num[i];
		}
		
		Arrays.sort(num);
		int a=0;
		int b=N-1;
		int an=0;
		int count=0;
		while(true) {

			if(a>=b) {
				fullnum=fullnum-(num[a]+num[b]);
				a++;
				b++;
				if(a<0 || b>=N-1) {
					break;
				}
				fullnum=fullnum+(num[a]+num[b]);
			}
			if(fullnum>M) {
				fullnum=fullnum-(num[b]);
				b--;
				if(a<0 || b>N-1) {
					break;
				}
			}
			else if(fullnum<M) {
				fullnum=fullnum-(num[a]);
				a++;
				if(a<0 || b>N-1) {
					break;
				}
			}
			if(fullnum==M) {
				fullnum=fullnum-(num[a]+num[b]);
				a++;
				b++;
				count++;
				if(a<0 || b>N-1) {
					break;
				}
				fullnum=fullnum+(num[a]+num[b]);
			}
		}
			
			System.out.println(count);
		
	}
}
