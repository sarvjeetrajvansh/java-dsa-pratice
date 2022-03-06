package com.sarvjeet.ArrayList;

import java.util.ArrayList;

public class ArrayListPlay {
    public  static  ArrayList deleteElement(ArrayList arr, int s, int e){

        for(int i = s; i<e;i++) {
            arr.remove(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =1; i<=10;i++){
            // Add into arrayList
            arrayList.add(i);
        }

        for(int i =0; i<arrayList.size();i++){
            //iterate throughArrayList
            System.out.print(arrayList.get(i)+ " ");
        }
        // remove element from start end point;
        // System.out.println(deleteElement(arrayList,2,5));
        //reverse into new array
        ArrayList<Integer> reverseArrayList = new ArrayList<>();
        for (int i = arrayList.size() -1; i>=0; i--){
            reverseArrayList.add(arrayList.get(i));
        }
        System.out.println(reverseArrayList);


    }
}
