/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationarraytest;

import java.util.Arrays;

/**
 *
 * @author oz
 */
public class MyArray {
    
    private int [] items;
    private int count=0;
    
    public MyArray(int size){
        items = new int[size];
    }
    
    public void insert(int item){
        // check if it is full ?
        
        resizer();
        
        items[count++]=item;
        
    }
    
    
    private void resizer(){
        if(items.length ==count){
            int[] newItems= new int[count*2];
            for(int i=0;i<count;i++)
                newItems[i]=items[i];
                            items=newItems;

                                
        }
    }
    
    
    
    
    public void removeAt(int index){
        //validate first
        // sifht  the items to left to fill  the hole 
        // like SafaTrakyaliAmaRakiIcmiyor=[10,20,30,40]
        //delete index[1]
        // 1<-2
        //2<-3
        if(index<0 || index>=count)
            throw new IllegalArgumentException();
        for(int i=index; i<count;i++)
            items[i]=items[i+1];
            
        count--;
        
    }
    
    // If we find return index
    // otherwise return -1
    public int indexOf(int item) {
    for (int i = 0; i < count; i++)
      if (items[i] == item)
        return i;

    return -1;
  }
    
     @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }

    
}
