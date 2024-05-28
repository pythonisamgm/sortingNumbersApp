package com.example;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.*;

/**
 * Hello world!
 */
public class sortNumbers {

    static void bubbleAscendingSort(int convertedNumbersList[], int n){

    }
    public static void main(String[] args){
        
        //input enter a list of numbers of your choice
        String userNumbersString = JOptionPane.showInputDialog( "Enter a list of numbers of your choice: ");
        System.out.println(userNumbersString);

        //select ascending or descending order
        String[] options = {"ascending", "descending"};
        
        int selection = JOptionPane.showOptionDialog(null, "Select one:", "Number Sort App", 0, 0, null, options, options[0]); 
        //selection devuelve 0 o 1
        System.out.println(selection);

        //change type from string to list of int. convertedNumbersArray is an object. Create a new integer list and pass each item from convertedNumbersArray, previously splitted, through a for loop, adding them as integers into a new list (convertedNumberList).
        String[] convertedNumbersArray = userNumbersString.split(",");
        List<Integer> convertedNumbersList = new ArrayList <Integer>();
        System.out.println("convertedArray" + convertedNumbersArray);
        for (String number: convertedNumbersArray) {
            convertedNumbersList.add(Integer.parseInt(number.trim()));}

        System.out.println(convertedNumbersList);
        int n = convertedNumbersList.size();

        //if selection = 0. Call for ascending bubble

        //if (selection == 0);{



//if selection = 1. Call for descending bubble
//create a method to sort in ascending order using bubble sorting

//create a method too sort in descending order using bubble sorting

        
        } 
    
        
    }






//return sorted list 

//change number 4 for 3+1

