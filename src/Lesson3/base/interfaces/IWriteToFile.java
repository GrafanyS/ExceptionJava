package Lesson3.base.interfaces;

import Lesson3.base.exceptions.MyFileCreateException;
import Lesson3.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    void writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
