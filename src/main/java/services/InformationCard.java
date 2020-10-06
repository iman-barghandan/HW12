package services;

import java.util.Random;

public class InformationCard {
    Random random = new Random();

    public String getCardNumber() {
        String number12 = "";

        for (int i = 0; i < 12; i++) {
            int number = random.nextInt(10);
            number12 = number12 + number;
        }
        return number12;
    }

    public String getCVV2() {
        String numberCVV2 = "";

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(10);
            numberCVV2 = numberCVV2 + number;
        }
        return numberCVV2;
    }

    public String ExpirationDate() {
        String expirationDate = "140";
        int number = random.nextInt(3);
        expirationDate = expirationDate + number;
        return expirationDate;
    }
}
