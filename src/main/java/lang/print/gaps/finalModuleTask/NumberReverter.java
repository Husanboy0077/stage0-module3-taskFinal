package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a = number % 10;
        int c = number % 100;
        int d = c / 10;
        int b = number / 100;
        int result = a*100+d*10+b;
        System.out.println(result);
    }
}
