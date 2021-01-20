/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortmasive;

/**
 *
 * @author Gurar
 */
public class SortMasive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] masyvas = {15,42,15,98,-2,-47,10,3,-14,36};
        int n;
        
        
        //Buble sort Didejimo tvarka
        System.out.println("Didejimo tvarka");
        for(int i = 0; i < masyvas.length; i++) {
            for(int j = i + 1; j < masyvas.length - 1; j++) {
                if(masyvas[i] > masyvas[j]) {
                    n = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = n;
                }
            }
            System.out.print(masyvas[i] + " ");
        }
        
        
        System.out.println();
        
        //Buble sort Mazejimo tvarka
        System.out.println("Mazejimo tvarka");
        for(int i = 0; i < masyvas.length; i++) {
            for(int j = i + 1; j < masyvas.length - 1; j++) {
                if(masyvas[i] < masyvas[j]) {
                    n = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = n;
                }
            }
            System.out.print(masyvas[i] + " ");
        }
        System.out.println();
    }
    
}
