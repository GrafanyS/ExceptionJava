package Lesson3.base.abstractClasses;

import java.io.FileWriter;

import Lesson3.base.classes.workWithFile.CFileCreator;
import Lesson3.base.classes.workWithFile.CFindTheSameFileName;
import Lesson3.base.interfaces.IWriteToFile;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
