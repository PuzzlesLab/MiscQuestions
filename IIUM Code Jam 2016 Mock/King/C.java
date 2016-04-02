import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	long value=1;
    	for (int i=0;i<n;i++) {
    		if (value<=Integer.MAX_VALUE) {
    			value*=Long.parseLong(br.readLine());
    		}
    	}
    	if (value>Integer.MAX_VALUE) {
    		System.out.println("No");
    	} else {
        	System.out.println("Yes");
    	}

    }
	
}