package com.aapeli.springpattern.derekalgo;

import java.awt.image.ImageProducer;
import java.util.*;

/**
 * @author jamesoladimeji
 * @created 02/02/2022 - 11:56 AM
 * @project IntelliJ IDEA
 */
public class HashtableFunction {


    String[] hashArray;
    int size;
    int itemInArray;

    static Hashtable<Character, Integer> map = new Hashtable<>();




    public static void main(String[] args) {
        String[] elemeToAdd = {"1", "2", "4", "6", "7", "100", "34", "22", "44",
                "77","1", "2", "4", "6", "7", "100", "34", "22", "44", "77", "77","1", "2", "4", "6", "7", "100", "34", "22", "44"};
        //HashtableFunction hashtableFunction = new HashtableFunction(30);
       // hashtableFunction.hashFunction2(elemeToAdd, hashtableFunction.hashArray);

       // hashtableFunction.displayHash();

        //  Set

       /* for(Map.Entry<Character, Integer> entry: map.entrySet()) {
           int value = map.containsKey();
           List<Integer> ages = new ArrayList<>();
           ages.clear();


        }*/

        String sr = new String("ioo".toCharArray());
        System.out.println(sr);

       // System.out.println(hashtableFunction.findKey("100"));
    }

    public boolean isPrime(int number) {
        if(number % 2 == 0) return false;
        for(int i = 3; i * i < number; i+= 2) {
            if(number% 2==0) return false;
        }
        return true;
    }

    public int getNextPrime(int minNumber) {
        for(int i = minNumber; true; i++) {
            if(isPrime(i)) return i;
        }
    }

    public void displayHash() {
        for(int n = 0; n < hashArray.length; n++) {
            System.out.println(n +"\t - \t"+ hashArray[n]);
        }
    }

    public String findKey(String key) {
        int index = Integer.parseInt(key) % (size - 1);
        while (hashArray[index] != "-1") {
            if(hashArray[index] == key) {
                System.out.println("Found at index: "+ index);
                return hashArray[index];
            }
            ++index;
            index %= size;
        }

        return null;
    }


    public void hashFunction2(String[] elementToAdd, String[] hashedArray) {
        for(int n = 0; n < elementToAdd.length; n++) {
            String newElement = elementToAdd[n];
           // hashedArray[Integer.parseInt(newElement)] = newElement;
            int arrayIndex = Integer.parseInt(newElement) % (size-1);

            while (hashedArray[arrayIndex] != "-1") {
                //collision try to occur
                arrayIndex++;

                System.out.println("Collion trying to occur, try "+ arrayIndex +" instead");

                arrayIndex %= size;
            }

            //if you got here, it means you have found. empty index
            hashedArray[arrayIndex] = newElement;

        }
    }


    public void hashFunction1(String[] elementToAdd, String[] hashedArray) {
        for(int n = 0; n < elementToAdd.length; n++) {
            String newElement = elementToAdd[n];
            hashedArray[Integer.parseInt(newElement)] = newElement;
        }
    }

    public HashtableFunction(int size) {
        this.size = size;
        hashArray = new String[size];
        //uninitialization, fill empty array with -1
        Arrays.fill(hashArray, "-1");
    }


}
