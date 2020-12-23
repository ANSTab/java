package com.tabachenko.task3;

class ArrayOperationImpl implements IArrayOperation {
     boolean pravda = false;
     public boolean equals(int[] a, int[] b) { // МЕТОД ПЕРЕВІРКА

         boolean pravda = false;
         int counter = 0; // лічильник
         int dovjMassA = a.length;
         int dovjMassB = b.length;

         for (int x = 0; x < a.length; x++) {
             for (int j = 0; j < b.length; j++) {
                 if (a[x] == b[j]) {
                     pravda = true;
                     counter++;
                 } else {
                     pravda = false;
                 }
             }
         }
         if (dovjMassA==counter&&dovjMassB==counter){
             return true;
         }else {
             return false;
         }
     }
     public int[] union(int[] a, int[] b) { //МЕТОД ЗЛИТТЯ
         int[] c = new int[a.length + b.length];
         int n = a.length;
         int m = b.length;
         for (int i = 0; i <= a.length; i++) {
             for (int k = 0; k <= a.length - 1; k++) {
                 int temp = 0;
                 temp = a[i];
                 a[i] = c[k];
                 c[k] = temp;
                 i++;
             }
         }
         for (int j = 0; j <= b.length; j++) {
             for (int k = a.length; k <= c.length - 1; k++) {
                 int temp1 = 0;
                 temp1 = b[j];
                 b[j] = c[n];
                 c[n] = temp1;
                 j++;
                 n++;
             }
         }
         return c;
     }
     public int[] subtract(int[] a, int[] b) { //Метод ЗБІГІВ
         // вираховуєм розмір массиву (лічильник збігів)
         int temp;
         int counter = 0; // лічильник
         for (int x = 0; x < a.length; x++) {
             for (int j = 0; j < b.length; j++) {
                 if (a[x] == b[j]) {
                     pravda = true;
                     counter++;
                 } else {
                     pravda = false;
                 }
             }
         }
         // массив збігів
         int[] res = new int[counter];
         for (int k = 0; k < res.length; k++) {
             for (int i = 0; i < a.length; i++) {
                 for (int j = 0; j < b.length; j++) {
                     if (a[i] == b[j]) {
                         pravda = true;
                         temp = b[j];
                         b[j] = res[k];
                         res[k] = temp;
                         k++;
                     } else {
                         pravda = false;
                     }
                 }
             }
         }
         return res;
     }
     public int[] intersect(int[] a, int[] b) { // МЕТОД РОЗХОДЖЕНЬ
         // вираховуєм розмір массиву (лічильник збігів)
         int temp;
         int counter = 0; // лічильник
         for (int x = 0; x < a.length; x++) {
             for (int j = 0; j < b.length; j++) {
                 if (a[x] != b[j]) {
                     pravda = true;
                     counter++;
                 } else {
                     pravda = false;
                 }
             }
         }
         // массив росходжень
         int[] res2 = new int[counter];
         for (int k = 0; k < res2.length; k++) {
             for (int i = 0; i < a.length-1; i++) {
                 for (int j = 0; j < b.length; j++) {
                     if (a[i] != b[j]) {
                         pravda = true;
                         temp = b[j];
                         b[j] = res2[k];
                         res2[k] = temp;
                         k++;
                         } else {
                         pravda = false;
                         i++;
                     }
                 }
             }
         } return res2;
     }
     public int[] deleteNull (int [] m, int [] p){
         int [] arr = intersect(m, p);
         int delCounter = 0;

         for (int i = 0;i<arr.length;i++){
             if (arr[i]!=0){
                 arr[delCounter++]=arr[i];
             }
             }
         int [] newArrayNoNull = new int [delCounter];
         System.arraycopy(arr,0,newArrayNoNull,0,delCounter);
         return newArrayNoNull;
     }
     public void printdeleteNull(int[] m,int[] p) {
         System.out.println();
         int[] deleteNullPrint = deleteNull(m,p);
         for (int i = 0; i < deleteNullPrint.length; i++) {
             System.out.print(deleteNullPrint[i]);
         }
     }
     public void printArraysUnion (int[] m,int[] p) {
         int[] unionPrint = union(m, p);
         for (int i = 0; i < unionPrint.length; i++) {
             System.out.print(unionPrint[i]);
         }
     }
     public void printArraysSubtract (int[] m,int[] p) {
         System.out.println();
         int[] subtractPrint = subtract(m, p);
         for (int i = 0; i < subtractPrint.length; i++) {
             System.out.print(subtractPrint[i]);
         }
     }
         public void printArraysIntersect (int[] m,int[] p) {
         System.out.println();
         int[] intersectPrint = intersect(m, p);
         for (int i = 0; i<intersectPrint.length;i++) {
             System.out.print(intersectPrint[i]);
         }
     }
     public void printArraysequals (int[] m,int[] p) {
         System.out.println(equals(m,p));

     }
     public void printSymmetricSubtract (int[] m,int[] p){
         System.out.println();
         int [] symmetricSubtractPrint = symmetricSubtract(m, p);
         for (int i = 0; i<symmetricSubtractPrint.length;i++) {
             System.out.print(symmetricSubtractPrint[i]);
         }
     }

     public int[] symmetricSubtract(int[] a, int[] b){

         int[] resOne = intersect(b, a);
         int[] resTwo = intersect(a, b);
         int [] oneTwo = union(resOne,resTwo);
         int delCounter = 0;

         for (int i = 0;i<oneTwo.length;i++){
             if (oneTwo[i]!=0){
                 oneTwo[delCounter++]=oneTwo[i];
             }
         }
         int [] newArrayNoNull = new int [delCounter];
         System.arraycopy(oneTwo,0,newArrayNoNull,0,delCounter);
         return newArrayNoNull;
     }
     }


