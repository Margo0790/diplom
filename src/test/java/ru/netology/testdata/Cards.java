package ru.netology.testdata;
import lombok.AllArgsConstructor;
import lombok.Data;

public class Cards {
    @Data
    @AllArgsConstructor
    public class Cards {
        private String number;
        private String month;
        private String year;
        private String cardholder;
        private String cvc;
    }

}
