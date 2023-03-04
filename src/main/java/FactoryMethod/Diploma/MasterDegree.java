package FactoryMethod.Diploma;

import FactoryMethod.Diploma.Diploma;

public class MasterDegree implements Diploma {
    @Override
    public void deliveryDiploma(){
        System.out.println("Выдаём диплом Магистра");
    }
}
