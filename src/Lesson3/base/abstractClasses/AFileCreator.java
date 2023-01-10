package Lesson3.base.abstractClasses;

import java.io.File;

import Lesson3.base.interfaces.ICreateFile;

public abstract class AFileCreator implements ICreateFile {
    protected File file;
}
