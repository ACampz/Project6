/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

/**
 *
 * @author ac045
 */
public class Hash {

    //Arrays that hold data should be 2x as large to avoid collision
    
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //200 is the size of the array
     
        HashTableExample HTE = new HashTableExample(200);
        
                
        HTE.Add("Fred");
        HTE.Add("Loki");
        HTE.Add("Mississippi");
        HTE.Add("Coke");
        HTE.Add("Tristan");
        HTE.Add("Nutella");
        HTE.Add("FrenchToast");
        HTE.Add("BranCereal");
        
        HTE.PrintOut();
    }
    
}
