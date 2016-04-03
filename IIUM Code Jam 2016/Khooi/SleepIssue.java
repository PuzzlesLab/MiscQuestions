

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author khooi
 */
public class SleepIssue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int i=1;
            while(i<=N){
                System.out.println(i);
                i++;
            }
            
        }catch(NoSuchElementException e){
        }
        // TODO code application logic here
    }
    
}
