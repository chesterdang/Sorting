/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author danhv
 */
public class SortingProgramming extends Menu<String> {
    static String[] sortChoice = {"1. Bubble sort", "2. Quick sort", "3. Exit"};
    protected Library lib;
    protected Algorithm al;
    protected int[] array;
    protected int sizeOfArray;
    
    public SortingProgramming (Element element) {
        super("SORTING PROGRAMME", sortChoice);
        lib = new Library();
        al = new Algorithm();
        array = element.getArr();
        sizeOfArray = element.getSizeOfArr();
    }

    @Override
    public void execute(int n) {
       
        switch (n) {
            case 1: 
                System.out.print("Unsorted array: ");
                lib.displayArr(array);
                al.bubbleSort(array);
                System.out.print("Sorted array: ");
                lib.displayArr(array);
                break;
            case 2: 
                System.out.print("Unsorted array: ");
                lib.displayArr(array);
                al.quickSort(array, 0, sizeOfArray-1);
                System.out.println("Sorted array: ");
                lib.displayArr(array);
                break;
            case 3: 
                System.exit(0);
        }
    }
    
    
}
