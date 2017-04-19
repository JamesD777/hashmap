/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author jcd4912
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] hashtable = new int[9];
        
    }
    public int[] hash(int[] a, int key){
        if(a[key%a.length] == 0)
            a[key%a.length] = key;
        else{
            
        }
    }
    public int[] resizeArray(int[] a, float amountFilled){
        int[] temp = a;
        if(amountFilled/a.length >= .5){
            a = new int[a.length*2];
            for(int i = 0; i < temp.length(); i++)
                if(temp[i] != null)
                    
        }
    }
    
}
