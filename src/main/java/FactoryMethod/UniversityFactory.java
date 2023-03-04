package FactoryMethod;

import FactoryMethod.Diploma.*;
import FactoryMethod.StudentBook.ElectronikStudentBook;
import FactoryMethod.StudentBook.PaperStudentBook;
import FactoryMethod.StudentBook.StudentBook;
import FactoryMethod.StudentBook.StudentBookEnum;
import FactoryMethod.StudentID.ElectronikStudentID;
import FactoryMethod.StudentID.PaperStudentID;
import FactoryMethod.StudentID.StudentID;
import FactoryMethod.StudentID.StudentIDEnum;

public class UniversityFactory {
    private Diploma diploma;
    private StudentBook studentBook;
    private StudentID studentID;

    public UniversityFactory(DiplomaEnum diplomaType) {
        switch (diplomaType) {
            case UNDERGRADUATE:
                diploma = new Undergraduate();
                break;
            case SPECIALITY:
                diploma = new Specialty();
                break;
            case MASTER_DEGREE:
                diploma = new MasterDegree();
                break;
            default:
                diploma = new Diploma() {
                    @Override
                    public void deliveryDiploma() {
                        System.out.println("Такой вид диплома отсутствует");
                    }
                };
        }
    }

    public UniversityFactory(StudentBookEnum studentBookType) {
        switch (studentBookType) {
            case PAPER:
                studentBook = new PaperStudentBook();
                break;
            case ELECTRONIC:
                studentBook = new ElectronikStudentBook();
                break;
            default:
                studentBook = new StudentBook() {
                    @Override
                    public void deliveryStudentBook() {
                        System.out.println("Такой вид диплома отсутствует");
                    }
                };
        }
    }

    public UniversityFactory(StudentIDEnum studentIdType) {
        switch (studentIdType) {
            case PAPER:
                studentID = new PaperStudentID();
                break;
            case ELECTRONIC:
                studentID = new ElectronikStudentID();
                break;
            default:
                studentID = new StudentID() {
                    @Override
                    public void deliveryStudentID() {
                        System.out.println("Такой вид диплома отсутствует");
                    }
                };
        }
    }

    public Diploma getDiploma(){
        return diploma;
    }

    public StudentBook getStudentBook(){
        return studentBook;
    }

    public StudentID getStudentID(){
        return studentID;
    }
}
