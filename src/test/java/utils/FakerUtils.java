package utils;

import java.util.concurrent.ThreadLocalRandom;

public class FakerUtils {
    public static String getRandomMonth() {
        String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
        String randomElem = arr[randIdx];
        return randomElem;
    }
}