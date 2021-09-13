import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	public static int[][] Apt = new int[15][15];
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y - x;
			int max = (int)Math.sqrt(distance);
			
			if(max == Math.sqrt(distance)) {
				sb.append(max * 2 - 1).append('\n');
			}else if(distance <= max * max + max) {
				sb.append(max * 2).append('\n');
			}else {
				sb.append(max * 2 + 1).append('\n');
			}
		}
		
	
		System.out.println(sb);
	}
	
}



