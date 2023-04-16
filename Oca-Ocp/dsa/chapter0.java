package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class chapter0 {
private List list;
//private ListNode ksd;

    public chapter0() {
        list = new LinkedList();
//        list = new ArrayList();
    }


    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    //swap the elements at index i and j
    public void swap(int[] array, int current, int next){
        int temp = array[current];
        array[current] = array[next];
        array[next] = temp;
    }

    public int findTheLowestIndex(int[] array, int start){
        int lowIndex = start;
        for (int i = start ;  i< array.length ; i++)
            if (array[i] < array[start])
                lowIndex= i;
        return lowIndex;
    }

    public void selectionSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int theLowestIndex = findTheLowestIndex(array, i);
            swap(array, i, theLowestIndex);

        }
    }

    public static void rightShifts(int[] array, int rightShifts){
        int[] temp = new int[array.length];
        for (int i = 0 ; i < array.length ; i++) {
            int newPosition = (i+rightShifts)% array.length;
            temp[newPosition] = array[i];
        }
        
    }


    public static void main(String[] args) {
        chapter0 chapter0 = new chapter0();
        List<String> list1 = chapter0.getList();
        list1.add("tttt");
        list1.add("tttt");
        list1.add("tttt");
        for (String s: list1) {
            System.out.println("s = " + s);
        }
        System.out.println(list1);
    }
}