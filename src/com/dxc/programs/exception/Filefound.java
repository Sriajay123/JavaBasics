package com.dxc.programs.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filefound {
    public static void main(String[] args) {
         try {
            File f = new File("c://dxc.txt");
            FileReader freader = new FileReader(f);
        }
        catch(FileNotFoundException Fe){
            System.out.println("file not found");
        }
    }
}
