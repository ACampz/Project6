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

 
public class HashTableExample
{
    public String out;
    public int hashValue;
    public int finalPos;
    private String [] hashTable;
    
    private int mySize;
    
    public HashTableExample( int size)
    {
        hashTable  = new String [size];
        mySize = size;
    }
    
    public int Find(String input)
    {
        int answer = -1;
        int hashValue = Math.abs(input.hashCode());
        int finalPos = hashValue % mySize;
        if(hashTable[finalPos] != null)
        {
            answer = finalPos;
        }
        return answer;
    }
    
    public boolean Add(String input)
    {
        //no collision solution in place
        //new value will overwrite old
        boolean answer = true;
        hashValue = input.hashCode();
        hashValue = Math.abs(hashValue);
        finalPos = hashValue%mySize;
        
        if (hashTable[finalPos] == null || input.compareTo(hashTable[finalPos]) == 0)
            hashTable[finalPos] = input;
        else
            answer=false;
        //solves for its hash value, inserts into array at calculated spot, adds string to array
        out += "... " + hashTable[finalPos] + ": Hash Value " + hashValue + "; Final Position " + finalPos + " ";        
        
        //System.out.println(hashTable[finalPos] + ": Hash Value " + hashValue + "; Final Position " + finalPos + "; ");
        return answer;
    }
    
    public String Print()
    {
        
        return out;
    }
    
    public void PrintOut()
    {
        for(int i = 0; i<mySize; i ++)
        {
            //prints array
            //nulls are empty spots in array
            //values will be replaced
            System.out.println(hashTable[i]);
        }
    }
    
}
