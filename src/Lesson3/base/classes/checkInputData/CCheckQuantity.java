package Lesson3.base.classes.checkInputData;

import Lesson3.base.abstractClasses.ACheckQuantity;
import Lesson3.base.exceptions.CheckQuantityException;

// проверка количества
public class CCheckQuantity extends ACheckQuantity {
    @Override
    public void checkQuantity(String[] data) {
        if(data.length!=6)
            throw new CheckQuantityException();
    }
}
