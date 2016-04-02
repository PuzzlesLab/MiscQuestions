import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class D {
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	HashMap<String,Boolean> map=new HashMap<String,Boolean>();
    	for (int i=0;i<n;i++) {
    		map.put(br.readLine(), true);
    	}
    	n=Integer.parseInt(br.readLine());
    	for (int i=0;i<n;i++) {
    		if (map.get(br.readLine())==null) {
    			System.out.println("Out");
    		} else {
    			System.out.println("In");
    		}
    	}
    }
	
}