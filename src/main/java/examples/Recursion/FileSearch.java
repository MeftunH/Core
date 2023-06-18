package main.java.examples.Recursion;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.io.File;

public class FileSearch {
    public static boolean searchForFile(File directory, String fileName) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        if (searchForFile(file, fileName)) {
                            return true;
                        }
                    } else if (file.getName().equals(fileName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
