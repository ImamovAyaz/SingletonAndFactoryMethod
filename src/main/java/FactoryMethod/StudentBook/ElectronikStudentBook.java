package FactoryMethod.StudentBook;

import FactoryMethod.StudentBook.StudentBook;

public class ElectronikStudentBook implements StudentBook {
    @Override
    public void deliveryStudentBook(){
        System.out.println("Выдаём электронную зачётную книжку");
    }
}
