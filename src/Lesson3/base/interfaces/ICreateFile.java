package Lesson3.base.interfaces;

// import java.io.IOException;

import Lesson3.base.exceptions.FileCreateException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
