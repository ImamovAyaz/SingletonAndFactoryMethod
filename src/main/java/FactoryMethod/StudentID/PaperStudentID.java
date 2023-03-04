package FactoryMethod.StudentID;

import FactoryMethod.StudentBook.StudentBook;

public class PaperStudentID implements StudentID {
    @Override
    public void deliveryStudentID() {
        System.out.println("Выдаём бумажный студенческий билет");
    }
}
