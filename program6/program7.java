import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class program7 {

    //Bubble sort and selection sort using integers
    public static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length -1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void MyBubbleSort(int[] theArray) {
        int temp;

        for (int i = 0; i < theArray.length - 1; i++) {
            for (int j = i + 1; j < theArray.length; j++) {
                if (theArray[j] < theArray[i]) {
                    temp = theArray[i];
                    theArray[i] = theArray[j];
                    theArray[j] = temp;
                }
            }
        }
    }
    public static void selectionSortString(String[] array)
    {
        for (int i = 0; i < array.length -1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j].compareTo(array[minIndex]) < 0)
                    minIndex = j;
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void MyBubbleSortString(String[] theArray) {
        String temp;
        for (int i = 0; i < theArray.length - 1; i++) {
            for (int j = i + 1; j < theArray.length; j++) {
                if (theArray[j].compareTo(theArray[i]) > 0) {
                    temp = theArray[i];
                    theArray[i] = theArray[j];
                    theArray[j] = temp;
                }
            }
        }
    }
    public static void insertionSortInt(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public static void insertionSortString(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(temp) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) throws Exception {
        // two integer arrays for bubble and selection sort 1 array list for ints.
        int[] bubbleSortInt = new int[20000];
        int[] selectionSortInt = new int[20000];
        int[] insertionSortInt = new int[20000];
        ArrayList<Integer> arrayListInt = new ArrayList<>();

        //two String arrays for bubble and selection sort
        String[] bubbleSortStr = new String[10000];
        String[] selectionSortStr = new String[10000];
        String[] insertionSortStr = new String[10000];
        ArrayList<String> arrayListStr = new ArrayList<>();


        long billion = 1000000000;

        //Reading in Integers to the list
        try (BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\garre\\Downloads\\NumbersInFile.txt"))) {
            String line;
            int index = 0;

            //reading in the integer text file and filling the arrays
            while ((line = input.readLine()) != null) {
                int number = Integer.parseInt(line);
                bubbleSortInt[index] = number;
                selectionSortInt[index] = number;
                insertionSortInt[index] = number;
                arrayListInt.add(number);
                index++;
            }
            //input.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        //reading in Strings
        try (BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\garre\\Downloads\\StringsInFIle"))) {
            String line;
            int index = 0;

            //reading in the String text file and filling the arrays
            while ((line = input.readLine()) != null) {
                bubbleSortStr[index] = line;
                selectionSortStr[index] = line;
                insertionSortStr[index] = line;
                arrayListStr.add(line);
                index++;
            }
            input.close();
        }catch(IOException e){
            e.printStackTrace();
        }


        // timing the Integer arrays

        //selection sort Int time
        double SelectionSortStartTime = System.nanoTime();
        selectionSort(selectionSortInt);
        double SelectionSortEndTime = System.nanoTime();
        double selectionSortDifference = (SelectionSortEndTime - SelectionSortStartTime)/ billion;

        //bubble sort Int time
        double bubbleSortStartTime = System.nanoTime();
        MyBubbleSort(bubbleSortInt);
        double bubbleSortEndTime = System.nanoTime();
        double bubbleSortDifference = (bubbleSortEndTime - bubbleSortStartTime)/ billion;

        //insertion sort Int time
        double insertionSortIntStartTime = System.nanoTime();
        insertionSortInt(insertionSortInt);
        double insertionSortIntEndTime = System.nanoTime();
        double insertionsSortIntDifference = (insertionSortIntEndTime - insertionSortIntStartTime)/ billion;

        //Array list sorting Integer
        double arrayListStartTime = System.nanoTime();
        Collections.sort(arrayListInt);
        double arrayListEndTime = System.nanoTime();
        double arrayListDifference = (arrayListEndTime - arrayListStartTime)/billion;



        //timing the String arrays

        //selection sort String time
        double SelectionSortStartTimeStr = System.nanoTime();
        selectionSortString(selectionSortStr);
        double SelectionSortEndTimeStr = System.nanoTime();
        double selectionSortDifferenceStr = (SelectionSortEndTimeStr - SelectionSortStartTimeStr)/ billion;


        //bubble sort String time
        double bubbleSortStartTimeStr = System.nanoTime();
        MyBubbleSortString(bubbleSortStr);
        double bubbleSortEndTimeStr = System.nanoTime();
        double bubbleSortDifferenceStr = (bubbleSortEndTimeStr - bubbleSortStartTimeStr)/billion;

        //insertion sort String time
        double insertionSortStringStartTime = System.nanoTime();
        insertionSortString(insertionSortStr);
        double insertionSortStringEndTime = System.nanoTime();
        double insertionsSortStringDifference = (insertionSortStringEndTime - insertionSortStringStartTime)/ billion;


        //Array list sorting String
        double arrayListStrStartTime = System.nanoTime();
        Collections.sort(arrayListStr);
        double arrayListStrEndTime = System.nanoTime();
        double arrayListStrDifference = (arrayListStrEndTime - arrayListStrStartTime)/billion;


        try (BufferedWriter output = new BufferedWriter(new FileWriter("results.txt"))) {
            //print array for verification of sorting

            output.write(("Selection Sort Time for String with 10,000 characters: " + selectionSortDifferenceStr));
            output.newLine();
            output.write(("Bubble sort time for string with 10,000 characters: " + bubbleSortDifferenceStr));
            output.newLine();
            output.write(("Insertion Sort Time for String with 10,000 characters: " + insertionsSortStringDifference));
            output.newLine();
            output.write(("Array List Time for Strings with 10,000 characters: " + arrayListStrDifference));
            output.newLine();
            output.write("---------------------------------------------------------------------------");
            output.newLine();
            output.write(("Selection Sort Time for Integer with 20,000 characters: " + selectionSortDifference));
            output.newLine();
            output.write(("Bubble sort time for Integer with 20,000 characters: " + bubbleSortDifference));
            output.newLine();
            output.write(("Insertion Sort Time for Integer with 20,000 characters: " + insertionsSortIntDifference));
            output.newLine();
            output.write(("Array List Sort Time for Integer with 20,000 characters: " + arrayListDifference));


            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}

