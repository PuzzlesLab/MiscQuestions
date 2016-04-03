/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

/**
 *
 * @author khooi
 */
public class TalalAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s;
            String z="";
            while ((s=br.readLine())!=null) {
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'){
                        z+="";
                    }
                    else if(s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='Y'){
                        z+="";
                    }
                    else{
                        z+="."+s.charAt(i);
                    }
                }
                System.out.println(z.toUpperCase());
                z="";
            }
            
        }catch(NoSuchElementException e){
        }
        
        // TODO code application logic here
    }
    
}
