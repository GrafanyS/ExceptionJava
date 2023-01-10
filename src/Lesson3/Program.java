package Lesson3;

import java.io.IOException;

import Lesson3.base.classes.Presenter;
import Lesson3.base.classes.checkInputData.*;
import Lesson3.base.classes.parseData.CDataParseProcessor;
import Lesson3.base.classes.ui.CGetData;
import Lesson3.base.classes.workWithFile.CFileCreator;
import Lesson3.base.classes.workWithFile.CFileWriter;
import Lesson3.base.classes.workWithFile.CFindTheSameFileName;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/Lesson3/data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}
