
public class ArithmeticOperation {

    public static void main(String[] args) {
        ArithmeticExp term1 = new Sum(new Number(3),new Product(new Number(2), new Number(5)));

        ArithmeticExp term2 = new Sum(new Number(5), new Number(6));

        System.out.println("This is the given expression");
        System.out.println(term1);

        System.out.println("This is the evaluated result");
        System.out.println(term1.evaluate());

        System.out.println("This is another expression");
        System.out.println(term2.toString());

                }
                }




