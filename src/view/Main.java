/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import common.Library;
import controller.SortingProgramming;
import model.Element;

/**
 *
 * @author danhv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library lib = new Library();
        Element e = new Element();
        
        e.setSizeOfArr(lib.getInt("Enter size of array: ", 0, 100));
        e.setArr(lib.createArr(e.getSizeOfArr()));
        new SortingProgramming(e).run();
    }
    
}
