package Lesson3.base.classes.workWithFile;

import java.io.File;
import java.io.IOException;

import Lesson3.base.abstractClasses.AFileCreator;
import Lesson3.base.exceptions.FileCreateException;

public class CFileCreator extends AFileCreator {
    /**
     * Создает новый файл по указанному пути.
     * @param path - путь плюс имя файла и расширение.
     * @return - возвращает true в случае удачного создания.
     */
    @Override
    public boolean createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            return super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }
    }
}
