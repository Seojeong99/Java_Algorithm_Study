package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1427_나무자르기{
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int n=Integer.parseInt(st.nextToken());
	int grow[]=new int[n];
	Long answer=0L;
	st = new StringTokenizer(br.readLine());
	for(int i=0; i<n; i++) {
		answer+=Integer.parseInt(st.nextToken());
	}
	
	st = new StringTokenizer(br.readLine());
	for(int i=0; i<n; i++) {
		grow[i]=Integer.parseInt(st.nextToken());
	}
	
	Arrays.sort(grow);
	

	for(int i=0; i<n; i++) {
		answer=answer+grow[i]*i;
	}
	
	System.out.println(answer);
 }

}
