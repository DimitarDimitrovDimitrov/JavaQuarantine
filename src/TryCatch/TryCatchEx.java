package TryCatch;

public class TryCatchEx {

    public static void main(String[] args){

            int a = 10, b = 7, c = 5, result;
            try {
                result = a / (b - c);
                System.out.println("result " + result);
            }

            catch (ArithmeticException e) {
                System.out.println("Exception: you can't divide by zero");
            }

            finally {
                System.out.println("I am in final block");
            }
        }
    }

