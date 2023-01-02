package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2606_바이러스 {

	static int n,con;
	static int[][] map;
	static boolean[] visit;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		con=Integer.parseInt(st.nextToken());
		
		map=new int[n+1][n+1];
		visit=new boolean[n+1];
		for(int i=0; i<con; i++) {
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			map[a][b]=1;
			map[b][a]=1;
		}
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		bfs();
	}
	static void bfs() {
		Queue<Integer> queue=new ArrayDeque();
		queue.add(1);
		visit[1]=true;
		int count=0;
		while(!queue.isEmpty()) {
			int temp=queue.poll();//큐에서 하나 뺴기
//			System.out.println(temp);
			for(int i=1; i<=n; i++) {
				if(visit[i]==false && map[temp][i]==1) {
					queue.add(i);
					visit[i]=true;
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
