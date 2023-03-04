package FactoryMethod.StudentBook;

import FactoryMethod.StudentBook.StudentBook;

public class PaperStudentBook implements StudentBook {
    @Override
    public void deliveryStudentBook(){
        System.out.println("Выдаём бумажную зачётную книжку");
    }
}
