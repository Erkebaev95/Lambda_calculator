public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 2);
        int c = calc.devide.apply(b, a);
        calc.println.accept(c);

        int x = calc.absAnalog.apply(2);
        int y = calc.pow.apply(3);
        calc.println.accept(x);
        calc.println.accept(y);

        boolean z = calc.isPositive.test(1);
        System.out.println(z);
    }
}
