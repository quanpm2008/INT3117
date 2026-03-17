package org.example;

public class CaculateInsuranceFee {
    public static int calculate_insurance_fee(int age, int experience, boolean accident_history) {
        if (age < 18 || age > 100 || experience < 0 || experience > age - 18) {
            return -1;
        }
        int result = 0;

        if (age < 25) {
            result += 2500;
        } else if (age <= 60) {
            result += 1000;
        } else {
            result += 1500;
        }

        if (experience < 2) {
            result += 500;
        }  else if (experience >= 10) {
            result -= 200;
        }

        if (accident_history) {
            result += 700;
        }


        return result;

    }



}
