package Lesson3.base.classes.checkInputData;

import Lesson3.base.abstractClasses.ACheckFullName;
import Lesson3.base.exceptions.FullNameContainsDigitException;
import Lesson3.base.exceptions.FullNameEmptyValueException;

// Полное имя проверка
public class CCheckFullName extends ACheckFullName {

    @Override
    public void checkFullName(String[] fullName) {

        for (String s : fullName) {
            if (s.length() == 0)
                throw new FullNameEmptyValueException();
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j)))
                    throw new FullNameContainsDigitException();
            }
        }
    }
}
