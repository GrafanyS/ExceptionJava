package Lesson3.base.interfaces;

// import java.io.IOException;

import Lesson3.base.exceptions.FileCreateException;

// интерфейс создания файла
public interface ICreateFile {
    void createFile(String path) throws FileCreateException;
}
