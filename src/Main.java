import lambda.*;

public class Main {
    public static void main(String[] args) {

        GetCharAndString getCharAndString = (str, ch) -> LambdaHelperClass.isCharInString(str, ch);
        SmallThePowerOfBig smallThePowerOfBig = (a, b) -> LambdaHelperClass.smallThePowerOfBig(a, b);
        GetAndReturnInt getAndReturnInt = (num) -> num * 2;
        GetIntAndLambda getIntAndLambda = (num, lambdaFunction) -> System.out.println(lambdaFunction.returnInt(num));
        PrintFive printFive = () -> System.out.println(5);
    }
}
