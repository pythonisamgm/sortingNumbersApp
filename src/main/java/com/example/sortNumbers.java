package com.example;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.*;

/**
 * Hello world!
 */
public class sortNumbers {


//bubbleAscending method
    static void bubbleAscendingSort(int numbersArray[], int n){
        int i, j, temp;
        boolean swapped; 
        for (i = 0; i < n-1; i++){
            swapped = false; 
            for (j = 0; j<n-i-1;j++){
                if (numbersArray[j] > numbersArray[j+1]){
                    temp = numbersArray[j];
                    numbersArray[j] = numbersArray[j+1];
                    numbersArray[j+1]=temp;
                    swapped = true; 
                }
            }
            if (swapped == false)
            break; 
        }

    }

//bubbleDescending method
    public static void main(String[] args){
        
        //input enter a list of numbers of your choice
        String userNumbersString = JOptionPane.showInputDialog( "Enter a list of numbers of your choice: ");
        System.out.println(userNumbersString);

        //select ascending or descending order
        String[] options = {"ascending", "descending"};
        
        int selection = JOptionPane.showOptionDialog(null, "Select one:", "Number Sort App", 0, 0, null, options, options[0]); 
        //selection devuelve 0 o 1
        System.out.println(selection);

        //change type from string to list of int. convertedNumbersArray is an object. Create a new integer list and pass each item from convertedNumbersArray, previously splitted, through a for loop, adding them as integers into a new array (convertedNumberList).
        String[] convertedNumbersArray = userNumbersString.split(",");
        int[] numbersArray = new int[convertedNumbersArray.length];
        
        for (int i = 0; i < convertedNumbersArray.length; i++) {
        numbersArray[i] = Integer.parseInt(convertedNumbersArray[i]);
    }
       int n = numbersArray.length; 

    }
        
        

        //if selection = 0. Call for ascending bubble

        //if (selection == 0);{



//if selection = 1. Call for descending bubble
//create a method to sort in ascending order using bubble sorting

//create a method too sort in descending order using bubble sorting

        
        } 
    
        
    }






//return sorted list 

//change number 4 for 3+1

