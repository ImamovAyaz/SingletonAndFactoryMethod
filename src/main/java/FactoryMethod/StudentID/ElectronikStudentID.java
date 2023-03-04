package FactoryMethod.StudentID;

import FactoryMethod.StudentBook.StudentBook;

public class ElectronikStudentID implements StudentID {
    @Override
    public void deliveryStudentID() {
        System.out.println("Выдаём электронный студенческий билет");
    }
}
