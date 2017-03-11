import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			char [] c=br.readLine().toCharArray();
			int count=0;
			for (int i=0;i<c.length && count>=0;i++)
				if (c[i]=='(') count++;
				else if (c[i]==')') count--;
			
			if (count==0) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	
}