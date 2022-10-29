package ru.miit.lab4validate;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


public class Lab4Start {

    public static void main(String args[]) throws Exception {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        try {
            Train train = new Train();
            train.setNomTR("222344");
            train.setIdPoezd(0);
            train.setType("грузовой");
            train.setNpp(0);
            train.setEsrStV("нгенгшрор");
            train.setEsrFinV("нг");
            train.setVesGruz(56);
            train.setUdl(0.1);
            Set<ConstraintViolation<Train>> violationsTrain = validator.validate(train);

            System.out.println("Найдены следующие нарушения: ");
            for (ConstraintViolation<Train> viol : violationsTrain) {
                System.out.println("Нарушение: " + "Поле: " + viol.getPropertyPath() + " значение: " + viol.getInvalidValue() + "   " + viol.getMessage());
            }


            PureTrain pureTrain = new PureTrain();
            pureTrain.setNomTR("222344");
            pureTrain.setIdPoezd(0);
            pureTrain.setType("грузовой");
            pureTrain.setNpp(0);
            pureTrain.setEsrStV("енакенриро");
            pureTrain.setEsrFinV("гш");
            pureTrain.setVesGruz(56);
            pureTrain.setUdl(0.1);

            Set<ConstraintViolation<PureTrain>> violationsPureTrain = validator.validate(pureTrain);

            System.out.println("Найдены следующие нарушения: ");
            for (ConstraintViolation<PureTrain> viol : violationsPureTrain) {
                System.out.println("Нарушение: " + "Поле: " + viol.getPropertyPath() + " значение: " + viol.getInvalidValue() + "   " + viol.getMessage());
            }
        } finally {
            factory.close();
        }
    }
}
