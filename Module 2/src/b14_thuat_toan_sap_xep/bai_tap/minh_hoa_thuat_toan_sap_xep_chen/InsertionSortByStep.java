package b14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            System.out.println("\n *** Sort "+i+", key value: "+key);
            int j = i - 1;
            while (j >= 0 && list[j] > key){
                System.out.println("Move value "+list[j]+" ahead!");
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
            System.out.println("Insert value "+key+" at position "+(j+1));
            System.out.println("Sub array after "+i+" sort:");
            for (int k = 0; k <= i;k++ ){
                System.out.print(list[k] + "\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
}
