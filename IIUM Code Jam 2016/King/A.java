import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		boolean [] flag=new boolean [128];
		flag['A']=true;
		flag['O']=true;
		flag['Y']=true;
		flag['E']=true;
		flag['U']=true;
		flag['I']=true;
		while ((s=br.readLine())!=null) {
			StringBuilder sb=new StringBuilder();
			s=s.toUpperCase();
			for (int i=0;i<s.length();i++) {
				if (!flag[s.charAt(i)]) {
					sb.append(".");
					sb.append(s.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}
	}
}