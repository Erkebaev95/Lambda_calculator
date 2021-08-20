import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    // UnaryOperator
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> absAnalog = x -> {
        if  (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    };

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}