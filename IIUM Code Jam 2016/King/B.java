import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class B {

	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			double u=Double.parseDouble(st.nextToken());
			double r=Double.parseDouble(st.nextToken());
			Double.parseDouble(st.nextToken());
			System.out.printf("%.8f\n",Math.sqrt(u*9.8*r));
		}
	}
}