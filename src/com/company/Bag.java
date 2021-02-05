
/* A bag is a kind of set that is unordered, allows duplicates and can hold different types of data
'E' represents any type of data
* */
package com.company;
import java.util.HashMap;
import java.util.Map;

public class  Bag <E> {








        private Map<E, Integer> bag = new HashMap<E, Integer>();

        // add to bag

        public void addToBag(E element ){
            if (bag.containsKey(element)){
                //the element exists in the HashMap, and its value is increased by one and overwritten.
                bag.put(element,bag.get(element)+1);
            }else{
                // The very first occurrence of the element in the map
                bag.put(element,1);
            }
        }

        //remove element from the collection
        public void removeElement(E element){
            if(bag.containsKey(element)){
                int val = bag.get(element); // return value of element
                if(val ==1){
                    //only occurrence of a element in the bag
                    bag.remove(element);
                }else{
                    //reduce the occurrence of element in the bag by one
                    bag.put(element,val -1);
                }
            }
        }

        //remove all elements from collection
        public void clearElements(){
            bag.clear(); // resets the bag
        }


        //show Elements in bag
        public void showElementsInBag (){
            System.out.println(bag.keySet());

        }
    }












