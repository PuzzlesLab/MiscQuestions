import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class E {
	public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	for (int i=0;i<n;i++) {
    		StringTokenizer st=new StringTokenizer(br.readLine());
    		BigInteger bi=new BigInteger(st.nextToken());
    		bi=bi.modPow(new BigInteger(st.nextToken()), BigInteger.valueOf(1000007));
    		System.out.println("Case #"+(i+1)+": "+bi.toString());
    	}
    }
	
}