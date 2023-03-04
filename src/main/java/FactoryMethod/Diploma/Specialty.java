package FactoryMethod.Diploma;

import FactoryMethod.Diploma.Diploma;

public class Specialty implements Diploma {
    @Override
    public void deliveryDiploma(){
        System.out.println("Выдаём диплом Специалиста");
    }
}
