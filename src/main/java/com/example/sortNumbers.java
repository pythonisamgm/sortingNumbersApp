package com.example;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Hello world!
 */
public class sortNumbers {
    public static void main(String[] args){
        
        //input enter a list of numbers of your choice
        String userNumbersString = JOptionPane.showInputDialog( "Enter a list of numbers of your choice: ");
        System.out.println(userNumbersString);

        //select ascending or descending order
        String[] options = {"ascending", "descending"};
        
        int selection = JOptionPane.showOptionDialog(null, "Select one:", "Number Sort App", 0, 0, null, options, options[0]); 
        //selection devuelve 0 o 1
        System.out.println(selection);

        //change type from string to list of int
        String[] convertedNumbersArray = userNumbersString.split(",");
        List<Integer> convertedNumbersList = new ArrayList <Integer>();
        for (String number: convertedNumbersArray) {
            convertedNumbersList.add(Integer.parseInt(number.trim()));
        } 
    
        
    }




//if selection = options[0]. Sort in ascending order. Using bubble sorting


//if selection = options[1]. Sort in descending order using bubble sorting

//return sorted list

//change number 4 for 3+1
}
