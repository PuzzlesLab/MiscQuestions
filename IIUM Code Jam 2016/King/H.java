import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class H {
	
	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int [] costs=new int [Integer.parseInt(st.nextToken())];
			int maxTasks=Integer.parseInt(st.nextToken());
			int currCost=Integer.parseInt(st.nextToken());
			int count=0;
			
			st=new StringTokenizer(br.readLine());
			for (int i=0;i<costs.length;i++) {
				costs[i]=Integer.parseInt(st.nextToken());
			}
			
			for (int i=0;i<costs.length;i++) {
				if (currCost>=costs[i]) {
					currCost-=costs[i];
					count++;
				} else {
					break;
				}
			}
			System.out.println("Case "+testCase+": "+Math.min(maxTasks, count));
		}
	}
}