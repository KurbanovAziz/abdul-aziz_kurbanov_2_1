import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String resultOne = ageTemperature(21, -10);
        String resultTwo = ageTemperature(19, 0);
        String resultThree = ageTemperature(50, 25);
        String resultFour = ageTemperature(65, 0);
        String resultHome = ageTemperature(70, -100);
        String resultRandom = ageTemperature(generateRandomAge(), -10);
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
        System.out.println(resultHome);
        System.out.println(resultRandom);

    }

    public static String ageTemperature(int age, int temperature) {

        if ((age >= 20 || age == 45) && (temperature >= -20 || temperature == 30)) {
            return goToWalk();
        } else if (age < 20 && (temperature >= 0 || temperature == 28)) {
            return goToWalk();
        } else if (age > 45 && (temperature >= -10 || temperature == 25)) {
            return goToWalk();
        } else {
            return goToHome();
        }
    }


    public static String goToWalk() {
        return "Можно идти гулять";

    }
    public static String goToHome() {
        return "Оставайся дома";
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