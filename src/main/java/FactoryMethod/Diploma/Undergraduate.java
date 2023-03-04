package FactoryMethod.Diploma;

import FactoryMethod.Diploma.Diploma;

public class Undergraduate implements Diploma {
    @Override
    public void deliveryDiploma(){
        System.out.println("Выдаём диплом Бакалавра");
    }
}
