# Java II: Number Sort App

This is a Java program that allows users to enter a list of numbers, which it then sorts in either ascending or descending order using the Bubble Sort algorithm. The sorted list is then displayed to the user via a dialog box. Additionally, the program replaces the number "4" with "(3+1)" due to cultural reasons.

## Features

- Enter a list of numbers.
- Choose to sort the list in ascending or descending order.
- Display the sorted list using a dialog box.
- Replace occurrences of the number "4" with "(3+1)".


## Requirements

- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor to run the Java program.
- Swing library (included in JDK) for dialog boxes.

## ## Code Overview

### Main Class: `sortNumbers`

#### Methods

- `public static void bubbleAscSort(int numbersArray[], int n)`
  - Sorts the array in ascending order using the Bubble Sort algorithm.

- `public static void bubbleDescSort(int numbersArray[], int n)`
  - Sorts the array in descending order using the Bubble Sort algorithm.


#### Main Method

1. **Input:**
   - Prompts the user to enter a list of numbers separated by commas.

2. **Option Selection:**
   - Prompts the user to choose between ascending and descending order.

3. **Array Conversion:**
   - Converts the input string into an integer array.

4. **Sorting:**
   - Calls the appropriate sorting method based on the user's selection.

5. **Display:**
   - Creates a StringBuilder object to pass each item from the numbersArray to convert it to string.
   - Replaces occurrences of the number "4" with "(3+1)".
   - Displays the sorted list using a dialog box.


