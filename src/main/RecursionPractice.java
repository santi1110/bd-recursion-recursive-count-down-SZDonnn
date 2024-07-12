package main;

public class RecursionPractice {

    /**
     * Test main to output the results of our CountDown recursion method.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        RecursiveCountDown recursiveCountDown = new RecursiveCountDown();
        int target = 3;
        String result = recursiveCountDown.countDown(target);
        System.out.println(result);
    }
}