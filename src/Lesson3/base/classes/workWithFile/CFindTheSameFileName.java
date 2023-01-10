package Lesson3.base.classes.workWithFile;

import java.io.File;

import Lesson3.base.abstractClasses.AFindTheSameFileName;

public class CFindTheSameFileName extends AFindTheSameFileName {


    @Override
    public boolean findTheSameFileName(String lastName, String folderName) {
        super.folder = new File(folderName);
        boolean found = false;

        for(File file: this.folder.listFiles()){
            String fileName = file.getName().split("\\.")[0];

            if(fileName.equals(lastName)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
