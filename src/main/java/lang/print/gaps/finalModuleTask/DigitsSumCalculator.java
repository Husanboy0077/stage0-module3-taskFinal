package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number % 10;
        int b = number % 100;
        int c = b / 10;
        int e = number % 1000;
        int f = e / 100;
        int d =number / 1000;
        int sum = a+f+c+d;
        System.out.println(sum);

    }
}
