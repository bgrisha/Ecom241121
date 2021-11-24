package com.company;

public class Main241121A {
    public static void main(String[] args) {
        System.out.print("print biggestNumber= ");
        System.out.println(checkHiherNumber(1.5f,2.3f,1.4f));

         int arr[]={15,10,5};
        System.out.print("avg is = ");
        System.out.println(avg(arr));

        int arr1[]={15,10,5,3,1};
        int arr2[]={15,10,5,4};

        System.out.println(arrayWithLargerSize(arr1,arr2));

    }


    public static  float  checkHiherNumber(float a,float b,float c){
        return Math.max(Math.max(a,b),c);
    }
    public static double avg(int[]array){
        int sum=0;
        double average=0;
        for (int i = 0; i <array.length ; i++) {
             sum+=array[i];
        }average=sum/array.length;
        return average;
    }
    public static  String arrayWithLargerSize(int[]array1,int[]array2){
        if (array1.length>array2.length){
            return  "first array largest";
        }else {
            return "second array largest";
        }
    }
}
