import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class D {

	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for (int i=1;i<=n;i++) {
			sb.append(i);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}