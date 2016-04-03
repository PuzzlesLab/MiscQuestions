import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class E {
	
	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int l1=Integer.parseInt(st.nextToken());
			int l2=Integer.parseInt(st.nextToken());
			int root1=(int)Math.floor(Math.pow(l1,0.3333333));
			int root2=(int)Math.ceil(Math.pow(l2,0.3333333));
			
			int count=0;
			for (int i=root1;i<=root2;i++) {
				if (i*i*i>=l1 && i*i*i<=l2) {
					count++;
				}
			}
			System.out.println("Case #"+testCase+": "+count);
		}
	}
}