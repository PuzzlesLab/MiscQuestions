/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speed.limit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author khooi
 */
public class SpeedLimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        final double g = 9.8;
        
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s;
            int n = Integer.parseInt(br.readLine());
            int i =0;
            while(i<n){
                s=br.readLine();
                StringTokenizer st=new StringTokenizer(s);
                double fCoeff=Double.parseDouble(st.nextToken());
                double rad=Double.parseDouble(st.nextToken());
                double mass=Double.parseDouble(st.nextToken());
                double v = Math.sqrt(fCoeff*g*rad);
                System.out.printf("%.8f\n",v);
//                String x = v+"";
//                String w="";
//                for(int j=0;j<8;j++){
//                    w+=x.charAt(i);
//                }
//                System.out.println(w);
//                x="";
                i++;
            }
        }catch(NoSuchElementException e){
        }
        
        // TODO code application logic here
    }
    
}
