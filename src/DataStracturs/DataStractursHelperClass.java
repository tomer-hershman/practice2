package DataStracturs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataStractursHelperClass<T, wildcard> {
    public static void printMultipliersOfTen(List<Double> list) {
        for (Double item : list) {
            if (item % 10 == 0) {
                System.out.println(item);
            }
        }
    }

    public static boolean isIntInList(ArrayList<Double> list, double number) {
        boolean isInList = false;
        for (Double item : list) {
            if (item == number) {
                isInList = true;
            }
        }
        return isInList;
    }

    public static HashMap<Character, Integer> indexesOfTheEnglishAlphabet = new HashMap<>();

    public static void indexesOfTheEnglishAlphabet() {
        String theEnglishAlphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 1; i < theEnglishAlphabet.length() + 1; i++) {
            indexesOfTheEnglishAlphabet.put(theEnglishAlphabet.charAt(i), i);
        }
    }

    //sort list
    public static ArrayList<ArrayList<Integer>> listSpliter(List<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() / 2) {
                list1.add(list.get(i));
            } else {
                list2.add(list.get(i));
            }
        }
        ArrayList<Integer> listOfLists[] = new ArrayList<>[]();
        return listOfLists;
    }
    public static int[] sortedListMerger(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                mergedList[k] = list1[i];
                i++;
                k++;
            } else {
                mergedList[k] = list2[j];
                j++;
                k++;
            }
        }
        while (i < list1.length) {
            mergedList[k] = list1[i];
            i++;
            k++;
        }
        while (j < list2.length) {
            mergedList[k] = list2[j];
            j++;
            k++;
        }
        return mergedList;
    }
    public static int[] listSorter ( int[] list){
        int[][] splittedList = listSpliter(list);
        int[] sortedList1 = splittedList[0];
        int[] sortedList2 = splittedList[1];
        if (list.length > 1) {
            sortedList1 = listSorter(sortedList1);
            sortedList2 = listSorter(sortedList2);
        }
        int[] sortedList = sortedListMerger(sortedList1, sortedList2);
        return sortedList;
    }

}