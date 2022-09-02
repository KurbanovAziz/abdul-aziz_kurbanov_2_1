import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ageTemperature(21, -10);
        ageTemperature(19, 0);
        ageTemperature(50, 25);
        ageTemperature(65, 0);
        ageTemperature(70, -100);
        ageTemperature(generateRandomAge(), -10);

    }

    public static String ageTemperature(int age, int temperature) {

        if ((age >= 20 || age == 45) && (temperature >= -20 || temperature == 30)) {
            goToWalk();
        } else if (age < 20 && (temperature >= 0 || temperature == 28)) {
            goToWalk();
        } else if (age > 45 && (temperature >= -10 || temperature == 25)) {
            goToWalk();
        } else {
            System.out.println("Оставайся дома");
        }

        return "";

    }


    public static void goToWalk() {
        System.out.println("Можно идти гулять");

    }

    public static int generateRandomAge() {
        int minAge = 0;
        int maxAge = 100;
        int diff = maxAge - minAge;
        Random randomAge = new Random();
        int ageRandom = randomAge.nextInt(diff + 1) + minAge;
        return ageRandom;

    }
}