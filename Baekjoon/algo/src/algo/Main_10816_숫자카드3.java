package algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_10816_숫자카드3{

	static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		
		HashMap<Integer,Integer> map=new HashMap<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			int n=Integer.parseInt(st.nextToken());
			boolean isKeyExists = map.containsKey(n);
			if(isKeyExists==true) {
				map.put(n,map.get(n)+1);
			}//키 존재하면
			else {
				map.put(n,1);
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int n2=Integer.parseInt(st.nextToken());;
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n2; i++) {
			int num=Integer.parseInt(st.nextToken());
			boolean isKey = map.containsKey(num);
			if(isKey==true) {//있으면
				sb.append(map.get(num)+" ");
//				System.out.printf("%d ",map.get(num));
			}//키 존재하면
			else {
				sb.append(0+" ");
			}
			
			
		}
		System.out.println(sb);
		
		
		
	}

}
