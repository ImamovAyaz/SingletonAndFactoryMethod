package FactoryMethod;

import FactoryMethod.Diploma.DiplomaEnum;
import FactoryMethod.StudentBook.StudentBookEnum;
import FactoryMethod.StudentID.StudentIDEnum;

public class DeliveryDocuments {
    public static void main(String[] args) {
        UniversityFactory studentID = new UniversityFactory(StudentIDEnum.PAPER);
        studentID.getStudentID().deliveryStudentID();

        UniversityFactory studentBook = new UniversityFactory(StudentBookEnum.PAPER);
        studentBook.getStudentBook().deliveryStudentBook();

        UniversityFactory diploma = new UniversityFactory(DiplomaEnum.UNDERGRADUATE);
        diploma.getDiploma().deliveryDiploma();
    }
}
