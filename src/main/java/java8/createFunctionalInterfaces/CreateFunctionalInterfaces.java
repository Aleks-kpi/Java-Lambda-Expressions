package java8.createFunctionalInterfaces;

public class CreateFunctionalInterfaces {
    public static void main(String[] args) {
        //example of passing multiple values to a method using lambda
        //notice that I do NOT have a data type of a and b

        Calculate add = (a, b) -> a + b;
        Calculate difference = (a, b) -> Math.abs(a-b);
        Calculate divide = (a, b) -> (b != 0 ? a/b : 0);
        Calculate multiple = (a, b) -> a * b;

        System.out.println(add.calc(3 ,2));
        System.out.println(difference.calc(5, 10));
        System.out.println(divide.calc(5, 0));
        System.out.println(multiple.calc(5, 3));
    }
}
