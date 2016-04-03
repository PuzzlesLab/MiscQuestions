/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.managment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author khooi
 */
public class TaskManagment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n =Integer.parseInt(br.readLine());
            int j =1;
            while(j<=n){
                
                String s=br.readLine();
                StringTokenizer st = new StringTokenizer(s);

                int intendedTask = Integer.parseInt(st.nextToken());
                int maxTask = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                s = br.readLine();
                StringTokenizer st2 = new StringTokenizer(s);
                int taskCost [] = new int[intendedTask];
                for(int i=0;i<taskCost.length;i++){
                    taskCost[i]=Integer.parseInt(st2.nextToken());
                }
                
                int tempSum=0;
                int tempTask=0;
                for(int i=0;i<taskCost.length;i++){
                    tempSum+=taskCost[i];
                    tempTask++;
                    if(tempSum>cost){
                        tempSum-=taskCost[i];
                        tempTask--;
                        break;
                    }
                    if(tempTask>maxTask){
                        tempSum-=taskCost[i];
                        tempTask--;
                        break;
                    }
                }
                System.out.println("Case "+j+": "+tempTask);
                j++;
                
                
                
            }
            
            
            
            
            
        }catch(NoSuchElementException e){
        }
        
        // TODO code application logic here
    }
    
}
